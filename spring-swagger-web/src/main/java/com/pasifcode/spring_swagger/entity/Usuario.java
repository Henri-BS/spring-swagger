package com.pasifcode.spring_swagger.entity;

public class Usuario {
    private Integer id;
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    @Override
    public String toString(){
        return "User{" +
                "username= '" + username + '\'' +
                ", password= '" + password + '\'' +
                '}';
    }
}
