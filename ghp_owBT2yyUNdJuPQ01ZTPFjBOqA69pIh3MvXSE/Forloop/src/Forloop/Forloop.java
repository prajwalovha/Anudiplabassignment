package Forloop;
import java.util.Scanner;
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for(int i=1;i<=100;i=i+2)
{System.out.println("value of i is  "+ i);}*/
		
		
		
		
		// sum of 100 no.
		/*int sum = 0;
		for(int i = 1; i <=50; i++) {
		sum += i;}
		System. out. println("Sum of first 100 numbers is  " + sum);*/
		
		
		//multiplication table
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("enter the no for which you want multiplication table ");
		int a =sc.nextInt();
		for (int i =1;i<=10;i++) {
			int n=a*i;
			System. out. println(a +"*"+i+"="+n);}*/
		
		
		//factorial loop
	 /*
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no for which you want thats factor ");
		int num =sc.nextInt();
		int mul=1;
		for (int i=1;i<=num;i++)
		{
			mul*=i;
			
		}
		System.out.println(mul);*/
		
		
		
		
		// loop for prime no.
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to verify is it a prime no. ");
		int num =sc.nextInt();
		
		boolean flag= true;
		
		 for (int i =2;i<num;i++)
			 
		 {
			 if (num%i==0)
		 {System.out.println("this is composite no");
		 flag=false;
		 break;}
		 }
		 
		 if (flag)
		 {System.out.println("this is prime no");}*/
		
		
		
		//fro loop for x power
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the the of x in eq. x^y ");
		int x =sc.nextInt();
		
		System.out.println("enter the the of y in eq. x^y ");
		int y =sc.nextInt();
		int r = 1;
		for (int i=1;i<=y;i++) {
		
		r*=x;}
		System.out.println( r );
		
		


		
	}

}