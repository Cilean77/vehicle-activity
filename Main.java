

public class Main {

	public static void printDetails(Vehicle vehicle){
			vehicle.displayInfo();
		}

	public static void main(String[] args) {
		
		//Polymorphism using Parent as Reference, Upcasting 
		Vehicle vehicle = new Car("Chevrolet", "Corvette", 1963, 4);
		vehicle.displayInfo();

		System.out.println(" ");
		//Polymorphism using Methods
		Car car = new Car("Chevrolet", "Corvette", 1963, 4);
		Motorcycle motor = new Motorcycle("Honda", " ADV160", 2026, "Basta modagan");
		Truck truck = new Truck("Isuzu", "FRR90MS", 2026, 6);
	
		printDetails(car);
		printDetails(motor);
		printDetails(truck);

		System.out.println(" ");
		//Polymorphism using Arrays
		Vehicle[] vehicles = {
			new Car("Chevrolet", "Corvette", 1963, 4),
			new Motorcycle("Honda", " ADV160", 2026, "Basta modagan"),
			new Truck("Isuzu", "FRR90MS", 2026, 6)
		};
		
		for(Vehicle currentVehicle: vehicles){
			printDetails(currentVehicle);
		}

}
