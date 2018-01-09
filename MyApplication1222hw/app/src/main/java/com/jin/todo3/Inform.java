package com.jin.todo3;

/**
 * Created by Jin on 2016-12-22.
 */

public class Inform {
    String name;
    long num;

    public Inform(String name, long num) {
        this.name = name;
        this.num = num;
    }

    public String getName(){ return name;}

    public  void setName(String name){this.name = name;}

    public long getNum(){return num;}

    public void setNum(long num){ this.num = num; }

}
