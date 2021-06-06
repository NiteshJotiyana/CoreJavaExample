package com.concurrent.example;

public class ThreadRunner {

    public static void main(String[] args) {
        new ThreadRunner();
    }

    public ThreadRunner()
    {
        //Runnable Instance
        MyThread instance = new MyThread();

        Thread t = new Thread(instance);
        t.start();
    }
}
