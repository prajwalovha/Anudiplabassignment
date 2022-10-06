package Forloop;
import java.util.Scanner;
public class terminatorBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*for (int i=1;i<=10;i++) {
	if(i<=5)
	{System.out.println(i);}
	else	
		break;}


System.out.println("terminated");*/
		
		
		
		//amstrong number
		/*int a,arm=0,n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		temp=n;
		for( ;n!=0;n/=10 )
		{
			a=n%10;
			arm=arm+(a*a*a);
		}
		if(arm==temp)
		System.out.println(temp+" is a armstrong number ");
		else
		System.out.println(temp+" is not a armstrong number ");
		*/
		
		
		//fibonarki
	/*	int n=10; // 0,1,1,2,3,5,8,13,21,34
		int a0=0, a1=1 ,a2;
		System.out.println(a0+" "+a1);
		for (int i=3;i<=10;i++)
		{a2=a0+a1;
		System.out.println(a2+" ");
		a0=a1;
		a1=a2;
			
*/
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for fibonacci");
		int n= sc.nextInt();
		
		int a0=0, a1=1 ,a2;
		System.out.println(a0+" "+a1);
		for (int i=1;i<=n;i++)
		{a2=a0+a1;
		System.out.println(a2+" ");
		a0=a1;
		a1=a2;
			*/
		
		
		
		// pyramid output
		/*		for (int i=1;i<=3;i++) 
		  {
		for (int j=1;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
	
		for(int i=1;i<=5;i++)
		{
				for(int j=1;j<=i;j++) 
				{
					System.out.print("*");
				}
				System.out.println();
	}
		
		
		
		for (int i=5;i>=1;i--) 
		  {
		for (int j=1;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		*/
		
		// pyrimid for 1234
		/*for(int i=1;i<=5;i++)
		{
				for(int j=1;j<=i;j++)  
				{
					System.out.print(i);
				}
				System.out.println();
				
	}
		for(int i=1;i<=5;i++)
		{
				for(int j=1;j<=i;j++) 
				{
					System.out.print(j);
				}
				System.out.println();
		}*/
		
			int x=0;
		for(int i=1;i<=5;i++)
		{
				for(int j=5;j>=x+1;j--) 
				{
					System.out.print(j);
				}
				for (int k=x+1;k<=5;k++)
				{System.out.print(k);}
				System.out.println();
				x=x+1;
		}
		
		
		
		
	
	}

}
