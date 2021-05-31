package com.luoluo.study.桥接模式;

public class Test {

    public static void main(String[] args) {

        Computer computer1 = new DeskTop(new Apple());
        computer1.info();
        Computer computer2 = new Mini(new Lenvo());
        computer2.info();

    }
}
