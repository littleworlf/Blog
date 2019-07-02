package com.wip.service.meta.impl;

public class MetaServiceImplDriver {

    public static boolean UT_TC_01_01_01 = false;
    public static boolean UT_TC_01_01_02 = false;
    public static boolean UT_TC_01_01_03 = false;
    public static boolean UT_TC_01_01_04 = false;
    public static boolean UT_TC_01_01_05 = false;

    public static void main(String[] args) {
        MetaServiceImplStub test  =new MetaServiceImplStub();
        if(test.UT_TC_01_01_01()){
            UT_TC_01_01_01 = true;
        }
        if(test.UT_TC_01_01_02()){
            UT_TC_01_01_02 = true;
        }
        if(test.UT_TC_01_01_03()){
            UT_TC_01_01_03= true;
        }
        if(test.UT_TC_01_01_04()){
            UT_TC_01_01_04 = true;
        }
        if(test.UT_TC_01_01_05()){
            UT_TC_01_01_05  =true;
        }


        System.out.println("TestCase1's result "+UT_TC_01_01_01);

        System.out.println("TestCase2's result "+UT_TC_01_01_02);

        System.out.println("TestCase3's result "+UT_TC_01_01_03);

        System.out.println("TestCase4's result "+UT_TC_01_01_04);

        System.out.println("TestCase5's result "+UT_TC_01_01_05);

    }

}
