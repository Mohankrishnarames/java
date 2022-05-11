package sample;
class Area
{
	int a;

Area(int b){
	super();
	System.out.println("hello1"+a);
}
Area(double d){
	this(2);
	System.out.println("hello2"+a);
	
}
void show()
{
System.out.println(a);
}
}

public class Resultofarea {

	public static void main(String[] args) {
		Area obj=new Area(2);
		
	}

}
