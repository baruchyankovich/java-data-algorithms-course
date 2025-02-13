
public class Fruit {

protected String name ;
protected String color ;
public Fruit (String name,String color){
    this.name= name;
    this.color= color;
}
public void getFruitDeails (){
    System.out.print(name +' '+ color);
}
public String getName(){
    return name;
}
public String getColor(){
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public void setName(String name) {
    this.name = name;
}

    
}
