package com.mybatis.bean;

/**
 * @author Arike
 * Create_at  2017/11/18 10:48
 */
public class Student {
    private long id;
    private String name;
    private int age;
    
    public Student() {
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(long id,String name, int age) {
        this.id =id;
        this.name = name;
        this.age = age;
    }
    
    
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
