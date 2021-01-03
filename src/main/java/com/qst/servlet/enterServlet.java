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

@WebServlet(urlPatterns = "/enterServlet")
public class enterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String userType = request.getParameter("userType");
        String rememberMe=request.getParameter("rememberMe");
        uers us = new uers();
        us.setPassword(password);
        us.setName(name);
        admin am = new admin();
        am.setId(name);
        am.setPassword(password);
        PrintWriter out = response.getWriter();
        ApplicantDAO dao = new ApplicantDAO();
        if ("admin".equals(userType)) {
            admin f = dao.login2(am);
            if (f != null) {
                request.setAttribute("f",f);
                response.sendRedirect("home.html");
            } else {
                out.print("<script type='text/javascript'>");
                out.print("alert('账号或密码错误！');");
                out.print("window.location='uersenter.jsp';");
                out.print("</script>");
            }
        }
        else if ("uers".equals(userType)) {
            uers a = dao.login1(us);
            if (a != null) {
               
                request.getSession().setAttribute("SESSION_APPLICANT",a);
//                rememberME(rememberMe,name,password,request,response);
                response.sendRedirect("home.html");
            } else {
                out.print("<script type='text/javascript'>");
                out.print("alert('账号或密码错误！');");
                out.print("window.location='uersenter.jsp';");
                out.print("</script>");
            }

        }
    }

    private void rememberME(String rememberMe, String name, String password, HttpServletRequest request, HttpServletResponse response) {
     if ("true".equals(rememberMe)){

      }
   }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
