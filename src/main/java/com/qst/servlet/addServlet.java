package com.qst.servlet;




import com.qst.bean.room;
import com.qst.dao.ApplicantDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/addServlet")
public class addServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String roomname=request.getParameter("roomname");
        String roomId=request.getParameter("roomId");
        String  money=request.getParameter("money");
       room rm=new room();
        rm.setRoomname(roomname);
        rm.setMoney(money);
        rm.setRoomId(roomId);
        PrintWriter out = response.getWriter();
        ApplicantDAO dao = new ApplicantDAO();
        boolean a= dao.addroom(rm);
        if (a!=false)
        {
            out.print("<script type='text/javascript'>");
            out.print("alert('添加成功');");
            out.print("</script>");
            response.sendRedirect("home.html");
        }else{
            out.print("<script type='text/javascript'>");
            out.print("alert('已经存在房间');");
            out.print("window.location='addroom.html';");
            out.print("</script>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
