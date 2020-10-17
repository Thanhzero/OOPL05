/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop01.bai2;

import java.io.Serializable;

/**
 *
 * @author TienThanh
 */
public class Student implements Serializable{
    private String id;
    private String fullName;
    private String email;
    private float scores;

    public Student() {
    }

    public Student(String id, String fullName, String email, float scores) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", scores=" + scores +
                '}';
    }
}


