package com.qst.bean;



public class admin {
    private String name;
    private String sex;
    private String age;
    private String Id;
    private String password;

    public admin() {
    }

    public admin(String name, String sex, String age, String id, String password) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.Id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
