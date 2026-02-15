package com.studentsystem;

public class Student {
    private String name;            //学生姓名
    private int age;                //学生年龄
    private int grade;
    private long id;
    public Student(String name,long id,int grade) {
        this.name=name;
        this.id=id;
        this.grade=grade;
    }
}
