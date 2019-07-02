package com.wip.dao;

import com.wip.model.ContentDomain;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.mybatis.spring.annotation.MapperScan;

import java.io.InputStream;

@MapperScan("com.wip.dao")
public class DeleteByCidTestStub {


    private ContentDao mapper;

    // 此方法是在执行@Test标注的方法之前执行
    private SqlSessionFactory sqlSessionFactory;
    public void setUp() throws Exception {
//        ContentDao mapper;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建SqlSessionFcatory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        mapper = sqlSession.getMapper(ContentDao.class);
    }

    public boolean test(Object para){

        if(para==""){
            System.out.println("输入参数不能为空");
            return false;
        }
        else {
            if(!(para instanceof Integer)){
                System.out.println("输入参数不为int类型");
                return false;
            }else{
                if((int)para>=1000){
                    System.out.println("输入参数在数据库中不存在");
                    return false;
                }
                if((int)para<0) {
                    System.out.println("输入参数不能为负数");
                    return false;
                }
                if((int)para==0){
                    System.out.println("输入参数不能为0");
                    return false;
                }
                else {
                    System.out.println("测试成功");
                    return true;
                }
            }
        }
    }

    public Boolean IT_TD_005_001(){
        ContentDomain testDomain = mapper.getArticleById(null);
        if(testDomain==null){
            System.out.println("输入参数为空");
            return true;
        }
        return false;
    }

    public boolean IT_TD_005_002(){
        boolean result = test("case");
        return result;
    }
    public boolean IT_TD_005_003(){
        ContentDomain testDomain = mapper.getArticleById(120);
        if(testDomain==null){
            System.out.println("在数据库中不存在");
            return true;
        }
        return false;
    }

    public boolean IT_TD_005_004(){

        ContentDomain testDomain = mapper.getArticleById(-20);
        if(testDomain==null){
            System.out.println("输入参数不能为负");
            return true;
        }
        return false;
    }
    public boolean IT_TD_005_005(){
        ContentDomain testDomain = mapper.getArticleById(0);
        if(testDomain==null){
            System.out.println("输入参数不能为0");
            return true;
        }
        return false;
    }
    public boolean IT_TD_005_006(){
        ContentDomain testDomain = mapper.getArticleById(37);
        if(testDomain==null){
            System.out.println("测试成功");
            return true;
        }
        return false;
    }

}
