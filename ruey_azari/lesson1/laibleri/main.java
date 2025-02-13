package laibleri;

public class main {
    public static void main(String[] args) {
        
        Item item = new Item("General Item",1);
        System.out.println(item);

       
        Book book = new Book(2, "Java for Beginners", "John Doe", 120);
        System.out.println(book);

       
        System.out.println("Estimated reading time: " + book.calculateReadingTime() + " hours");

        
        book.setAuthor("Jane Smith");
        book.setNumPages(300);

        System.out.println("Updated book details: " + book);

        DigitalBook digitalBook = new DigitalBook(5,"String titel" ,"String author",5,45.5);

        System.out.println(digitalBook);
    }
}
