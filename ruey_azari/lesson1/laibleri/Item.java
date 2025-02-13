package laibleri;

public class Item {
    protected int id;
    protected String titel;

    public Item (String titel,int id){
        this.id=id;
        this.titel=titel;
    }
    public int getId() {
        return id;
    }
    public String getTitel() {
        return titel;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
   
    public String toString() {
        return "titel " + titel + ", id: " + id + ",";
    }
}
