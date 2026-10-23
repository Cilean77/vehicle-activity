public class Car extends Vehicle{
int numOfDoors;

public Car (String brand, String model, int year, int numOfDoors){
    super(brand, model, year);
    this.numOfDoors = numOfDoors;
}

@Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("Number of Doors: " + numOfDoors);
}
}