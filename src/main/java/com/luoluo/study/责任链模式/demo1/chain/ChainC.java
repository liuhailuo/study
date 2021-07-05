package com.luoluo.study.责任链模式.demo1.chain;

import com.luoluo.study.责任链模式.demo1.handler.ChainHandler;

public class ChainC extends ChainHandler {

    @Override
    public void handleRequest(String name) {
        System.out.println("大家都处理不了只能我来处理了");
    }
}
