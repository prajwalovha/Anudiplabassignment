package Ifelse;
import java.util.Scanner;
public class ClassRollNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner no= new Scanner(System.in);
System.out.println("enter your roll no");
int x =no.nextInt();
/*if (y==(x*2)+1)
{System.out.println("you are in emevld");}

else if (y==(x*2)+2)
{System.out.println("you are in ruby");}


else if (y==(x*2)+3)
{System.out.println("you are in pirl");}

else if (y==(x*2)+4)
{System.out.println("you are in saphive");}*/


if (x%4==1) {System.out.println("you are in emerald  group");}
else if (x%4==2) {System.out.println("you are in ruby  group");}
else if (x%4==3) {System.out.println("you are in pirl group");}
else if ( x%4==0) {System.out.println("you are in saphive  group");}







	}

}
