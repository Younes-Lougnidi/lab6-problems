package Problem3;

public class Novel extends Book{
    private double price;
    public Novel(String title, Library lib ,String author , int nbrPages,double price ){
        super(title,lib,author,nbrPages);
        this.price= price;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
