package com.wip.service.article.impl;

import com.wip.dao.ContentDao;
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
import java.util.List;

import static org.junit.Assert.assertEquals;

@MapperScan("com.wip.dao")
public class GetArticleByCategoryTest {
    @Autowired
    private ContentDao mapper;
    
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
    public void UT_TC_03_01_01() throws Exception{
        List<ContentDomain> content =mapper.getArticleByCategory(null);
        assertEquals(0,content.size());
    }

    @Test
    public void UT_TC_03_01_02() throws Exception{
        String category="不存在";
        List<ContentDomain> content =mapper.getArticleByCategory(category);
        assertEquals(0,content.size());
    }
    @Test
    public void UT_TC_03_01_03() throws Exception{
        String category="默认分类";
        List<ContentDomain> content =mapper.getArticleByCategory(category);
        assertEquals(4,content.size());
    }
    @Test
    public void UT_TC_03_01_04() throws Exception{
        String category="作品";
        List<ContentDomain> content =mapper.getArticleByCategory(category);
        assertEquals(0,content.size());
    }

}
