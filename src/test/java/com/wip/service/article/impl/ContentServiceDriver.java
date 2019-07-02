package com.wip.service.article.impl;

public class ContentServiceDriver {


    public static void main(String[] args) throws Exception {
        ContentServiceStub test = new ContentServiceStub();
        test.setUp();
        System.out.println("IT_TD_004_001:"+test.IT_TD_004_001());
        System.out.println();
        System.out.println("IT_TD_004_002:"+test.IT_TD_004_002());
        System.out.println();
        System.out.println("IT_TD_004_003:"+test.IT_TD_004_003());
        System.out.println();
        System.out.println("IT_TD_004_004:"+test.IT_TD_004_004());

    }
}
