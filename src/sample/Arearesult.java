package sample;
class Area1
{double circle, rectangle,cuboid; 
	Area1(int r)
	{
		circle=3.14*r*r;
		System.out.println("area of circle="+circle);
	}
	Area1(int l,int b)
	{
		rectangle=l*b;
		System.out.println("area of Rectangle="+rectangle);
	}
	Area1(int l,int b,int h)
	{
	cuboid=l*b*h;
	System.out.println("area of Cuboid="+cuboid);
	}	
}
public class Arearesult {
	public static void main(String[] args) {
	Area1 obj=new Area1(2);
	Area1 obj1=new Area1(2,3);
	Area1 obj2=new Area1(2,3,4);
}}