package com.qst.servlet;

import com.alibaba.fastjson.JSON;
import com.qst.bean.Msg;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/NameServlet")
public class NameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer=response.getWriter();
        String name=request.getParameter("name");
        String pattern="\\d{8,12}";
                Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(name);
        Msg msg=null;
        if (m.matches()){
            msg=new Msg(true,"验证通过");
        }else {
            msg=new Msg(false,"名字非法");
        }
        String info= JSON.toJSONString(msg);
        writer.print(info);
        writer.flush();
        writer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
