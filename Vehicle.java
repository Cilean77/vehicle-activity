

public class Vehicle {
	private String brand;
	private String model;
	private int year;

	public Vehicle(String brand, String model, int year){
		this.brand = brand;
		this.model = model;
		if(year >= 1886 && year <= 2026){
			this.year = year;
		}else{
			this.year = 2026;
		}
		
	}

	//Setters & getters
	public String getBrand(){
		return brand;
	}
	public String getModel(){
		return model;
	}
	public boolean setYear(int year){
		if(year >= 1886 && year <= 2026){
			this.year = year;
			return true;
		}else{
			return false;
		}
	}
	public int getYear(){
		return year;
	}

	//Methods
	public void displayInfo() {
		System.out.println("Brand: " + brand + " Model: " + model + " Year: " + year);
	}
	
	public int calculateAge() {
		return 2026 - year;
	}
	
	public boolean isVintage() {
		if(calculateAge() > 25) {
			return true;
		}else {
			return false;
		}
	}
}
