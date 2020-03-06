package com.company;

public class Runner extends Thread {
    private int num = 1;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void run() {
        if (getNum() - 1 == 5) {
            System.out.println(getName() + " берет палочку");
            System.out.println(" Runner 5 идет к финишу ");
            System.out.println(getName() + " бежит к Runner 4");
        } else if (getNum() == 0) {
            System.out.println(getName() + " бежит к Runner " + getNum());
            System.out.println(" Runner " + getNum() + " берет палочку");
        } else {
            System.out.println(getName() + " берет палочку");
            System.out.println(getName() + " бежит к Runner " + getNum());
        }
        try {
            sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }finally {
            if (getNum() == 1){
                System.out.println(" Runner 1 берет палочку");
            }
        }
    }
}

