package sampleproject;

public class Duplicates {

	static int[] i={12,11,14,13,14,16,15,12,22};

	public static void findDuplicate() 
	{ 
		
		int duplicate=0;
		for(int x=0;x<i.length;x++)
		{
			int temp=i[x];
			for(int j=1 ;j<i.length;j++)
			{
			
			if(temp==i[j])
			{  
				  duplicate++;
				  break;
			}
			}
			
		}
		System.out.println(duplicate);
	}
	public static void main(String args[])
	{
		findDuplicate();
	}

}
