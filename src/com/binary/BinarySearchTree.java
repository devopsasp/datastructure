package com.binary;

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
	  
	  public void addNode(int data)
	  { 
		  if(root==null)
		  {
			  root=new Node(data);
			  return;
			  
		  }
		  
			  Node current=root;
			  Node parent=null;
			  while(true)
			  { 
				  parent=current;
				  if(data<current.data)
				  { 
					  current=current.left;
					  if(current==null) 
					  { 
						  Node n=new Node(data);
						  parent.left=n;
						  return;
					  }
				  }
				  if(data>current.data)
				  { 
					  current=current.right;
					  if(current==null)
					  { 
						  Node n=new Node(data);
						  parent.right=n;
						  return;
					  }
				  }
				  
				  
				  
			  }
		  
	  }
	  
	  public Node getRoot() 
	  {
		  return root;
	  }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bs=new BinarySearchTree();
		bs.addNode(10);
		bs.addNode(7);
		bs.addNode(11);
		bs.addNode(6);
		bs.addNode(4);
		System.out.println("root-->"+bs.getRoot().data);
		System.out.println("left--->"+bs.getRoot().left.data);
		System.out.println("right------>"+bs.getRoot().right.data);
		System.out.println("left of left "+bs.getRoot().left.left.data);
		
	}

}
