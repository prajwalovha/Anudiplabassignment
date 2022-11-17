package Assi_6th_1711;

import java.lang.reflect.Array;

class TRD2
{
	
}


public class ThreadExample extends TRD2 implements Runnable{
	public void run()
	{  System.out.println("current TRD "+Thread.currentThread().getName());
		float result=0;
	    float avg=0;
	
		for (float i=1;i<=50;i++)
		{
			result= result +i;
			 avg=result/50;
		}
		System.out.println("The avg of 1 to 50 is = "+avg);
	}

	public static void main(String[] args) {
		ThreadExample obj =new ThreadExample();
		Thread t1 = new Thread(obj);
		 System.out.println("current TRD "+Thread.currentThread().getName());
		t1.start();
		
		int [] arr = {10,15,20,25,30};
		int square =1; 
		for (int i=0;i<arr.length;i++)
		{
			square =arr[i]*arr[i];
			System.out.println(arr[i]+" square is  "+square);
		}
		

	

	
		
	}

}
