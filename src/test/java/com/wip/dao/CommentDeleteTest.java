package com.wip.dao;

import com.wip.model.CommentDomain;

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
public class CommentDeleteTest {
    @Autowired
    private CommentDao mapper;
    // 此方法是在执行@Test标注的方法之前执行
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建SqlSessionFcatory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        mapper = sqlSession.getMapper(CommentDao.class);
    }



    @Test
    public void IT_TD_004_001() throws Exception{
        mapper.deleteComment(null);
        CommentDomain comment = mapper.getCommentById(null);
        assertEquals(null,comment);
    }

    @Test
    public void IT_TD_004_002() throws Exception{
        mapper.deleteComment(100);
        CommentDomain comment = mapper.getCommentById(100);
        assertEquals(null,comment);
    }
    @Test
    public void IT_TD_004_003() throws Exception{
        mapper.deleteComment(4);
        CommentDomain comment = mapper.getCommentById(4);
        assertEquals(null,comment);
    }
    @Test
    public void IT_TD_004_004() throws Exception{
        mapper.deleteComment(-5);
        CommentDomain comment = mapper.getCommentById(-5);
        assertEquals(null,comment);
    }
    @Test
    public void IT_TD_004_005() throws Exception{
        mapper.deleteComment(0);
        CommentDomain comment = mapper.getCommentById(0);
        assertEquals(null,comment);
    }



}