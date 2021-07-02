package com.luoluo.study.单例模式;

public class User01 {

    private static User01 INSTANCE = null;


    private User01() {

    }

    public static User01 getInstance() {
        if (INSTANCE == null) {
            synchronized (User01.class){
                if(INSTANCE == null ){
                    INSTANCE = new User01();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000 ; i++) {
            new Thread( ()->{
                System.out.println(User01.getInstance().hashCode()
                );
            }).start();
        }

    }

}
