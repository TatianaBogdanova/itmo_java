package com.ifmo.lesson22;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ProduserConsumer {
    static final String POISON_PILL = new String();

    public static class Produser implements Runnable {
        public BlockingDeque<String> queue;

        @Override
        public void run() {
            Integer i = 0;
            while (i < 4) {
                i++;
                    queue.add(i.toString());
            }
                queue.add(POISON_PILL);
        }

        public Produser(BlockingDeque<String> queue) {
            this.queue = queue;
        }
    }

    public static class Consumer implements Runnable {
        public BlockingDeque<String> queue;

        @Override
        public void run() {
                try {
                    while (
                            queue.take() != POISON_PILL
                    ) {
                        System.out.println("Do this");
                    }
                        System.out.println("POISON_PILL");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }

        public Consumer(BlockingDeque<String> queue) {
            this.queue = queue;
        }
    }


    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<String> queue = new LinkedBlockingDeque<>();
        Thread produser = new Thread(new Produser(queue));
        Thread consumer = new Thread(new Consumer(queue));

        produser.start();
        consumer.start();

        produser.join();
        consumer.join();

    }
}
