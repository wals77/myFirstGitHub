package com.mythread;

import java.util.concurrent.locks.ReentrantLock;

public class FairLock implements Runnable {


    public static ReentrantLock fairLock = new ReentrantLock(true);

    @Override
    public void run() {

        while (true){
            try {
                fairLock.lock();
                System.out.println(Thread.currentThread().getName()+"获取锁");
            } finally {
                fairLock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        FairLock fL = new FairLock();
        Thread t1 = new Thread(fL, "t1");
        Thread t2 = new Thread(fL, "t2");
        t1.start();t2.start();
    }





}
