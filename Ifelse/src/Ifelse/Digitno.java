package Ifelse;
import java.util.Scanner;
public class Digitno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner paju = new Scanner (System.in);
System.out.println("enter no" );
int x = paju.nextInt();


if (x>=0 && x<=9) {System.out.println("enter no is one digit");}
else if (x>=10  && x<=99) {System.out.println("enter no is two digit");}
else if (x>=100 &&   x<=999) {System.out.println("enter no is three digit");}
else if (x>=1000 &&  x<=9999) {System.out.println("enter no is four digit");}
else if (x>=10000 &&  x<=99999) {System.out.println("enter no is five digit");}
else if (x>=99999){System.out.println("enter no is more than five digit");}
	
	
	
	
	}

}
