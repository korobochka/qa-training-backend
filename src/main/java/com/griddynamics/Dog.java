package com.griddynamics;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by korobochka on 4/6/16.
 */
@Entity
public class Dog {
    @Id @GeneratedValue(strategy= GenerationType.AUTO)
    long id;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public Float getHeight() {
        return height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setName(String name) {
        if(name.length() < 1 || name.length() > 100) throw new RuntimeException("length");
        this.name = name;
    }

    public void setDob(Date dob) {
        if(dob != null && new Date(System.currentTimeMillis()).compareTo(dob) < 0) throw new RuntimeException("date");
        this.dob = dob;
    }

    public void setHeight(Float height) {
        if(height != null && height <= 0) throw new RuntimeException("height");
        this.height = height;
    }

    public void setWeight(Float weight) {
        if(weight != null && weight <= 0) throw new RuntimeException("weight");
        this.weight = weight;
    }

    @Column(nullable = false)
    String name;

    Date dob;
    Float height;
    Float weight;
}
