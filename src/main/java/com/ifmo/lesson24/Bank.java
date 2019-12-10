package com.ifmo.lesson24;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.*;

public class Bank {
    private Map<Long, User> users = new ConcurrentHashMap<>();
    private List<Account> accounts = new CopyOnWriteArrayList<>();


    private class User {
        private final long id;
        private final String name;

        private User(long id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    private static class Account {
        private final long id;
        private final long userId;
        private long amount;

        private Account(long id, long userId, long amount) {
            this.id = id;
            this.userId = userId;
            this.amount = amount;
        }
    }

    private class Transaction {
        private final BigInteger transactionId;
        private final long fromAccountId;
        private final long toAccountId;
        private final long amount;
        private boolean success;

        private Transaction(long fromAccountId, long toAccountId, long amount, boolean success) {
            this.success = success;
            this.transactionId = new BigInteger("" + System.currentTimeMillis() + fromAccountId + toAccountId + amount);
            this.fromAccountId = fromAccountId;
            this.toAccountId = toAccountId;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "transactionId=" + transactionId +
                    ", fromAccountId=" + fromAccountId +
                    ", toAccountId=" + toAccountId +
                    ", amount=" + amount +
                    ", success=" + success +
                    '}';
        }
    }

    public static void main(String[] args) {
        // 1. Сгенерируйте пользователей и их аккаунты (все идентификаторы должны быть уникальны).
        Bank bank = new Bank();
        bank.accounts.add(new Account(1, 1, 1000));
        bank.accounts.add(new Account(2, 2, 2000));
// 2. Переводите деньги со случайного аккаунта на случайный в 100 потоках.
// Другими словами, создайте 100 потоков или пул из 100 потоков, в которых
// выполните перевод вызовом метода transferMoney().

        ExecutorService pool = new ThreadPoolExecutor(
                100, // основное количество потоков
                100, // максимальное количество потоков
                2, // как долго избыточные потоки могут простаивать
                TimeUnit.MINUTES,
                new LinkedBlockingQueue<>() // очередь для задач
        );
        for (int i = 0; i < 100; i++) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                        bank.transferMoney(bank.accounts.get(0), bank.accounts.get(1), 1);                }
            });
        }
        pool.shutdown();

        System.out.println(bank.accounts.get(0).amount);
        System.out.println(bank.accounts.get(1).amount);
    }


    BlockingDeque<Transaction> queue = new LinkedBlockingDeque<>();

    // TODO Самая главная часть работы!
    public void transferMoney(Account from, Account to, long amount)  {
        Transaction transaction = new Transaction(from.id,to.id,amount,true);
        // 1. Атомарно и потокобезопасно перевести деньги в количестве 'amount' со счёта 'from' на счёт 'to'.
        queue.add(transaction);
        from.amount -= amount;

        Transaction take = null;
        try {
            take = queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            transaction.success  = false;
        }
        to.amount +=take.amount;
        System.out.println(take.toString());



// 2. Создать объект Transaction, содержащий информацию об операции и отправить в очередь
// потоку Logger, который проснётся и напечатает её.
    }
}
