package sample;
class Animal{
String name,breed,colour;

void show(String name,String breed,String colour)
{
	System.out.println("name="+name );
	System.out.println("breed="+breed);
	System.out.println("colour="+colour);
	}

	
	
}
class Bird{
String breed,colour,legs;
void show(String breed,String colour,String legs)
{
	System.out.println("breed="+breed );
	System.out.println("colour="+colour);
	System.out.println("legs="+legs);
	}
}

class Vechile{
String model,brand,speed;
void show(String model,String brand,String speed)
{
	System.out.println("model="+model );
	System.out.println("brand="+brand);
	System.out.println("speed="+speed);
	}
}
class Mobile{
String brand,version,memory;
void show(String brand,String version,String memory)
{
	System.out.println("brand="+brand );
	System.out.println("version="+version);
	System.out.println("memory="+memory);
	}
}
class Employee{
String name,id,role;
void show(String name,String id,String role)
{
	System.out.println("name="+name );
	System.out.println("id="+id);
	System.out.println("role="+role);
	}
}
class Student{
String name,section,roll;
void show(String name,String section,String roll)
{
	System.out.println("name="+name );
	System.out.println("section="+section);
	System.out.println("roll="+roll);
	}

	
}
class Fan{
String Brand,wings,colour;
void show(String name,String section,String roll)
{
	System.out.println("Brand="+Brand );
	System.out.println("wings="+wings);
	System.out.println("colour="+colour);
	}

	
}



 
public class Use {
	public static void main(String[] args) {
	
	Animal obj=new Animal();
	obj.show("Dog","lab","brown");
	Bird obj1=new Bird();
	obj1.show("crow", "brown","2legs");
	Vechile obj2=new Vechile();
	obj2.show("honda","black","100kms");
	Employee obj3=new Employee();
	obj3.show("navya","26","trainee");
	Student obj4=new Student();
	obj4.show("navya","5th b","4747");
	Fan obj5=new Fan();
	obj5.show("havells","4","brown");
	Mobile obj6=new Mobile();
	obj6.show("samsung","android10","6gb");
	}
	

}
