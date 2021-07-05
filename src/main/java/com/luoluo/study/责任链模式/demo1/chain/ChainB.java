package com.luoluo.study.责任链模式.demo1.chain;


import com.luoluo.study.责任链模式.demo1.handler.ChainHandler;

public class ChainB extends ChainHandler {

    @Override
    public void handleRequest(String name) {
        if ("B".equals(name)) {
            System.out.println("BBBBBBBBBBBB");
        } else {
            System.out.println("B：我已经审批了，让C 审批....");
            super.getNextChainHandler().handleRequest(name);
        }
    }
}
