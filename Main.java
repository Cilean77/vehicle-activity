package designaclass;

public class Main {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		
		//object1
		v1.brand = "Chevrolet";
		v1.model = "Corvette";
		v1.year = 1963;
		v1.displayInfo();
		System.out.println("Age: " + v1.calculateAge());
		System.out.println("Vintage: " + v1.isVintage());
		
		//object2
		v2.brand = "Toyota";
		v2.model = "RAV4";
		v2.year = 2024;
		v2.displayInfo();
		System.out.println("Age: " + v2.calculateAge());
		System.out.println("Vintage: " + v2.isVintage());	
		
		//object3
		v3.brand = "Honda";
		v3.model = "Civic";
		v3.year = 2015;
		v3.displayInfo();
		System.out.println("Age: " + v3.calculateAge());
		System.out.println("Vintage: " + v3.isVintage());	

	}

}
