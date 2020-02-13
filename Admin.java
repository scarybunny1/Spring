package com.thinkxfactor.demoApp.entity;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Component
public class Admin{
    private String name;
    private String user_name;
    private String pwd;

    public Admin(){
        System.out.println("Admin Created!");
    }

    public Admin(String name, String user_name, String pwd){
        this.name= name;
        this.pwd = pwd;
        this.user_name = user_name;
    }

    public String getName(){
        return name;
    }
    public String getUsername() {
        return user_name;
    }
    public String getPwd() {
        return pwd;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setUsername(String user_name){
        this.user_name = user_name;
    }

    public void setPassword(String pwd){
        this.pwd = pwd;
    }
    @GetMapping("/admin")
    public String adminValues(){
        Admin admin = new Admin("Ayush","scary_bunny1","********");
        return admin.getName();
    }
    @GetMapping("/hello")
    public String hello(@RequestParam("n") String name){
        return "Hello " + name;
    }

}