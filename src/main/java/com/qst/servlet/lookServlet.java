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

@WebServlet(urlPatterns = "/lookServlet")
public class lookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String roomname=request.getParameter("roomname");
        room b=new room();
        b.setRoomname(roomname);
        PrintWriter out = response.getWriter();
        ApplicantDAO dao=new ApplicantDAO();
        room d=dao.lookroom(b);
        if(d!=null){
            request.setAttribute("d",d);
            request.getRequestDispatcher("/lookRoom.jsp").forward(request,response);
        }
        else {
            out.print("<script type='text/javascript'>");
            out.print("alert('房间不存在');");
            out.print("window.location='home.html';");
            out.print("</script>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request, response);
    }
}
