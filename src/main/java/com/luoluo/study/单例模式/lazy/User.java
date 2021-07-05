package com.luoluo.study.单例模式.lazy;

public class User {

    private static boolean flag = false;


    private User() {
        synchronized (User.class) {
            if (!flag) {
                flag = !flag;
            }
        }
    }

    //static 是为了使单例的空间共享
    //final 保证这个方法不会被重写，重载
    public static  final User getInstance() {
        return UserHolder.INSTANCE;
    }


    private static class UserHolder {
        private static final User INSTANCE = new User();
    }

}
