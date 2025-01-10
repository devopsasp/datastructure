//package treedemo;
//
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//public class TreeList {
//    Node root;
//
//    public TreeList() {
//        root = null;
//    }
//
//    public Node getLeftNode(Node n) {
//        return n.left;
//    }
//
//    public Node getRightNode(Node n) {
//        return n.right;
//    }
//
//    public Node getRoot() {
//        return root;
//    }
//
//    public void addLeftOfNode(Node n, int data) {
//        if (n != null) {
//            if (n.left == null) {
//                n.left = new Node(data);
//            } else {
//                System.out.println("Left child already exists for node with data: " + n.data);
//            }
//        } else {
//            System.out.println("Cannot add left child to a null node.");
//        }
//    }
//
//    public void addRightOfNode(Node n, int data) {
//        if (n != null) {
//            if (n.right == null) {
//                n.right = new Node(data);
//            } else {
//                System.out.println("Right child already exists for node with data: " + n.data);
//            }
//        } else {
//            System.out.println("Cannot add right child to a null node.");
//        }
//    }
//
//    public Node addRoot(int data) {
//        root = new Node(data);
//        return root;
//    }
//
//    public void inOrderTraversal(Node node) {
//        if (node != null) {
//            inOrderTraversal(node.left);
//            System.out.println(node.data);
//            inOrderTraversal(node.right);
//        }
//    }
//
//    public void printLeft(Node n) {
//        if (n != null) {
//            if (n.left != null) {
//                System.out.println("Left child of " + n.data + ": " + n.left.data);
//            } else {
//                System.out.println("Left child is null for node with data: " + n.data);
//            }
//        } else {
//            System.out.println("Node is null.");
//        }
//    }
//
//    public void printRight(Node n) {
//        if (n != null) {
//            if (n.right != null) {
//                System.out.println("Right child of " + n.data + ": " + n.right.data);
//            } else {
//                System.out.println("Right child is null for node with data: " + n.data);
//            }
//        } else {
//            System.out.println("Node is null.");
//        }
//    }
//
//    public static void main(String[] args) {
//        TreeList obj = new TreeList();
//        Node root = obj.addRoot(12);
//        System.out.println("Root: " + obj.root.data);
//        
//        // Adding children to the root node
//        obj.addLeftOfNode(obj.root, 23);
//        obj.addRightOfNode(obj.root, 11);
//        
//        // Adding children to the left child of the root
//        obj.addLeftOfNode(obj.root.left, 16);
//        
//        // Adding children to the right child of the root
//        obj.addRightOfNode(obj.root.right, 15);
//        
//        // Adding children to the left child of the left child of the root
//        obj.addLeftOfNode(obj.root.left.left, 55);
//        obj.addRightOfNode(obj.root.left.right, 13);
//
//        System.out.println("In-order Traversal:");
//        obj.inOrderTraversal(obj.root);
//    }
//}