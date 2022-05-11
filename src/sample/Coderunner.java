package sample;

class Flipkart{
	
	String product_name;
	int price;
	double rating;
	
	
	void getProductName(String product_name) {
		
		this.product_name=product_name;
		
	}
	
	
	void getPrize(int price) {
		
		this.price=price;
		
	}


	void getPrize(int mrp,int discount) {
	
		this.price=mrp-discount;
	}


	void getRating(double rating) {
	
		this.rating=rating;
	
	}

	void display_details(){
	
		System.out.println("name of the product  " + product_name);
	
		System.out.println("price of the product  " + price);

		System.out.println("rating of the product  " + rating);

}

}

class Fashion extends Flipkart{
	

	String product_name;
	int price;
	double rating;
	
	
	void getProductName(String product_name) {
		
		this.product_name=product_name;
		
	}
	
	
	void getPrize(int price) {
		
		this.price=price;
		
	}


	void getPrize(int mrp,int discount) {
	
		this.price=mrp-discount;
	}


	void getRating(double rating) {
	
		this.rating=rating;
	
	}

	void display_details(){
	
		System.out.println("name of the product  " + product_name);
	
		System.out.println("price of the product  " + price);

		System.out.println("rating of the product  " + rating);

}
}
	
	


class Electronic_appliances extends Flipkart {
	

	String product_name;
	int price;
	double rating;
	
	
	void getProductName(String product_name) {
		
		this.product_name=product_name;
		
	}
	
	
	void getPrize(int price) {
		
		this.price=price;
		
	}


	void getPrize(int mrp,int discount) {
	
		this.price=mrp-discount;
	}


	void getRating(double rating) {
	
		this.rating=rating;
	
	}

	void display_details(){
	
		System.out.println("name of the product  " + product_name);
	
		System.out.println("price of the product  " + price);

		System.out.println("rating of the product  " + rating);

}

}
	
	

class Beauty extends Flipkart{
	

	String product_name;
	int price;
	double rating;
	
	
	void getProductName(String product_name) {
		
		this.product_name=product_name;
		
	}
	
	
	void getPrize(int price) {
		
		this.price=price;
		
	}


	void getPrize(int mrp,int discount) {
	
		this.price=mrp-discount;
	}


	void getRating(double rating) {
	
		this.rating=rating;
	
	}

	void display_details(){
	
		System.out.println("name of the product  " + product_name);
	
		System.out.println("price of the product  " + price);

		System.out.println("rating of the product  " + rating);

}
	
	
	
}
class Home extends Flipkart{

	String product_name;
	int price;
	double rating;
	
	
	void getProductName(String product_name) {
		
		this.product_name=product_name;
		
	}
	
	
	void getPrize(int price) {
		
		this.price=price;
		
	}


	void getPrize(int mrp,int discount) {
	
		this.price=mrp-discount;
	}


	void getRating(double rating) {
	
		this.rating=rating;
	
	}

	void display_details(){
	
		System.out.println("name of the product  " + product_name);
	
		System.out.println("price of the product  " + price);

		System.out.println("rating of the product  " + rating);

}

}












class Coderunner {

	public static void main(String[] args) {
		
		Fashion oFashion = new Fashion();
		
		oFashion.getProductName("saree");
		oFashion.getPrize(6000, 1000);
		oFashion.getRating(4.5);
		oFashion.display_details();
		
		Electronic_appliances oElectronic_appliances = new Electronic_appliances();
		
		oElectronic_appliances.getProductName("TV");
		oElectronic_appliances.getPrize(60000, 1600);
		oElectronic_appliances.getRating(4.5);
		oElectronic_appliances.display_details();
		
		Beauty oBeauty = new Beauty();
		
		oBeauty.getProductName("Nail polish");
		oBeauty.getPrize(900);
		oBeauty.getRating(4.9);
		oBeauty.display_details();
		
		Home oHome = new Home();
		
		oHome.getProductName("Flower vase");
		oHome.getPrize(400);
		oHome.getRating(4);
		oHome.display_details();

	}

}
