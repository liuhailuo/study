package com.luoluo.study.责任链模式.demo1.handler;

public abstract class ChainHandler {

    private ChainHandler chainHandler;

    public abstract void handleRequest(String name);

    // 指定下个执行链
    public void setNextChain(ChainHandler chain) {
        this.chainHandler = chain;
    }

    // 获取当前的链
    public ChainHandler getNextChainHandler() {
        return chainHandler;
    }
}
