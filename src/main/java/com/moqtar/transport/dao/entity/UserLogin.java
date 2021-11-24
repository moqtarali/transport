package com.moqtar.transport.dao.entity;

public class UserLogin {
    private String userName;
    private String pwd;

    public UserLogin()
    {
    }

    public UserLogin(String userName, String pwd)
    {
        this.userName = userName;
        this.pwd = pwd;
    }
    public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPwd(){
       return this.pwd;
    }

    public void setPwd(String pwd) {
       this.pwd = pwd;
    }
}