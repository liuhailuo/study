package com.luoluo.study.责任链模式.demo1.chain;


import com.luoluo.study.责任链模式.demo1.handler.ChainHandler;

public class ChainA extends ChainHandler {
    @Override
    public void handleRequest(String name) {
        if ("A".equals(name)) {
            System.out.println("AAAAAAAAAAA");
        } else {
            System.out.println("A：我已经审批了，让B 审批....");
            super.getNextChainHandler().handleRequest(name);
        }
    }
}
