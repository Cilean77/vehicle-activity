

public class Main {

	public static void printDetails(Vehicle vehicle){
			vehicle.displayInfo();
			vehicle.moveForward();
			vehicle.moveBackwards();
			vehicle.moveLeft();
			vehicle.moveRight();
			System.out.println(" ");
		}
	
		public static void performService(Serviceable item) {
        item.service();
    }

	public static void main(String[] args) {
		
		//objects of each class
		Serviceable car1 = new Car("Chevrolet", "Corvette", 1963, 4);
		Serviceable motor = new Motorcycle("Honda", " ADV160", 2026, "Basta modagan");
		Serviceable truck1 = new Truck("Isuzu", "FRR90MS", 2026, 6);
		Serviceable printer1 = new Printer();

		//Polymorphism using Arrays
		Vehicle[] vehicles = {
			new Car("Chevrolet", "Corvette", 1963, 4),
			new Motorcycle("Honda", " ADV160", 2026, "Basta modagan"),
			new Truck("Isuzu", "FRR90MS", 2026, 6)
		};
		//loop for vehicles
		for(Vehicle currentVehicle: vehicles){
			printDetails(currentVehicle);
		}

		Serviceable[] service = {
			car1,
			motor,
			truck1,
			printer1
		};

		System.out.println(" ");
		//loop for serviceable
		for(Serviceable currentService: service){
			performService(currentService);
		}
}
}
