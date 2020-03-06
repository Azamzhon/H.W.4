package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        for (int i = 1; i < 6; i++) {
            Runner runner = new Runner();
            runner.setName(" Runner " + i);
            runner.setNum(i + 1);
            runner.start();
            runner.join();
        }
        for (int i = 4; i > 1; i--) {
            Runner runner = new Runner();
            runner.setName(" Runner " + i);
            runner.setNum(i - 1);
            runner.start();
            runner.join();
        }
    }
}
