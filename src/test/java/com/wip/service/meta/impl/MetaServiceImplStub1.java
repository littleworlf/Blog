package com.wip.service.meta.impl;

public class MetaServiceImplStub1 {


    public static boolean midIsNull = false;
    public static boolean metaIsNull = false;
    public static boolean relationShipIsNull = false;
    public static boolean articleIsNull = false;
    public static boolean typeIsProper = false;


    public boolean test(boolean con_a,boolean con_b,boolean con_c,boolean con_d,boolean con_e){
        if(con_a){
            if(con_b){
                if(con_c){
                    if(con_d){
                        if(con_e){
                            return true;
                        }else {
                            return false;
                        }
                    }else {
                        return false;
                    }
                }else {
                    return false;
                }
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public boolean UT_TC_01_02_01(){
        boolean passed;
        midIsNull = false;
        metaIsNull = true;
        relationShipIsNull  =true;
        articleIsNull  = true;
        typeIsProper = true;
        passed = test(midIsNull,metaIsNull,relationShipIsNull,articleIsNull,typeIsProper);
        return passed;
    }

    public boolean UT_TC_01_02_02(){
        boolean passed;
        midIsNull = true;
        metaIsNull = false;
        relationShipIsNull  =true;
        articleIsNull  = true;
        typeIsProper = true;
        passed = test(midIsNull,metaIsNull,relationShipIsNull,articleIsNull,typeIsProper);
        return passed;
    }

    public boolean UT_TC_01_02_03(){
        boolean passed;
        midIsNull = true;
        metaIsNull = true;
        relationShipIsNull  =false;
        articleIsNull  = true;
        typeIsProper = true;
        passed = test(midIsNull,metaIsNull,relationShipIsNull,articleIsNull,typeIsProper);
        return passed;
    }

    public boolean UT_TC_01_02_04(){
        boolean passed ;
        midIsNull = true;
        metaIsNull = true;
        relationShipIsNull  =true;
        articleIsNull  = false;
        typeIsProper = true;
        passed = test(midIsNull,metaIsNull,relationShipIsNull,articleIsNull,typeIsProper);
        return passed;
    }


    public boolean UT_TC_01_02_05(){
        boolean passed ;
        midIsNull = true;
        metaIsNull = true;
        relationShipIsNull  =true;
        articleIsNull  = true;
        typeIsProper = false;
        passed = test(midIsNull,metaIsNull,relationShipIsNull,articleIsNull,typeIsProper);
        return passed;
    }

    public boolean UT_TC_01_02_06(){
        boolean passed;
        midIsNull = true;
        metaIsNull = true;
        relationShipIsNull  =true;
        articleIsNull  = true;
        typeIsProper = true;
        passed = test(midIsNull,metaIsNull,relationShipIsNull,articleIsNull,typeIsProper);
        return passed;
    }



    /*


    1.mid ==1
2.meta !=null
3.null != relationShips && relationShips.size() > 0
4.null ！= article
5.!type.equals(Types.CATEGORY.getType())

     */
}
