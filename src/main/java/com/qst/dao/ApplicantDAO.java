package com.qst.dao;


import com.qst.bean.*;
import com.qst.utils.DBUtil;

public class ApplicantDAO {

    public ApplicantDAO() {
    }

    public uers login1(uers us) {

        uers a = null;
        String sql = "SELECT * FROM login WHERE name=? and password=?";
        a = DBUtil.check(uers.class, sql, us.getName(), us.getPassword());
        return a;
    }
    public admin login2(admin ad) {

        admin b = null;
        String sql = "SELECT * FROM admin WHERE Id=? and password=?";
        b = DBUtil.check(admin.class, sql, ad.getId(), ad.getPassword());
        return b;
    }

    public boolean saveuers(uers us) {

        boolean b = false;
        String sql = "INSERT INTO login(name,password) VALUES(?,?)";
        b = DBUtil.update(sql, us.getName(), us.getPassword());
        return b;
    }

    public boolean saveadmin(admin am) {

        boolean b = false;
        String sql = "INSERT INTO admin(Id,password) VALUES(?,?)";
        b = DBUtil.update(sql, am.getId(), am.getPassword());
        return b;
    }
    public boolean addroom(room rm) {

        boolean c = false;
        String sql = "INSERT INTO room(roomname,money,roomId) VALUES(?,?,?)";
        c = DBUtil.update(sql, rm.getRoomname(), rm.getMoney(),rm.getRoomId());
        return c;
    }

    public room lookroom(room rm) {
        room b = null;
        String sql = "SELECT * FROM room WHERE roomname=?";
        b=DBUtil.check(room.class,sql,rm.getRoomname());
        return b;
    }



    public  boolean  deletroom(room rm) {
        boolean a=false;
        String sql="DELETE FROM room WHERE roomId=?";
        a=DBUtil.update(sql,rm.getRoomId());
        return true;
    }


    public boolean updatapassword(String name,String newpassword) {
        boolean a=false;
        String sql="UPDATE login SET password=? WHERE name=?";
        a=DBUtil.update(sql,newpassword,name);
        return a;
    }
    public boolean addfood(Menu mu) {

        boolean c = false;
        String sql = "INSERT INTO menu(name,price) VALUES(?,?)";
        c = DBUtil.update(sql, mu.getName(),mu.getPrice());
        return c;
    }
    public Menu lookfood(Menu mu) {
        Menu b = null;
        String sql = "SELECT * FROM menu WHERE name=?";
        b=DBUtil.check(Menu.class,sql,mu.getName());
        return b;
    }
    public boolean addorder(order od) {

        boolean c = false;
        String sql = "INSERT INTO `order`(name,money) VALUES(?,?)";
        c = DBUtil.update(sql, od.getName(),od.getMoney());
        return c;
    }
}