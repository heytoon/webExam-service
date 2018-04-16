package com.http.util;

import java.io.BufferedReader;  
import java.io.DataOutputStream;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.PrintWriter;  
import java.net.HttpURLConnection;  
import java.net.MalformedURLException;  
import java.net.URL;  
import java.net.URLConnection;  
  
import com.alibaba.fastjson.JSON;  
import com.alibaba.fastjson.JSONObject;  
  
public class HttpUtil {  
  
    /** 
     *  
     *  
     * @Title: getParams 
     * @Description: HTTP GET 请求 
     * @param: @param uri 请求地址 
     * @param: @param params 参数串 
     * @param: @return 
     * @return: String 
     * 
     */  
    public static String getParams(String uri, String params) {  
        String result = "";  
        BufferedReader reader = null;  
        StringBuffer url = new StringBuffer();  
        try {  
            url.append(uri);  
            url.append("?");  
            url.append(params);// get的参数 xx=xx&yy=yy  
            URL realUrl = new URL(url.toString());  
            // 打开和URL之间的连接  
            URLConnection connection = realUrl.openConnection();  
            // 设置通用的请求属性  
            connection.setRequestProperty("accept", "*/*");  
            connection.setRequestProperty("Content-Type","text/html; charset=utf-8");  
            connection.setRequestProperty("Charset", "UTF-8");  
            connection.connect();  
            // 定义 BufferedReader输入流来读取URL的响应  
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));  
            String line;  
            StringBuffer buffer = new StringBuffer();  
            while ((line = reader.readLine()) != null) {  
                buffer.append(line);  
            }  
            result = buffer.toString();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (reader != null) {  
                    reader.close();  
                }  
            } catch (Exception e2) {  
                e2.printStackTrace();  
            }  
        }  
        return result;  
    }  
  
    /**  
     *   
     *   
     * @Title: postParams  
     * @Description: HTTP POST 请求  
     * @param: @param uri 请求地址  
     * @param: @param params 参数串  
     * @param: @return  
     * @return: String  
     * @user:  
     *  
     */  
    public static String postParams(String uri, String params) {  
        URL url = null;  
        String result = null;  
        try {  
            url = new URL(uri);  
            HttpURLConnection connection = (HttpURLConnection) url  
                    .openConnection();  
            connection.setRequestMethod("POST");  
            // 发送POST请求必须设置如下两行  
            connection.setDoOutput(true);  
            connection.setDoInput(true);  
            // 获取URLConnection对象对应的输出流  
            PrintWriter printWriter = new PrintWriter(  
                    connection.getOutputStream());  
            // 发送请求参数  
            printWriter.write(params);// post的参数 xx=xx&yy=yy  
            // flush输出流的缓冲  
            printWriter.flush();  
            // 开始获取数据  
            BufferedReader reader = new BufferedReader(  
                    new InputStreamReader(connection.getInputStream()));  
            result = reader.readLine();  
            reader.close();  
            connection.disconnect();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return result;  
    }  
  
    /** 
     *  
     *  
     * @Title: postJson 
     * @Description: HTTP POST请求方式提交JSON数据 
     * @param: @param uri 请求地址 
     * @param: @param object JSONObject 
     * @param: @return 
     * @param: @throws IOException 
     * @return: String 
     * @user: 
     * 
     */  
    public static String postJson(String uri, JSONObject object) {  
        String result = null;  
        try {  
            // 创建url资源  
            URL url = new URL(uri);  
            // 建立http连接  
            HttpURLConnection connection = (HttpURLConnection) url  
                    .openConnection();  
            // 设置允许输出  
            connection.setDoOutput(true);  
            // 设置允许输入  
            connection.setDoInput(true);  
            // 设置传递方式POST  
            connection.setRequestMethod("POST");  
            // 设置不用缓存  
            connection.setUseCaches(false);  
            // 设置本次连接是否自动处理重定向  
            connection.setInstanceFollowRedirects(true);  
            // 设置文本类型  
            connection.setRequestProperty("Content-Type",  
                    "application/json;charset=UTF-8");  
            // 设置维持长连接  
            connection.setRequestProperty("Connection", "Keep-Alive");  
            // 设置文本字符集  
            connection.setRequestProperty("Charset", "UTF-8");  
            // 转换为字节数组  
            byte[] json = (JSON.toJSONString(object)).getBytes();  
            // 设置文本长度  
            connection.setRequestProperty("Content-Length",  
                    String.valueOf(json.length));  
            // 开始连接请求  
            connection.connect();  
            DataOutputStream out = new DataOutputStream(  
                    connection.getOutputStream());  
            out.write(json);  
            out.flush();  
            out.close();  
            int code = connection.getResponseCode();  
            if (HttpURLConnection.HTTP_OK == code) {  
                BufferedReader reader = new BufferedReader(  
                        new InputStreamReader(connection.getInputStream()));  
                result = reader.readLine();  
                reader.close();  
            }  
            connection.disconnect();  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return result;  
    }  
}  