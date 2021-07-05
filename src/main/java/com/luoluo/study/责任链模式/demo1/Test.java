package com.luoluo.study.责任链模式.demo1;

import com.luoluo.study.责任链模式.demo1.chain.ChainA;
import com.luoluo.study.责任链模式.demo1.chain.ChainB;
import com.luoluo.study.责任链模式.demo1.chain.ChainC;


public class Test {
    // 需求 使用于 比较固定的流程审批 流程审批  A-》B -》C



    public static void main(String[] args) {
        new Test().executorChain("V");
    }


    public void executorChain(String name) {
        ChainA chainA = new ChainA();
        ChainB chainB = new ChainB();
        ChainC chainC = new ChainC();
        chainA.setNextChain(chainB);
        chainB.setNextChain(chainC);
        chainA.handleRequest(name);

    }

}
