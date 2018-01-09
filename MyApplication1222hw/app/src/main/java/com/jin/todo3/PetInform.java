package com.jin.todo3;

/**
 * Created by Jin on 2016-12-22.
 */

public class PetInform {
    String petName;
    String petType;
    long petAge;

    public PetInform(String petName, String petType, long petAge) {
        this.petName = petName;
        this.petType = petType;
        this.petAge = petAge;
    }

    public String getName(){ return petName; }

    public String getType(){ return petType; }

    public long getAge(){ return petAge;}

    public void setName(String name){ this.petName = name; }

    public void setType(String type){ this.petType = type; }

    public void setAge(long age){ this.petAge = age; }

}
