package com.wip.dao;


import com.wip.model.ContentDomain;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;

import java.io.InputStream;


@MapperScan("com.wip.dao")
public class GetArticleByTagsStub {


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


    public boolean isExistInDB(int testid){
        if(testid>=1&&testid<=60){
            return true;
        }
        return false;
    }

    public boolean test(Object cid){
        if(cid == null){
            System.out.println("参数不能为空");
            return false;
        }
        else {
            if(isExistInDB((int)cid)){
                System.out.println("测试成功");
                return true;
            }else{
                System.out.println("输入参数在数据库中查询不到，测试失败");
                return false;
            }
        }
    }

    public boolean IT_TD_006_001(){

        ContentDomain testDomain = mapper.getArticleById(null);
        if(testDomain==null){
            System.out.println("输入参数为空");
            return false;
        }
        return true;
    }

    public boolean IT_TD_006_002(){
        ContentDomain testDomain = mapper.getArticleById(40);
        if(testDomain==null){
            System.out.println("参数在数据库中不存在");
            return false;
        }
        return true;
    }

    public boolean IT_TD_006_003(){
        ContentDomain testDomain = mapper.getArticleById(34);
        if(testDomain==null){
            System.out.println("测试成功");
            return true;
        }
        return false;
    }

}
