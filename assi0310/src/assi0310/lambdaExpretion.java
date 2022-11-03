package assi0310;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;


interface Adder
{
	public int add(int a, int b);
}
public class lambdaExpretion {

	public static void main(String[] args)
	{
		
		
		// hello its me
		Adder d=(x,y)->
		{
			return x+y;
		};
		System.out.println(d.add(33,36)); 
		
		//lower case to upper case
		List<String> s1=new ArrayList<String>();
		s1.add("hello it's me...");
	    s1.forEach((m)->
	    {System.out.println(m.toUpperCase());
	    });
	    
	}

}


