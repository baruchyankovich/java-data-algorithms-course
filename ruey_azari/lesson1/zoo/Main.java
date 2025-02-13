package zoo;

public class Main {
    public static void main(String[] args) {
       
        Animal animal = new Animal("doog", 3);
    
        System.out.println(animal);


        Bird bird =new Bird("hogel", 2, true);
        System.out.println("bird "+bird);
        bird.setWingsLength(false);
        
        System.out.println("After gainge "+bird);

        Mammal mammal=new Mammal("ddd", 3, false);
        System.out.println(mammal);



    }

    
}
