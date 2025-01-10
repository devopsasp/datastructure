package calc;

import sample.Sample;

interface Intrest
{ 
	default void calculate()
	{ 
		System.out.println("calculating intrest");

	}
}
public class Calculator implements Intrest{
	
	  public void calculate() 
	  { 
		  System.out.println("calculating in class");
	  }

	public static void main(String[] args) {
		   Calculator obj=new Calculator();
		   obj.calculate();
		   Sample sample=new Sample();
		
		// TODO Auto-generated method stub

	}

}
