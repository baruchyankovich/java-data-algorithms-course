package Cars;

public class Car extends Vehicle {
    protected double fuelCapacity;

    public Car(String brand,int maxSpeed,double fuelCapacity){
        super(brand,maxSpeed);
        this.fuelCapacity=fuelCapacity;

    }
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }
    public double calculateRange(){
        return fuelCapacity*15;
    }
    
}
    
    
