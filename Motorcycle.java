public class Motorcycle extends Vehicle{
String engineType;

public Motorcycle (String brand, String model, int year, String engineType){
    super(brand, model, year);
    this.engineType = engineType;
}

@Override
public  void moveForward(){
    System.out.println("A motor moves forward");
};
@Override
public  void moveBackwards(){
    System.out.println("A motor moves backward");
};
@Override
public  void moveLeft(){
    System.out.println("A motor moves left");
};
@Override
public  void moveRight(){
    System.out.println("A motor moves right");
};


@Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("Engine Type: " + engineType);
}
}