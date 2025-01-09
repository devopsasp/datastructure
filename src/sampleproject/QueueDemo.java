package sampleproject;

public class QueueDemo {
	int[] arr=new int[10];
	 private int rear;
	 private int front;
	 
	 QueueDemo() 
	 { 
		 rear=-1;
		 front=0;
	 }
	 public void enqueue(int data)
	 { 
		 if(rear==arr.length-1)
		 {
			 System.out.println("queue is full");
			 return;
		 }
			 rear++;
			 arr[rear]=data;
	 }
	 
	 public int deque() 
	 { 
		 if(front>rear)
		 { 
			 System.out.println("queue is now empty");
			 return -1;
		 }
		 int data=arr[front];
		 front++;
		 return data;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueDemo obj=new QueueDemo();
		obj.enqueue(10);
		obj.enqueue(23);
		obj.enqueue(13);
		obj.enqueue(12);
		obj.enqueue(11);
		obj.enqueue(16);
		obj.enqueue(21);
		obj.enqueue(27);
		obj.enqueue(32);
		obj.enqueue(61);
		obj.enqueue(67);
		System.out.println(obj.deque());
		System.out.println(obj.deque());
		System.out.println(obj.deque());
		System.out.println (obj.deque());
		System.out.println (obj.deque());
		System.out.println(obj.deque());
		System.out.println(obj.deque());
		System.out.println(obj.deque());
		System.out.println (obj.deque());
		System.out.println (obj.deque());
		System.out.println (obj.deque());
		
	}

}
