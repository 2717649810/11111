package com.qst.servlet;


import com.qst.bean.Menu;
import com.qst.dao.ApplicantDAO;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/addfoodServlet")
public class addfoodServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("name");
        String price=request.getParameter("price");
        Menu a=new Menu();
        a.setName(name);
        a.setPrice(price);
        PrintWriter out = response.getWriter();
        ApplicantDAO dao = new ApplicantDAO();
        boolean b=false;
            b=dao.addfood(a);
        if (b!=false)
        {
            out.print("<script type='text/javascript'>");
            out.print("alert('添加成功');");
            out.print("</script>");
            response.sendRedirect("home.html");
        }else{
            out.print("<script type='text/javascript'>");
            out.print("alert('已经存在菜品');");
            out.print("window.location='addfood.jsp';");
            out.print("</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
