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

@WebServlet(urlPatterns = "/deletroomServlet")
public class deletroomServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String roomId=request.getParameter("roomId");
room a=new room();
a.setRoomId(roomId);
        PrintWriter out = response.getWriter();
        ApplicantDAO dao = new ApplicantDAO();
      boolean b=  dao.deletroom(a);
      if (b==true){

          out.print("<script type='text/javascript'>");
          out.print("alert('删除成功！');");
          out.print("window.location='home.html';");
          out.print("</script>");
      }else {
          out.print("<script type='text/javascript'>");
          out.print("alert('删除失败或房间不存在！');");
          out.print("window.location='home.html';");
          out.print("</script>");
      }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
