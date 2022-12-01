package assi_8th_0112_electricity_bill;



import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Unit of electricity bill");
		int n;
		float a;
		n=sc.nextInt();
		if( n>0 && n<=100)
		{
			a=n*1.20f;
			System.out.println("Your elctricity bill is "+a+" Rs.");
		}
		else if (n>100&&n<=300)
		{
			a=n*2f;
			System.out.println("Your elctricity bill is "+a+" Rs.");
		}
		else if (n>300)
		{
			a=n*3f;
			System.out.println("Your elctricity bill is "+a+" Rs.");
		}
		else 
		{
			System.out.println("Invalid Input");
		}
		sc.close();
	}
}