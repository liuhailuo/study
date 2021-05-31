package com.luoluo.study.桥接模式;

public abstract class Computer {

    protected Brands brands;

    public Computer(Brands brands) {
        this.brands = brands;
    }

    public void info() {
        brands.info();
    }
}

class DeskTop extends Computer {

    public DeskTop(Brands brands) {
        super(brands);
    }

    @Override
    public void info() {
        System.out.println("平板");
    }
}
class Mini extends Computer {

    public Mini(Brands brands) {
        super(brands);
    }

    @Override
    public void info() {
        System.out.println("Mini");
    }
}