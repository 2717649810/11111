package com.qst.servlet;




import com.qst.dao.ApplicantDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/updataServlet")
public class updataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String newpassword=request.getParameter("newpassword");
        PrintWriter out = response.getWriter();
        ApplicantDAO dao = new ApplicantDAO();
        boolean b=  dao.updatapassword(name,newpassword);
        if (b==true){

            out.print("<script type='text/javascript'>");
            out.print("alert('修改成功！');");
            out.print("window.location='uersenter.jsp';");
            out.print("</script>");
        }else {
            out.print("<script type='text/javascript'>");
            out.print("alert('修改失败！');");
            out.print("window.location='home.html';");
            out.print("</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
