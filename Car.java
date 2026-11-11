public class Car extends Vehicle implements Serviceable{
int numOfDoors;

public Car (String brand, String model, int year, int numOfDoors){
    super(brand, model, year);
    this.numOfDoors = numOfDoors;
}

@Override
public  void moveForward(){
    System.out.println("A car moves forward");
};
@Override
public  void moveBackwards(){
    System.out.println("A car moves backward");
};
@Override
public  void moveLeft(){
    System.out.println("A car moves left");
};
@Override
public  void moveRight(){
    System.out.println("A car moves right");
};

@Override
public void service(){
    System.out.println("Check oil and brakes");
}

@Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("Number of Doors: " + numOfDoors);
}
}