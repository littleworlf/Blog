package com.wip.dao;

public class GetArticleByTagsDriver {

    public static void main(String[] args) throws Exception {
        GetArticleByTagsStub test = new GetArticleByTagsStub();
        test.setUp();
        System.out.println("IT_TD_006_001 测试结果 "+ test.IT_TD_006_001());
        System.out.println();
        System.out.println("IT_TD_006_002 测试结果 "+ test.IT_TD_006_002());
        System.out.println();
        System.out.println("IT_TD_006_003 测试结果 "+ test.IT_TD_006_003());
        System.out.println();
    }

}
