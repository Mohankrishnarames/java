package sample;
class Unary{
	int a=10;
	int b=++a;
	int c=(++a)+(a++);
	int d=a;
	void show()
	{
		System.out.println(c);
		System.out.println(d);

	}	
}

public class Operator {

	public static void main(String[] args) {
		
		Unary obj=new Unary();
		obj.show();	
 
		
	}

}
