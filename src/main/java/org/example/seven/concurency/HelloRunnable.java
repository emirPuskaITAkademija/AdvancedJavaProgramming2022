package org.example.seven.concurency;

public class HelloRunnable implements Runnable{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println("Pozdrav svima. Pozdravlja vas: " + thread.getName());
    }
}
