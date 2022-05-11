package sample;
class Navya 
{
String shape, colour; 
int size;
Navya(String shape,String colour,int size)
{
	System.out.println("shape="+shape);
	System.out.println("colour="+colour);
	System.out.println("size="+size);
	}

}




public class Executable {
	static String name="mohan";
	
	static void show()
	{
		System.out.println("name="+name);
	}
	
	
	public static void main(String[] args) {
	
		Navya obj=new Navya("square","blue",16);
		show();
	}
}
