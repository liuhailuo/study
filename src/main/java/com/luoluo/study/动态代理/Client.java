package com.luoluo.study.动态代理;

public class Client {


    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.add("add");
    }
}
