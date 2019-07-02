package com.wip.utils;

import static com.wip.utils.UUID.UU32;
import static com.wip.utils.UUID.UU64;

public class UUID_UU64_stub {


    private static final char[] _UU64 = "-0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ_abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] _UU32 = "0123456789abcdefghijklmnopqrstuv".toCharArray();


    public boolean test(Object uu){
        if(uu==null){
            System.out.println("参数为空");
            return false;
        }else if(!(uu instanceof java.util.UUID)){
            System.out.println("参数类型错误");
            return false;
        }
        return true;
    }

    public static String TestUU64() {
        return UU64(java.util.UUID.randomUUID());
    }

    public boolean UT_TC_02_02_01(){

        boolean successful = false;
        if(!test(null)){
            return false;
        }
        return true;
    }


    public boolean UT_TC_02_02_02(){
        if(!test("dwad--ad!+=adawd")){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        UUID_UU64_stub test =new UUID_UU64_stub();
        System.out.println(test.UT_TC_02_02_04());
    }

    public boolean UT_TC_02_02_03(){
        if(!test(UU32())){
            return false;
        }
        return true;
    }

    public boolean UT_TC_02_02_04(){
        if(!test(TestUU64())){
            return false;
        }
        return  true;
    }


}
