package com.binary;

import java.util.LinkedList;
import java.util.Queue;

class Node
{ 
	int data;
	Node left;
	Node right;
	public Node(int data)
	{ 
		this.data=data;
	}
	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
}
public class BinarySearchTree {


	  Node root;
	  public BinarySearchTree()
	  { 
		   root=null;
	  }
	  
	  public void inOrder(Node n) 
	  { 
		  if(n==null) 
		  { 
			  return;
		  }
		  else
		  { 
			  inOrder(n.left);
			  System.out.println(n.data);
			  inOrder(n.right);
		  }
	  }
	  public Node findNode(int data)
	  { 
		  
		   for(Node current=getRoot();current!=null;current=current.left) 
		   { 
			   if(data==current.data)
			   { 
				   return current;
			   }
			   
		   }
		   for(Node current=getRoot();current!=null;current=current.right)
		   { 
			   if(data==current.data)
			   { 
				   return current;
			   }
		   }
		   return null;
	  }
	  public void preOrder(Node n) 
	  { 
		  if(n==null) 
		  { 
			  return;
		  }
		  else
		  { 
			  System.out.println(n.data);
			  preOrder(n.left);
			  preOrder(n.right);
		  }
	  }
	  public void postOrder(Node n) 
	  { 
		  if(n==null) 
		  { 
			  return;
		  }
		  else
		  {
			  postOrder(n.left);
			  postOrder(n.right);
			  System.out.println(n.data);
		  }
	  }
//	  public void addNode(int data)
//	  { 
//		  if(root==null)
//		  {
//			  root=new Node(data);
//			  return;
//			  
//		  }
//		  
//			  Node current=root;
//			  Node parent=null;
//			  while(true)
//			  { 
//				  parent=current;
//				  if(data<current.data)
//				  { 
//					  current=current.left;
//					  if(current==null) 
//					  { 
//						  Node n=new Node(data);
//						  parent.left=n;
//						  return;
//					  }
//				  }
//				  if(data>current.data)
//				  { 
//					  current=current.right;
//					  if(current==null)
//					  { 
//						  Node n=new Node(data);
//						  parent.right=n;
//						  return;
//					  }
//				  }
//				  else
//				  {
//					  return;
//				  }
//				  
//				  
//			  }
//		  
//	  }
//	  
	  
	  public void addNode(int data) { 
		    if (root == null) {
		        root = new Node(data);
		        return;
		    }

		    Node current = root;
		    Node parent = null;

		    while (true) { 
		        parent = current;
		        if (data < current.data) { 
		            current = current.left;
		            if (current == null) { 
		                parent.left = new Node(data);
		                return;
		            }
		        } else if (data > current.data) { 
		            current = current.right;
		            if (current == null) { 
		                parent.right = new Node(data);
		                return;
		            }
		        } else {
		            // If data is equal, you can choose to ignore it or handle it as needed
		            return; // Do nothing for duplicates
		        }
		    }
		}
	  
	  public void levelOrderTraversing() 
	  { 
		  Queue<Node> 	queue=new LinkedList();
		  queue.add(root);
		  while(!queue.isEmpty()) 
		  {
			  Node n=queue.poll();
			  System.out.println(n.data);
			  if(n.left!=null)
			  { 
				  queue.add(n.left);
			  }
			  if(n.right!=null)
			  { 
				  queue.add(n.right);
			  }
		  }
		  
	  }
	
	  public void delete(int data)
	  { 
		  Node n=findNode(data);
	     	  
	  }
	  
	  public Node getRoot() 
	  {
		  return root;
	  }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bs=new BinarySearchTree();
		bs.addNode(5);
		bs.addNode(3);
		bs.addNode(7);
		bs.addNode(2);
		
		bs.addNode(4);
		bs.addNode(6);
		bs.addNode(8);
		System.out.println("root-->"+bs.getRoot().data);
		System.out.println("left--->"+bs.getRoot().left.data);
		System.out.println("right------>"+bs.getRoot().right.data);
		
		bs.inOrder(bs.getRoot());
		System.out.println("pre order traversal");
		bs.preOrder(bs.getRoot());
		System.out.println("post order traversal");
		bs.postOrder(bs.getRoot());
		System.out.println("level order traversal");
		bs.levelOrderTraversing();
	}

}
