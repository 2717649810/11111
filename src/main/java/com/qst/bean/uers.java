package com.qst.bean;;

public class uers {
    private String name;
    private  String password;
    private String ID;

    public uers() {
    }

    public uers(String name, String password, String ID){
        this.ID=ID;
        this.name=name;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
