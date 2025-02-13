package zoo;

public class Bird  extends Animal{
    public boolean wingsLength;
    
    
    public Bird (String nane ,int age,boolean wingsLength){
        super(nane, age);
        this.wingsLength=wingsLength;
    }
    public boolean getWingsLength(){
        return wingsLength;
    }
    public void setWingsLength(boolean wingsLength) {
        this.wingsLength = wingsLength;
    }
    @Override
    public String toString() {
        return super.toString() +" wingsLength: "+ wingsLength +",";
    }
}