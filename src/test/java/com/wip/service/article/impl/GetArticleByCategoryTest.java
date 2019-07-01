package com.wip.service.article.impl;

import com.wip.dao.ContentDao;
import com.wip.model.ContentDomain;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetArticleByCategoryTest {
    @Autowired
    private ContentDao mapper;


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
