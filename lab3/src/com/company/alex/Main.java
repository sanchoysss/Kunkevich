package com.company.alex;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Node> nodes = new ArrayList<>(12);
        nodes.add(new Node(1, -1, 2, 7));
        nodes.add(new Node(2, 1, 3, 4));
        nodes.add(new Node(3, 2, -1, -1));
        nodes.add(new Node(4, 2, 5, 6));
        nodes.add(new Node(5, 4, -1, -1));
        nodes.add(new Node(6, 4, -1, -1));
        nodes.add(new Node(7, 1, 8, 10));
        nodes.add(new Node(8, 7, 9, -1));
        nodes.add(new Node(9, 8, -1, -1));
        nodes.add(new Node(10, 7, 11, 12));
        nodes.add(new Node(11, 10, -1, -1));
        nodes.add(new Node(12, 10, -1, -1));

        List<Node> queue = new ArrayList<>(12);
        queue.add(nodes.get(0));

        while (!queue.isEmpty()) {
            Node node = queue.remove(0);
            System.out.println(node.getId());
            if (node.getRightChildId() != -1) {
                queue.add(0, getNodeById(nodes, node.getRightChildId()));
            }
            if (node.getLeftChildId() != -1) {
                queue.add(0, getNodeById(nodes, node.getLeftChildId()));
            }
        }
    }


    public static Node getNodeById(List<Node> nodes, int nodeId) {
        for (Node node : nodes) {
            if (node.getId() == nodeId) {
                return node;
            }
        }
        return null;
    }
}
