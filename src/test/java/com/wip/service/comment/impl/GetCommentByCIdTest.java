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
public class GetCommentByCIdTest {


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
    public void UT_TC_04_02_01() throws Exception{
        List<CommentDomain> comments=mapper.getCommentByCId(null);
        assertEquals(true,comments.isEmpty());
    }

    @Test
    public void UT_TC_04_02_02() throws Exception{
        List<CommentDomain> comments=mapper.getCommentByCId(100);
        assertEquals(true,comments.isEmpty());
    }
    @Test
    public void UT_TC_04_02_03() throws Exception{
        List<CommentDomain> comments=mapper.getCommentByCId(7);
        assertEquals(false,comments.isEmpty());
    }
    @Test
    public void UT_TC_04_02_04() throws Exception{
        List<CommentDomain> comments=mapper.getCommentByCId(-5);
        assertEquals(true,comments.isEmpty());
    }
    @Test
    public void UT_TC_04_02_05() throws Exception{
        List<CommentDomain> comments=mapper.getCommentByCId(0);
        assertEquals(true,comments.isEmpty());
    }

}
