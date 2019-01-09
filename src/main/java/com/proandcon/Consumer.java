package com.proandcon;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<PcData> queue;

    private static final int sleeptime = 1000;

    public Consumer(BlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start consumer id="+Thread.currentThread().getId());
        Random r = new Random();
        try {
            while (true){
                PcData data = queue.take();
                if (null != data){
                    int re = data.getData()*data.getData();
                    System.out.println( data.getData()+"*"+ data.getData()+"="+
                            re);
                    Thread.sleep(r.nextInt(sleeptime));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
