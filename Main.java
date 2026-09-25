package designaclass;

public class Main {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle("Chevrolet", "Corvette", 1963);
		Vehicle v2 = new Vehicle("Toyota", "RAV4", 2024);
		Vehicle v3 = new Vehicle("Honda", "Civic", 2015);
		
		//object1
		v1.displayInfo();
		System.out.println("Age: " + v1.calculateAge());
		System.out.println("Vintage: " + v1.isVintage());
		
		//object2
		v2.displayInfo();
		System.out.println("Age: " + v2.calculateAge());
		System.out.println("Vintage: " + v2.isVintage());	
		
		//object3
		v3.displayInfo();
		System.out.println("Age: " + v3.calculateAge());
		System.out.println("Vintage: " + v3.isVintage());	

	}

}
