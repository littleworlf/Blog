package com.wip.service.article.impl;

import com.wip.dao.ContentDao;
import com.wip.model.ContentDomain;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



import static org.junit.Assert.*;



public class GetArticleByIdTest {


    @Autowired
    private ContentDao mapper;


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