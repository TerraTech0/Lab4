public class Book extends Product{
    private String author;
    private double discount;

    public Book(String author, double discount) {
        this.author = author;
        this.discount = discount;
    }

    public Book(String name, double price, String author, double discount) {
        super(name, price);
        this.author = author;
        this.discount = discount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    @Override
    public double getDiscount() {
        return getPrice() * (discount / 100);
    }
}
