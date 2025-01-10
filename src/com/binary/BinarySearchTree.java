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
	  public Node getRoot() 
	  {
		  return root;
	  }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinarySearchTree bs=new BinarySearchTree();
		bs.addNode(10);
		bs.addNode(7);
		bs.addNode(8);
		bs.addNode(11);
		bs.addNode(6);
		bs.addNode(4);
		System.out.println("root-->"+bs.getRoot().data);
		System.out.println("left--->"+bs.getRoot().left.data);
		System.out.println("right------>"+bs.getRoot().right.data);
		
		bs.inOrder(bs.getRoot());
		System.out.println("pre order traversal");
		bs.preOrder(bs.getRoot());
		System.out.println("post order traversal");
		bs.postOrder(bs.getRoot());
	}

}
