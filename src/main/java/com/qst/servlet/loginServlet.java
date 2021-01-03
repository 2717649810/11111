package com.qst.servlet;

import com.qst.bean.admin;
import com.qst.bean.uers;
import com.qst.dao.ApplicantDAO;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns= "/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String userType=request.getParameter("userType");
        uers us=new uers();
        us.setPassword(password);
        us.setName(name);
        admin am=new admin();
        am.setId(name);
        am.setPassword(password);
        PrintWriter out = response.getWriter();
        ApplicantDAO dao = new ApplicantDAO();
        if ("admin".equals(userType))
        {
            boolean f=dao.saveadmin(am);
            if (f==true){
                response.sendRedirect("uersenter.jsp");
            } else {
                out.print("<script type='text/javascript'>");
                out.print("alert('账号已存在');");
                out.print("window.location='login.jsp';");
                out.print("</script>");
            }
        }

      else if("uers".equals(userType)) {
            boolean a= dao.saveuers(us);
            if (a==true){
                response.sendRedirect("uersenter.jsp");
            } else {
                out.print("<script type='text/javascript'>");
                out.print("alert('账号已存在');");
                out.print("window.location='login.jsp';");
                out.print("</script>");
            }

               }

       }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

