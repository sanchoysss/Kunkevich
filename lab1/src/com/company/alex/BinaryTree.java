package com.company.alex;

public class BinaryTree extends Tree{

    private int childLink;
    private int rightLink;

    public BinaryTree() {
        super();
    }

    public BinaryTree(int number, int id, int parentId, int childLink, int rightLink) {
        super(number, id, parentId);
        this.childLink = childLink;
        this.rightLink = rightLink;
    }

    public int getChildLink() {
        return childLink;
    }

    public void setChildLink(int childLink) {
        this.childLink = childLink;
    }

    public int getRightLink() {
        return rightLink;
    }

    public void setRightLink(int rightLink) {
        this.rightLink = rightLink;
    }
}
