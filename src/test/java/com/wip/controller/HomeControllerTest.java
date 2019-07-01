package com.wip.controller;

import com.wip.model.CommentDomain;
import com.wip.service.comment.CommentService;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class HomeControllerTest {

    private final String USER_AGENT = "Mozilla/5.0";
    @Autowired
    private static CommentService commentService;

    // HTTP GET请求
    private void sendGet(String url) throws Exception {



        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(url);

        //添加请求头
        request.addHeader("User-Agent", USER_AGENT);

        HttpResponse response = client.execute(request);

        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " +
                response.getStatusLine().getStatusCode());
        assertEquals(200,response.getStatusLine().getStatusCode());

    }


    @Test
    public void IT_TD_001_001_001() throws Exception{
        HomeControllerTest http = new HomeControllerTest();
        String url = "http://localhost:8888/detail";
        http.sendGet(url);
    }

    @Test
    public void IT_TD_001_001_002() throws Exception{
        HomeControllerTest http = new HomeControllerTest();
        String url = "http://localhost:8888/detail/-5";
        http.sendGet(url);
    }

    @Test
    public void IT_TD_001_001_003() throws Exception{
        HomeControllerTest http = new HomeControllerTest();
        String url = "http://localhost:8888/detail/0";
        http.sendGet(url);
    }

    @Test
    public void IT_TD_001_001_004() throws Exception{
        HomeControllerTest http = new HomeControllerTest();
        String url = "http://localhost:8888/detail/110";
        http.sendGet(url);
    }

    @Test
    public void IT_TD_001_001_005() throws Exception{
        HomeControllerTest http = new HomeControllerTest();
        String url = "http://localhost:8888/detail/7";
        http.sendGet(url);
    }



}