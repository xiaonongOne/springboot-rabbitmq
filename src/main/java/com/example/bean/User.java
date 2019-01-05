package com.example.bean;

import java.io.Serializable;

/**
 * @ProjectName: springboot-rabbitmq
 * @Package: com.example.bean
 * @ClassName: User
 * @Description: 用户类
 * @Author: Xiao Nong
 * @Version: 1.0
 */
public class User implements  Serializable {

    private int id;

    private String username;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
