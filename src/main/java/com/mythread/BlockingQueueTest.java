package com.mythread;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 阻塞队列测试
 */
public class BlockingQueueTest {

    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(10);

        for (int i = 0; i < 20; i++ ){

            queue.offer(new Student("liu"+i,1+i));
        }
        System.out.println(queue.size());
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()){
            Student next = (Student) iterator.next();
            System.out.println(next.name);
        }

    }

    static class Student {

        public String name;

        public Integer age;

        public Student(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }
}


