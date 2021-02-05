package com.xy.client1.adapter.objectAdapter;

public class USB {

    private String name;
    private String desc;

    public USB() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String print(){

        return "wo shi USB";
    }
}
