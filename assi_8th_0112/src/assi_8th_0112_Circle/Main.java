package assi_8th_0112_Circle;


class Circle 
{
	private double pi;
	private int r;
	
	 public int getR() 
	 {
		return r;
	}

	public void setR(int r) 
	{
		this.r = r;
	}

	public Circle(int r) 
	{
		super();
		this.r = r;
	}

	public void Area() 
	{	
		 double pi=3.14;
		 double area=pi*r*r; 
		 System.out.println("Area of circle is :"+area);
		 
	}
}

public class Main 
{

	public static void main(String[] args) 
	{
		
		Circle c = new Circle(4);  
		c.Area();
		Circle c1=new Circle(20);  
		c1.Area();
	}

}