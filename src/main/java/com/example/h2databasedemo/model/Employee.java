package com.example.h2databasedemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

    @Column(name="id")
    @Id
    Integer id;

    @Column(name="name")
    String name;

//    public Employee(Integer id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public Integer getId(){return this.id;};

    public void setId(Integer id){this.id = id;};

    public String getName(){return this.name;};

    public void setName(String name){this.name = name;};


}
