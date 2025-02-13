package zoo;

public class Mammal extends Animal {
    protected boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }
    public boolean getHasFur(){
        return hasFur;
    }
    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    @Override
    public String toString() {
 
        return super.toString()+ " hasFur: "+hasFur+",";
    }

}
