package com.qst.bean;;

public class room {

    private String roomname;
    private  String roomId;
    private String money;

    public room() {

    }

    public room(String roomname, String roomId, String money) {
        this.roomname = roomname;
        this.roomId=roomId;
        this.money=money;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
