package com.wip.service.article.impl;

import com.wip.dao.ContentDao;
import com.wip.model.ContentDomain;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;

import java.io.InputStream;


@MapperScan("com.wip.dao")
public class ContentServiceStub {

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

    private  ContentDomain domain;

    public static boolean test(ContentDomain test){
        if(test==null){
            System.out.println("输入参数为空");
            return false;
        }else{
            if(test.getTitle()==null&&test.getTags()==null&&test.getCid()==null){
                System.out.println("文章不存在");
                return false;
            }
            else if(test.getCid()==null && test.getTitle()!=null&&test.getTags()!=null){
                System.out.println("文章ID不存在");
                return false;
            }else if(test.getCid()!=null && test.getTitle()!=null&&test.getTags()!=null){
                System.out.println("测试成功");
                return true;
            }
        }
        return true;
    }

    public  boolean IT_TD_004_001(){
        ContentDomain testDomain = mapper.getArticleById(null);
        if(testDomain==null){
            System.out.println("参数为空");
            return false;
        }
        return true;
    }

    public  boolean IT_TD_004_002(){

        ContentDomain testDomain = new ContentDomain();
        testDomain.setTags("");
        testDomain.setTitle("");
        boolean result = test(testDomain);
        return result;
    }
    public  boolean IT_TD_004_003(){
        ContentDomain testDomain = new ContentDomain();
        testDomain.setTags("");
        testDomain.setTitle("");

        boolean result =test(testDomain);
        return result;
    }
    public  boolean IT_TD_004_004(){
        ContentDomain testDomain = new ContentDomain();
        testDomain.setCid(36);
        testDomain.setTags("season");
        testDomain.setTitle("Summer");

        boolean result =test(testDomain);
        return result;

    }
}

