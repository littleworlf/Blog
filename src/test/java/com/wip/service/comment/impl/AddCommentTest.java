package com.wip.service.comment.impl;

import com.wip.model.CommentDomain;
import com.wip.utils.TaleUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AddCommentTest {


    public boolean addComment(CommentDomain comments) {
        String msg = null;

        if (null == comments) {
            msg = "评论对象为空";
            return false;
        }

        if (StringUtils.isBlank(comments.getAuthor())) {
            comments.setAuthor("热心网友");
        }
        if (StringUtils.isNotBlank(comments.getEmail()) && !TaleUtils.isEmail(comments.getEmail())) {
            msg =  "请输入正确的邮箱格式";
        }
        if (StringUtils.isBlank(comments.getContent())) {
            msg = "评论内容不能为空";
        }
        if (null == comments.getCid()) {
            msg = "评论文章不能为空";
        }
        if (msg != null){
            System.out.println("message: "+msg);
            return false;
        }else {
            //TODO AddComment()
            return true;
        }

    }

    @Test
    public void UT_TC_04_01_01() throws Exception{
        CommentDomain commentDomain=new CommentDomain();
        commentDomain.setCoid(4);
        commentDomain.setCid(7);
        commentDomain.setAuthor("kate");
        commentDomain.setContent("this is a test");
        commentDomain.setEmail("1652766@tongji.edu.cn");
        boolean result=addComment(commentDomain);
        assertEquals(true,result);
    }

    @Test
    public void UT_TC_04_01_02() throws Exception{
        CommentDomain commentDomain=new CommentDomain();
        commentDomain.setCoid(4);
        commentDomain.setCid(7);
        commentDomain.setAuthor("");
        commentDomain.setContent("this is a test");
        commentDomain.setEmail("1652766@tongji.edu.cn");
        boolean result=addComment(commentDomain);
        assertEquals(true,result);
    }
    @Test
    public void UT_TC_04_01_03() throws Exception{
        CommentDomain commentDomain=new CommentDomain();
        commentDomain.setCoid(4);
        commentDomain.setCid(7);
        commentDomain.setAuthor("peter");
        commentDomain.setContent("this is a test");
        commentDomain.setEmail("1652766@");
        boolean result=addComment(commentDomain);
        assertEquals(false,result);
    }
    @Test
    public void UT_TC_04_01_04() throws Exception{
        CommentDomain commentDomain=new CommentDomain();
        commentDomain.setCoid(4);
        commentDomain.setCid(7);
        commentDomain.setAuthor("peter");
        commentDomain.setContent("");
        commentDomain.setEmail("1652766@tongji.edu.cn");
        boolean result=addComment(commentDomain);
        assertEquals(false,result);
    }
    @Test
    public void UT_TC_04_01_05() throws Exception{
        CommentDomain commentDomain=new CommentDomain();
        commentDomain.setCoid(4);
        commentDomain.setCid(7);
        commentDomain.setAuthor("peter");
        commentDomain.setContent("A");
        commentDomain.setEmail("1652766@tongji.edu.cn");
        boolean result=addComment(commentDomain);
        assertEquals(false,result);
    }
    @Test
    public void UT_TC_04_01_06() throws Exception{
        CommentDomain commentDomain=new CommentDomain();
        commentDomain.setCoid(4);
        commentDomain.setCid(7);
        commentDomain.setAuthor("peter");
        commentDomain.setContent("这里的parameterType设置成user是因为如果不设置的情况下，会自动将类名首字母小写后的名称，原来的类名为User。不过，建议大家还是使用typeAlias进行配置吧。唯一需要说明的就是<insert>元素里面的useGeneratedKeys和keyProperties属性，这两个属性是用来获取数据库中的主键的。\n" +
                "在数据库里面经常性的会给数据库表设置一个自增长的列作为主键，如果我们操作数据库后希望能够获取这个主键该怎么弄呢？正如上面所述，如果是支持自增长的数据库，如mysql数据库，那么只需要设置useGeneratedKeys和keyProperties属性便可以了，但是对于不支持自增长的数据库（如oracle）该怎么办呢？\n" +
                "mybatis里面在<insert>元素下面提供了<selectKey>子元素用于帮助解决这个问题。来看下配置\n"+"这里我们根据用户id去查询这个用户的信息，resultType=User是一个别名，如果我们接触到的是这种一对一的问题，那么可以简单的定义一个实体，这个实体代表数据库表中的一条记录即可。但是如果我们遇到一对多的问题呢，\n"+
                "就拿这里的查询用户信息来说，如果每个用户有各种兴趣，需要维护每个用户的兴趣信息，那么我们可能就存在下面的数据表结构"
              );
        commentDomain.setEmail("1652766@tongji.edu.cn");
        boolean result=addComment(commentDomain);
        assertEquals(false,result);
    }
    @Test
    public void UT_TC_04_01_07() throws Exception{
        CommentDomain commentDomain=new CommentDomain();
        commentDomain.setCoid(4);
        commentDomain.setCid(null);
        commentDomain.setAuthor("peter");
        commentDomain.setContent("this is a test");
        commentDomain.setEmail("1652766@tongji.edu.cn");
        boolean result=addComment(commentDomain);
        assertEquals(false,result);
    }
    @Test
    public void UT_TC_04_01_08() throws Exception{
        boolean result=addComment(null);
        assertEquals(false,result);
    }

}
