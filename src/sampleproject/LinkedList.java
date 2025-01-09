package sampleproject;

public class LinkedList {
	
	Node START;
	public LinkedList() 
	{ 
		
		 START=null;
		 
	}
	void add(int data)
	{ 
		Node n=new Node(data,null);
		if(START==null)
		{ 
			n.next=START;
			START=n;
   		return;	
 		}
		Node temp;
		for(temp=START;temp.next!=null;temp=temp.next) {
			
			
		}
		temp.next=n;
		
	

	}
	public void traverse() 
	{
		Node temp;
		for(temp=START;temp!=null;temp=temp.next)
		{ 
			 System.out.println(temp.data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList obj=new LinkedList();
		obj.add(12);
		obj.add(23);
		obj.add(11);
		obj.add(19);
		obj.add(15);
		obj.traverse();
	}

}
