import java.util.List;
import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private List<Integer>reviews;

    public Book() {
    }

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews = new ArrayList<>();
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setReviews(List<Integer> reviews) {
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public List<Integer> getReviews() {
        return reviews;
    }

    //Method
    public void addReview(int rating) {
        reviews.add(rating);
    }

    public double getAverageRating() {
        return reviews.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
    public void purchase(User user){
        if (stock > 0) {
            user.getPurchasedMediaList().add(this);
            stock--;
        } else {
            System.out.println("Out of stock!");
        }
    }
    public boolean isBestseller(){
        return getAverageRating() >= 4.5;
    }
    public void restock(int quantity){
        stock += quantity;
        System.out.println(quantity + " units added to stock.");
    }
    public String getMediaType(){
       // return "media";
        return isBestseller() ? "Bestselling Book" : "Book";
    }

    @Override
    public String toString() {
        return super.toString() + ", stock=" + stock;
//        return "Book{" +
//                "stock=" + stock +
//                ", reviews=" + reviews +
//                '}';
    }
}
