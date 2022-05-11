package sample;

class Movie
{
	String movie_name,actor,actress,director;
	int rating;
	
Movie(String movie_name,String actor,String actress,String director,int rating)
{
	
	this.movie_name=movie_name;
	this.actor=actor;
	this.actress=actress;
	this.director=director;
	this.rating=rating;
	}

void display()
{
System.out.println("movie_name="+movie_name);	
System.out.println("actor="+actor);	
System.out.println("actress="+actress);	
System.out.println("director="+director);	
System.out.println("rating="+rating);	

}




}

public class Movieexe {

	public static void main(String[] args) {
		Movie jilla=new Movie("jilla","vijay","kajal","director",6);
		jilla.display();
		Movie viswasam=new Movie("jilla","Ajith","kajal","director",9);
		viswasam.display();
		Movie ngk=new Movie("NGK","surya","Rakul","director",8);
		ngk.display();
		Movie asuran=new Movie("Asuran","dhanush","parvathy nair","vetri maran",7);
		asuran.display();
		
				
	}

}
