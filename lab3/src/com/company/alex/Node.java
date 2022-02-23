package com.company.alex;

public class Node {

    private int id;
    private int parentId;
    private int leftChildId;
    private int rightChildId;

    public Node() {
    }

    public Node(int id, int parentId, int leftChildId, int rightChildId) {
        this.id = id;
        this.parentId = parentId;
        this.leftChildId = leftChildId;
        this.rightChildId = rightChildId;
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

    public int getLeftChildId() {
        return leftChildId;
    }

    public void setLeftChildId(int leftChildId) {
        this.leftChildId = leftChildId;
    }

    public int getRightChildId() {
        return rightChildId;
    }

    public void setRightChildId(int rightChildId) {
        this.rightChildId = rightChildId;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", parentId=" + parentId +
                '}';
    }
}
