package com.concurrent.example;

public class MyThread implements  Runnable{
    @Override
    public void run() {
        int counter= 10;
        while(counter>0) {
            System.out.println("Running - "+counter);
            counter--;
        }
    }
}
