package assi0310;


class Circle extends Shape
{
	public void getArea()
	{
		int r=2;
		double pi=3.14;
		double area =pi*r*r;// area of circle
		System.out.println("Area of circle is "+ area);//to print area
	}
}
class Triangle extends Shape
{
	public void getArea()
	{
		int l=2;
		int h=2;
		double area=(l*h)/2;// area of Triangle
		System.out.println("Area of Triangle is "+ area);//to print area
	}
}
public class Shape {

	public static void main(String[] args) {
		// hello its me...
		Circle c=new Circle();//creating object
		c.getArea();//calling method
		Triangle t=new Triangle();//creating object
		t.getArea();//calling method

	}

}
