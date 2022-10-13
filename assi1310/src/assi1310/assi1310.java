package assi1310;
import java.util.Scanner;
public class assi1310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for grouping student
		//1st example
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your roll no");
		int x=sc.nextInt();
		if (x%4==1)
		{
			System.out.println("Your are in Sapphire");
		}
		else if (x%4==2)
		{
			System.out.println("Your are in Perl");
		}
		else if (x%4==3)
		{
			System.out.println("Your are in Ruby");
		}
		else if (x%4==0)
		{
			System.out.println("Your are in Emerald");
		}

		
		
		
		
		
		
		
		//pattern
		//2nd example
		System.out.println("Enter a number");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			
			}
			for (int k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		//triangle price
		//3rd 
		System.out.println("enter 1st angle");
		int a = sc.nextInt();
		System.out.println("enter 2nd angle");
		int b = sc.nextInt();
		System.out.println("enter 3rd angle");
		int c = sc.nextInt();
		int p =a+b+c;
		if(p==180&&(a==60&&b==60&&c==60)) 
		{
			System.out.println("3 Prize");
		}
		else if (p==180&&(a==90||b==90||c==90))
		{
			System.out.println("2 Prize");
		}
		else if (p==180)
		{
			System.out.println("1 Prize");
		}
		else 
		{System.out.println("no price");
		
		
		
	}
}
}


       


		

	


