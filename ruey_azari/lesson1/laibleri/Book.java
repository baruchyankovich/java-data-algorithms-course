package laibleri;

public class Book extends Item{

    protected String author;
    protected int numPages;

    public Book (int id,String titel ,String author,int numPages){
        super( titel,id);
        this.author=author;
        this.numPages=numPages;
    }
    public String getAuthor() {
        return author;
    }
    public int getNumPages() {
        return numPages;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    public  double calculateReadingTime( ){
        return numPages/30;
    }
    @Override
    public String toString() {
        return super.toString() + " author: " + author + ", numPages: "+numPages;
    }
    
}
