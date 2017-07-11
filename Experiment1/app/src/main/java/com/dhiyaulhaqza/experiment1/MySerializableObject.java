package com.dhiyaulhaqza.experiment1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dhiyaulhaqza on 7/11/17.
 */

public class MySerializableObject implements Serializable {
    private String name;
    private int age;
    private ArrayList<String> address;

    public MySerializableObject(String name, int age, ArrayList<String> address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getAddress() {
        return address;
    }
}