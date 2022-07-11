package com.example.applicatiobn.models;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
@Entity
@Table(name = "Workers")
public class Worker {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Name should not be empty")
    @Column(name = "name")
    @Size(min = 2 , max = 30 , message = "Name should be between 2 and 30 chars")
    private String name;
    @Column(name = "age")
    @Min(value = 1 ,message =  "age is more than 0")
    @Max(value = 100)
    private int age;
    @Column(name = "email")
    @NotEmpty(message = "email shouldn't be empty")
    @Email
    private String email;

    public Worker() {
    }

    public Worker(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Worker(String name, int age, String email) {

        this.name = name;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
