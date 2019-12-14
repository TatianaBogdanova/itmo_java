package com.ifmo.lesson24;


public class ClassWork {
        static final String POISON_PILL = new String();

        public static class Produser implements Runnable {
            public MyBlockingDeque<String> queue;

            @Override
            public void run() {
                Integer i = 0;
                while (i < 3000) {
                    i++;
                    queue.add(i.toString());
                }
                queue.add(POISON_PILL);
            }

            public Produser(MyBlockingDeque<String> queue) {
                this.queue = queue;
            }
        }

        public static class Consumer implements Runnable {
            public MyBlockingDeque<String> queue;

            @Override
            public void run() {
                String text;
                while ( (text =queue.take()) != POISON_PILL) {
                        System.out.println(text);
                }
            }

            public Consumer(MyBlockingDeque<String> queue) {
                this.queue = queue;
            }
        }


        public static void main(String[] args) throws InterruptedException {
            MyBlockingDeque<String> queue = new MyBlockingDeque<>();
            Thread produser = new Thread(new Produser(queue));
            Thread consumer = new Thread(new Consumer(queue));
            Thread consumer2 = new Thread(new Consumer(queue));

            produser.start();
            consumer.start();

            produser.join();
            consumer.join();
            consumer2.join();

        }
}
