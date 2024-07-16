import java.util.ArrayList;
import java.util.List;
public class User {
    private String  username;
    private String   email;
    private List<Media> purchasedMediaList;
    private List<Media> shoppingCart;

        public User() {
        }

        public User(String username, String email) {
            this.username = username;
            this.email = email;
            this.purchasedMediaList = new ArrayList<>();
            this.shoppingCart = new ArrayList<>();
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<Media> getPurchasedMediaList() {
            return purchasedMediaList;
        }

        public List<Media> getShoppingCart() {
            return shoppingCart;
        }

        public void addToCart(Media media) {
            shoppingCart.add(media);
        }

        public void removeFromCart(Media media) {
            shoppingCart.remove(media);
        }

        public void checkout() {
            purchasedMediaList.addAll(shoppingCart);
            shoppingCart.clear();
        }

        @Override
        public String toString() {
            return "User{" +
                    "username='" + username + '\'' +
                    ", email='" + email + '\'' +
                    ", purchasedMediaList=" + purchasedMediaList +
                    ", shoppingCart=" + shoppingCart +
                    '}';
        }
}
