package com.singleton;

public class Singleton {

    public static int status = 1;

    private Singleton(){
        System.out.println("Singleton is create");
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.status);
    }
}
