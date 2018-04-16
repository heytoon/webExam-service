package com.http.util;

import java.io.UnsupportedEncodingException;  
import java.net.URLEncoder;  
  
import com.alibaba.fastjson.JSON;  
import com.alibaba.fastjson.JSONObject;
import com.http.model.SysUser;


public class HttpTest {  
      
    private static String getParams = "http://localhost:8080/famousEducationAPI/user/getParams";  
    private static String postParams = "http://localhost:8080/famousEducationAPI/user/postParams";  
    private static String postJson = "http://localhost:8080/famousEducationAPI/user/postJson";  
      
    public static void main(String[] args) {  
        testGetParams();  
        testPostParams();  
        testPostJson();  
    }  
      
    public static void testGetParams() {  
        StringBuffer param = new StringBuffer();  
        try {  
            param.append("id=784972358981328902&name=");  
            param.append(URLEncoder.encode("奈文摩尔","UTF-8"));  
            param.append("&age=20");  
            param.append("&ctime=");  
            param.append(URLEncoder.encode("2017-11-11 11:11:11","UTF-8"));//get提交的参数是在url中的，带有空格的参数必须转译  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        String result = HttpUtil.getParams(getParams, param.toString());  
        System.out.println(result);  
    }  
      
    public static void testPostParams() {  
        StringBuffer param = new StringBuffer();  
        try {  
            param.append("id=784972358981328902&name=");  
            param.append(URLEncoder.encode("奈文摩尔","UTF-8"));  
            param.append("&age=20");  
            param.append("&ctime=2017-11-11 11:11:11");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        String result = HttpUtil.postParams(postParams, param.toString());  
        System.out.println(result);  
    }  
      
    public static void testPostJson() {  
        SysUser user = new SysUser();  
        user.setId(784972358981328902L);  
        user.setName("奈文摩尔");  
        user.setAge(20);  
        JSONObject jsonObject = (JSONObject) JSON.toJSON(user);  
        String result = HttpUtil.postJson(postJson, jsonObject);  
        System.out.println(result);  
    }  
  
}  
