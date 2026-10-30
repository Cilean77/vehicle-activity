

public class Main {

	public static void printDetails(Vehicle vehicle){
			vehicle.displayInfo();
			vehicle.moveForward();
			vehicle.moveBackwards();
			vehicle.moveLeft();
			vehicle.moveRight();

		}

	public static void main(String[] args) {
		

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
}
