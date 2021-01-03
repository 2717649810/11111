package com.qst.bean;;

public class order {
    private String name;
    private  String money;
    public order(String name, String money) {
        this.name = name;
        this.money = money;
    }
    public order(){
 }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }


}
