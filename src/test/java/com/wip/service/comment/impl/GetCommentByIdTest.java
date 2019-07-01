package com.wip.service.comment.impl;

import com.wip.dao.CommentDao;
import com.wip.model.CommentDomain;
import com.wip.service.comment.CommentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import java.io.InputStream;
import java.util.List;
import static org.junit.Assert.assertEquals;

@MapperScan("com.wip.dao")
public class GetCommentByIdTest {


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
    public void UT_TC_04_03_01() throws Exception{
        CommentDomain comment=mapper.getCommentById(null);
        assertEquals(null,comment);
    }

    @Test
    public void UT_TC_04_03_02() throws Exception{
        CommentDomain comment=mapper.getCommentById(100);
        assertEquals(null,comment);
    }
    @Test
    public void UT_TC_04_03_03() throws Exception{
        CommentDomain comment=mapper.getCommentById(3);
        assertEquals(7,comment.getCid().intValue());
    }
    @Test
    public void UT_TC_04_03_04() throws Exception{
        CommentDomain comment=mapper.getCommentById(-5);
        assertEquals(null,comment);
    }
    @Test
    public void UT_TC_04_03_05() throws Exception{
        CommentDomain comment=mapper.getCommentById(0);
        assertEquals(null,comment);
    }



}
