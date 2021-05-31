package com.luoluo.study.动态代理;

public class UserServiceImpl implements UserService{

    @Override
    public void add(String param) {
        System.out.println("新增了一个用户".concat(param));
    }

    @Override
    public void delete(String param) {
        System.out.println("新增了一个用户".concat(param));
    }

    @Override
    public void update(String param) {
        System.out.println("新增了一个用户".concat(param));
    }

    @Override
    public void query(String param) {
        System.out.println("新增了一个用户".concat(param));
    }
}
