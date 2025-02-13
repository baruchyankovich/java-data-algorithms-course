package Cars;

public class Vehicle {
    protected String brand;
    protected int maxSpeed ;

    public Vehicle (String brand,int maxSpeed){
        this.brand=brand;
        this.maxSpeed=maxSpeed;
    }
    public String getBrand() {
        return brand;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    

}
