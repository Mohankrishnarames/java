package sample;
class Mohan
{
	int height ;
	public Mohan(int height) {
		height=height;
		System.out.println("m invoked");
		
	}

	}
class Mohan2 extends Mohan
{
	int weight,size;
	public Mohan2(int weight,int size) {
		super(70);
		System.out.println("m2 invoked");
	this.weight=weight;
	size=size;
	System.out.println(weight);
	System.out.println(size);
	

	}	
}
class Mohan3 extends Mohan2
{
	int colour;
	public Mohan3(int colour) {
		super(90,10);
	
		System.out.println("m3invoked");
	this.colour=colour;
	
	System.out.println(weight);
	System.out.println(size);
	

	}	
}
public class Inheritance {
	public static void main(String[] args) {
		Mohan3 obj = new Mohan3(65);
		
		System.out.println(obj.height);
		
	}

}
