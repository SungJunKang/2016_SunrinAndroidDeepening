package com.sunrin.task04;

import io.realm.RealmObject;
import io.realm.annotations.Index;

/**
 * Created by Sunrin on 2016-12-23.
 */
public class Student extends RealmObject {

    @Index
    private long id;

    private String name;
    private String phone;
    private String image;

    public Student() {
    }

    public Student(String name, String phone, String image) {
        this.name = name;
        this.phone = phone;
        this.image = image;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
