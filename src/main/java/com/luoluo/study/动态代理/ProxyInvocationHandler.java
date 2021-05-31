package com.luoluo.study.动态代理;

import org.springframework.util.CollectionUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


//动态代理类
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method.getName().concat("---").concat(method.getParameters()[0].getName()));
        Object result = method.invoke(target, args);
        after(method.getName()+"结束了");
        return result;
    }

    private void before(String msg){
        System.out.println("before----"+msg);
    }

    private void after(String msg){
        System.out.println("after----"+msg);

    }


}
