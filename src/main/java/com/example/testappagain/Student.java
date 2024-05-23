package com.example.testappagain;

import jakarta.persistence.*;

@Entity
public class Student
{
    private String name;
    @Column(unique=true)
    private String email;

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
