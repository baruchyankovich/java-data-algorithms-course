package zoo;

public class Animal {
    protected String name ;
    protected int age ;
    
    public Animal(String nane ,int age) {
        this.age=age;
        this.name=nane;

    }

    public int getAge() {
        return age;
    };
    public String getName() {
        return name;
    };
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    };
    
    public String toString() {
        
        return "name: "+name +", age: "+ age+","; 
    }
}
