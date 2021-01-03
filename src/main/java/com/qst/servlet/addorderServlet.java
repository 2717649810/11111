package com.qst.servlet;


import com.qst.bean.order;
import com.qst.dao.ApplicantDAO;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/addorderServlet")
public class addorderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("name");
        String  price=request.getParameter("price");
        order a=new order();
        a.setMoney(price);
        a.setName(name);
        PrintWriter out = response.getWriter();
        ApplicantDAO dao = new ApplicantDAO();
       boolean b= dao.addorder(a);
        if (b!=false)
        {
            out.print("<script type='text/javascript'>");
            out.print("alert('添加成功');");
            out.print("window.location='home.html';");
            out.print("</script>");

        }else{
            out.print("<script type='text/javascript'>");
            out.print("alert('订单失败');");
            out.print("window.location='home.html';");

            out.print("</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
