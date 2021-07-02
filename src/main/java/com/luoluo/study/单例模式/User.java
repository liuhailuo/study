package com.luoluo.study.单例模式;


public class User {
    private static final User INSTANCE = new User();

    private User() {

    }

    private static User getInstance() {
        return INSTANCE;
    }


    public void m() {
        System.out.println("单例模式");
    }

    public static void main(String[] args) {
        User instance = User.getInstance();
        User instance1 = User.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());

    }

}
