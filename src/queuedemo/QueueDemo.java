package queuedemo;

public class QueueDemo {
	Node FRONT;
	Node REAR;
	
	public QueueDemo() 
	{ 
		FRONT=REAR=null;
	}
	public void enque(int data)
	{ 
		Node n=new Node(data,null);
		if(FRONT==null && REAR==null)
		{ 
			FRONT=REAR=n;
			return;
		}
		REAR.next=n;
		REAR=n;
		
	}
	public void deque()
	{ 
	    int data=FRONT.data;
	    FRONT=FRONT.next;
	    System.out.println(data);
	} 	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 QueueDemo obj=new QueueDemo();
 obj.enque(10);
 obj.enque(12);
 obj.enque(23);
 obj.enque(32);
 obj.enque(16);
 obj.enque(17);
 obj.deque();
 obj.deque();
 obj.deque();
 obj.deque();
 obj.deque();
 obj.deque();
	}

}
