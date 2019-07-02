package com.wip.service.meta.impl;

public class MetaServiceImplDriver1 {


    public static boolean UT_TC_01_02_01;
    public static boolean UT_TC_01_02_02;
    public static boolean UT_TC_01_02_03;
    public static boolean UT_TC_01_02_04;
    public static boolean UT_TC_01_02_05;
    public static boolean UT_TC_01_02_06;


    public static void main(String[] args) {
        MetaServiceImplStub1 test = new MetaServiceImplStub1();
        if(test.UT_TC_01_02_01()){
            UT_TC_01_02_01 = true ;
        }
        if(test.UT_TC_01_02_02()){
            UT_TC_01_02_02 = true ;
        }
        if(test.UT_TC_01_02_03()){
            UT_TC_01_02_03 = true ;
        }
        if(test.UT_TC_01_02_04()){
            UT_TC_01_02_04 = true;
        }
        if(test.UT_TC_01_02_05()){
            UT_TC_01_02_05 = true;
        }
        if(test.UT_TC_01_02_06()){
            UT_TC_01_02_06 = true;
        }

        System.out.println("UT_TC_01_02_01 "+UT_TC_01_02_01);
        System.out.println("UT_TC_01_02_02 "+UT_TC_01_02_02);
        System.out.println("UT_TC_01_02_03 "+UT_TC_01_02_03);
        System.out.println("UT_TC_01_02_04 "+UT_TC_01_02_04);
        System.out.println("UT_TC_01_02_05 "+UT_TC_01_02_05);
        System.out.println("UT_TC_01_02_06 "+UT_TC_01_02_06);


    }

}
