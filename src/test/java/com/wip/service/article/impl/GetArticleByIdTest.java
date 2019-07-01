package com.wip.service.article.impl;

import com.wip.dao.CommentDao;
import com.wip.dao.ContentDao;
import com.wip.model.CommentDomain;
import com.wip.model.ContentDomain;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;

import static org.junit.Assert.*;



@MapperScan("com.wip.dao")
public class GetArticleByIdTest {


    @Autowired
    private ContentDao mapper;
    // 此方法是在执行@Test标注的方法之前执行
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建SqlSessionFcatory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        mapper = sqlSession.getMapper(ContentDao.class);
    }



    @Test
    public void UT_TC_03_02_01() throws Exception{
        ContentDomain content =mapper.getArticleById(null);
        assertEquals(null,content);
    }

    @Test
    public void UT_TC_03_02_02() throws Exception{
        ContentDomain content =mapper.getArticleById(74);
        assertEquals(null,content);
    }
    @Test
    public void UT_TC_03_02_03() throws Exception{
        ContentDomain content =mapper.getArticleById(8);
        assertEquals(8,content.getCid().intValue());
    }
    @Test
    public void UT_TC_03_02_04() throws Exception{
        ContentDomain content =mapper.getArticleById(-6);
        assertEquals(null,content);
    }
    @Test
    public void UT_TC_03_02_05() throws Exception{
        ContentDomain content =mapper.getArticleById(0);
        assertEquals(null,content);
    }

}