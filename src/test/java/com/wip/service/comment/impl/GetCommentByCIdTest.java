package com.wip.service.comment.impl;

import com.wip.dao.CommentDao;
import com.wip.model.CommentDomain;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class GetCommentByCIdTest {


    @Autowired
    private CommentDao mapper;

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
