package com.myt.mybatis.pojo;

public class Dept {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Dept(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Dept() {
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
}
