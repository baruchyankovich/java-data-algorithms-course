package laibleri;

public class DigitalBook extends Book{
    private double fileSize;

    public DigitalBook(int id,String titel ,String author,int numPages,double fileSize){
        super(id, titel, author, numPages);
        this.fileSize=fileSize;

    }
    public double getFileSize() {
        return fileSize;
    };
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    };
    public boolean isLargeFile(){
        return fileSize>100;
    }
    @Override
    public String toString() {
        return super.toString() + ", File Size: " + fileSize + " MB";
    }
    
}
