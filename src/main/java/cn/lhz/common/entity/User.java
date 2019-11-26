package cn.lhz.common.entity;

import ch.ethz.ssh2.Connection;

import java.util.*;

public class User {
    private String userId;

    private String userUsername;

    private String userImg;

    private String userPassword;

    private List<Esc>escs;

    private Map<String,Connection> connections=new HashMap<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername == null ? null : userUsername.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Map<String, Connection> getConnections()
    {
        return this.connections;
    }

    public void setConnections(Map<String, Connection> connections)
    {
        this.connections = connections;
    }

    public List<Esc> getEscs()
    {
        return escs;
    }

    public void setEscs(List<Esc> escs)
    {
        this.escs = escs;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userUsername='" + userUsername + '\'' +
                ", userImg='" + userImg + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", escs=" + escs +
                ", connections=" + connections +
                '}';
    }
}