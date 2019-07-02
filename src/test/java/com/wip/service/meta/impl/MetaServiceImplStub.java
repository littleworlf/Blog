package com.wip.service.meta.impl;

public class MetaServiceImplStub {

    public static final boolean StringUtils_isNotBlank_type = false;
    public static final boolean StringUtils_isNotBlank_name = false;
    public static final boolean isMetasNULL = false;
    public static final boolean isMetaSizezero = false;
    public static final boolean isMetaNULL = false;

    public  boolean testForThis(boolean condition_a,boolean condition_b,boolean condition_c){
        if(condition_a){
            if(condition_b){
                if(condition_c){
                    return true;
                }else {
                    return  false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public  boolean UT_TC_01_01_01(){
        boolean succcessful = testForThis((!StringUtils_isNotBlank_name)&&StringUtils_isNotBlank_type,
                isMetasNULL,!isMetaNULL);
        return succcessful;
    }
    public  boolean UT_TC_01_01_02(){
        boolean succcessful = testForThis((!StringUtils_isNotBlank_type)&&StringUtils_isNotBlank_name,
                isMetasNULL,!isMetaNULL);
        return succcessful;
    }
    public  boolean UT_TC_01_01_03(){
        boolean succcessful = testForThis((!StringUtils_isNotBlank_type)&&StringUtils_isNotBlank_name,
                !isMetasNULL&&!isMetaSizezero,!isMetaNULL);
        return succcessful;
    }
    public  boolean UT_TC_01_01_04(){
        boolean succcessful = testForThis(StringUtils_isNotBlank_type&&StringUtils_isNotBlank_name,
                isMetasNULL||isMetaSizezero,!isMetaNULL);
        return succcessful;
    }
    public  boolean UT_TC_01_01_05(){
        boolean succcessful = testForThis(StringUtils_isNotBlank_type&&StringUtils_isNotBlank_name,
                isMetasNULL||isMetaSizezero,isMetaNULL);
        return succcessful;
    }

}
