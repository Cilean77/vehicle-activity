public class Truck extends Vehicle{
int numOfWheels;

public Truck (String brand, String model, int year, int numOfWheels){
    super(brand, model, year);
    this.numOfWheels = numOfWheels;
}

@Override
public  void moveForward(){
    System.out.println("A truck moves forward");
};
@Override
public  void moveBackwards(){
    System.out.println("A truck moves backward");
};
@Override
public  void moveLeft(){
    System.out.println("A truck moves left");
};
@Override
public  void moveRight(){
    System.out.println("A truck moves right");
};

@Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("Number of Wheels: " + numOfWheels);
}
}