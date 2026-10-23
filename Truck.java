public class Truck extends Vehicle{
int numOfWheels;

public Truck (String brand, String model, int year, int numOfWheels){
    super(brand, model, year);
    this.numOfWheels = numOfWheels;
}

@Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("Number of Wheels: " + numOfWheels);
}
}