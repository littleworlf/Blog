package com.wip.utils;

import io.swagger.models.auth.In;

import java.util.Random;

public class UUID_random_stub extends UUID{


    public static int min;
    public static int max;

    static Random r = new Random();

    public static boolean test(Object min, Object max){
        if(min==null||max==null){
            System.out.println("参数为空");
            return false;
        }
        else if(!(min instanceof Integer)||!(max instanceof Integer)){
            System.out.println("参数不为int类型");
            return false;
        } else if((int)min>(int)max){
            System.out.println("参数大小错误");
            return false;
        }
        return true;
    }

    public static int randomtest(Object min, Object max) {
        if(test(min,max)){
            System.out.println("测试成功");
            return r.nextInt((int)max - (int)min + 1) + (int)min;
        }
        return -1;
    }


    public  boolean UT_TC_02_01_01(){
        boolean successful=false;
        int result = randomtest(3,null);
        if(result>=min && result<=max){
            successful = true;
        }

        return successful;
    }

    public boolean UT_TC_02_01_02(){
        boolean successful = false;
        int result = randomtest(null,200);
        if(result>=min&& result <=max){
            successful = true;
        }
         return successful;
    }

    public boolean UT_TC_02_01_03(){
        boolean successful  =false;
        int result = randomtest(3.1,200);
        if(result>=min && result <=max){
            successful = true;
        }

        return successful;
    }

    public boolean UT_TC_02_01_04(){
        boolean successful = false;
        int result = randomtest(3,"hello");
        if(result>=min&& result <=max){
            successful = true;
        }

        return successful;
    }

    public boolean UT_TC_02_01_05(){
        boolean successful = false;
        int result = randomtest(6.2,"test");
        if(result>=min&& result <=max){
            successful = true;
        }

        return successful;
    }

    public boolean UT_TC_02_01_06(){
        boolean successful = false;
        int result = randomtest(200,20);

        return false;
    }

    public boolean UT_TC_02_01_07(){
        boolean successful = false;
        int result = randomtest(20,300);
        if(result>=min&& result <=max){
            successful = true;
        }

        return successful;
    }


}
