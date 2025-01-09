package stackdemo;

public class StackDemo {
	
	int[] arr=new int[10];
	int TOP=-1;
	public void push(int data)
	{ 
		TOP++;
		arr[TOP]=data;
	}
	public int pop() 
	{ 
		 int data=arr[TOP];
		 TOP--;
		 return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackDemo obj=new StackDemo();
		obj.push(10);
		obj.push(12);
		obj.push(11);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
	}

}
