package Cars;

public class SportCar extends Car {
    private int horsepower;

    public SportCar(String brand, int maxSpeed, double fuelCapacity, int horsepower) {
        super(brand, maxSpeed, fuelCapacity); // קריאה נכונה ל־super
        this.horsepower = horsepower;  
    }

    public int getHorsepower() {
        return horsepower;
    }

    public boolean goodForRace(){
        return horsepower>300;
    }

    
}
