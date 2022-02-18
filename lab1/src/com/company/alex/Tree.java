package com.company.alex;

public class Tree {


    private int number;
    private int id;
    private int parentId;

    public Tree() {
    }

    public Tree(int number, int id, int parentId) {
        this.number = number;
        this.id = id;
        this.parentId = parentId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
