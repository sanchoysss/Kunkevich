package com.company.alex;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Tree> trees = new ArrayList<>(11);
        trees.add(new Tree(1, 2, 1));
        trees.add(new Tree(2, 3, 2));
        trees.add(new Tree(3, 4, 2));
        trees.add(new Tree(4, 5, 4));
        trees.add(new Tree(5, 6, 4));
        trees.add(new Tree(6, 7, 4));
        trees.add(new Tree(7, 8, 1));
        trees.add(new Tree(8, 9, 8));
        trees.add(new Tree(9, 10, 8));
        trees.add(new Tree(10, 11, 10));
        trees.add(new Tree(11, 12, 10));

        List<BinaryTree> binaryTrees = new ArrayList<>(11);

        for (int i = 1; i <= trees.size(); i++) {
            BinaryTree binaryTree = new BinaryTree();
            binaryTree.setNumber(i);
            binaryTree.setId(trees.get(i - 1).getId());
            binaryTree.setParentId(trees.get(i-1).getParentId());
            binaryTree.setChildLink(getChildLink(binaryTree.getId(), trees));
            binaryTree.setRightLink(getRightNeighbour(binaryTree.getParentId(), binaryTree.getId(), trees));

            binaryTrees.add(binaryTree);
        }

        for (BinaryTree binaryTree : binaryTrees) {
            System.out.println(binaryTree.getNumber() + "\t" + binaryTree.getId() + "\t" + binaryTree.getParentId() + "\t" + binaryTree.getChildLink() + "\t" + binaryTree.getRightLink());
        }
    }

    public static int getChildLink(int nodeId, List<Tree> trees) {
        for (Tree tree : trees) {
            if (tree.getParentId() == nodeId) {
                return tree.getNumber();
            }
        }
        return -1;
    }

    public static int getRightNeighbour(int parentId, int nodeId, List<Tree> trees) {
        for (Tree tree : trees) {
            if (tree.getId() > nodeId && tree.getParentId() == parentId) {
                return tree.getNumber();
            }
        }
        return -1;
    }
}
