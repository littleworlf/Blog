package com.wip.service.comment.impl;

import com.wip.dao.CommentDao;
import com.wip.model.CommentDomain;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;


public class GetCommentByIdTest {


    @Autowired
    private CommentDao mapper;




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
