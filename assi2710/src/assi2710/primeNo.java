package assi2710;

public class primeNo {

	public static void main(String args[])
	{int temp =0;
System.out.println("the prime between 100 to 200 are");
		for(int n =100;n<=200;n++)// will have value btn 100 - 200
		{
		
		for (int i=2;i<=n-1;i++)
		{
			if(n%i==0)//if reminder is 0 will increment by 1
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(n);
		}
		else
		{
			temp=0;
		}
		}	
	}
}