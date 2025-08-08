/*AUTHOR:DIYAKRISHNA
 * DATE:08/08/2025
 */
class Vehicle{
	String brand;
	String model;
	Vehicle(String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayInfo() {
		System.out.println("Brand :"+brand);
		System.out.println("Model :"+model);
	}
}
class Car extends Vehicle{
	String fueltype;
	Car(String brand,String model,String fueltype){
		super(brand,model);
		this.fueltype=fueltype;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Fuel type :"+fueltype);
	}
}
class ElectricCar extends Car{
	double batteryCapacity;
	ElectricCar(String brand,String model,String fueltype,double batterCapacity){
		super(brand,model,fueltype);
		this.batteryCapacity=batterCapacity;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Battery Capacity :"+batteryCapacity);
}
}
public class Task11 {
	public static void main(String[] args) {
		ElectricCar car=new ElectricCar("Brand 1","Model 1","Fueltype 1",100.00);
		car.displayInfo();
	}
}
