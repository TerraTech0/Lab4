public class Movie extends Product{
    private String director;
    private double discount;

//    public Movie(String director, double discount) {
//        this.director = director;
//        this.discount = discount;
//    }

    public Movie(String name, double price, String director, double discount) {
        super(name, price);
        this.director = director;
        this.discount = discount;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getDiscount() {
        return getPrice()*(discount/100);
    }
}
