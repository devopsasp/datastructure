package recursive;

public class LinkedList {

	Node START;
	public LinkedList() 
	{ 
		START=null;
	}
	public void add(int data)
	{ 
		START=addRecursively(data,START);
	}
	public Node addRecursively(int data,Node node)
	{ 
	   if(node==null)
	   { 
		   return new Node(data,null);
	   }
	   node.next=addRecursively(data,node.next);
	   return node;
	}
	
	public void traverse() 
	{
		
		 traverseRecursively(START);
	
	}
	public void traverseRecursively(Node current) 
	{
		 if(current==null) 
		 { 
			 return;
		 }
		 System.out.println(current.data);
		 traverseRecursively(current.next);
	}

	public static void main(String args[])
	{
		LinkedList list=new LinkedList();
		
		list.add(10);
		list.add(22);
		list.add(23);
		list.add(11);
		list.add(19);
		list.add(15);
		list.traverse();
	}
}
