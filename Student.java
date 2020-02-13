package com.thinkxfactor.demoApp.entity;

import org.springframework.stereotype.Component;

@Component
public class Student{
    private String name;
    private String roll;
    private String gender;
    private String dept;
    private String user_name;
    private String pwd;

    public Student(){
        System.out.println("Student created!");
    }
    public Student(String name, String roll, String gender, String dept, String user_name, String pwd){
        this.name = name;
        this.dept = dept;
        this.roll = roll;
        this.gender = gender;
        this.user_name = user_name;
        this.pwd = pwd;
    }
    public void printInfo(){
        System.out.println(this.name + "\n" + this.roll + "\n" + this.dept + "\n" + this.gender + "\n");
    }
    public String getName(){
        return name;
    }
    public String getRoll(){
        return roll;
    }
    public String getGender(){
        return gender;
    }
    public String getDept(){
        return dept;
    }
    public String getUsername(){
        return user_name;
    }
    public String getPassword(){
        return pwd;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public void setRoll(String roll){
        this.roll = roll;
    }
    public void setUsername(String user_name){
        this.user_name = user_name;
    }
    public void setPassword(String pwd){
        this.pwd = pwd;
    }
}