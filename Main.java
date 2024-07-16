import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //  الكتب
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890", 15.99, 10);
        Book book2 = new Book("1984", "George Orwell", "2345678901", 12.99, 8);
        Book book3 = new Book("Moby Dick", "Herman Melville", "3456789012", 17.99, 5);

        //الافلام
        Movie movie1 = new Movie("Inception", "Christopher Nolan", "0987654321", 19.99, 148);
        Movie movie2 = new Movie("The Matrix", "The Wachowskis", "8765432109", 14.99, 136);
        Movie movie3 = new Movie("Interstellar", "Christopher Nolan", "7654321098", 21.99, 169);

        // الموسيقى
        Music music1 = new Music("Bohemian Rhapsody", "Queen", "1122334455", 1.29, "Queen");
        Music music2 = new Music("Hotel California", "Eagles", "2233445566", 1.99, "Eagles");
        Music music3 = new Music("Imagine", "John Lennon", "3344556677", 0.99, "John Lennon");

        //  الروايات
        Novel novel1 = new Novel("To Kill a Mockingbird", "Harper Lee", "2233445566", 10.99, 7, "Drama");
        Novel novel2 = new Novel("Pride and Prejudice", "Jane Austen", "3344556677", 11.99, 9, "Romance");
        Novel novel3 = new Novel("The Catcher in the Rye", "J.D. Salinger", "4455667788", 12.99, 6, "Fiction");

        //  الكتب الأكاديمية
        AcademicBook academicBook1 = new AcademicBook("Introduction to Algorithms", "Thomas H. Cormen", "3344556677", 99.99, 5, "Computer Science");
        AcademicBook academicBook2 = new AcademicBook("Artificial Intelligence: A Modern Approach", "Stuart Russell", "4455667788", 89.99, 3, "Artificial Intelligence");
        AcademicBook academicBook3 = new AcademicBook("The Art of Computer Programming", "Donald Knuth", "5566778899", 129.99, 4, "Computer Science");


        Store store = new Store();


        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(movie1);
        store.addMedia(movie2);
        store.addMedia(movie3);
        store.addMedia(music1);
        store.addMedia(music2);
        store.addMedia(music3);
        store.addMedia(novel1);
        store.addMedia(novel2);
        store.addMedia(novel3);
        store.addMedia(academicBook1);
        store.addMedia(academicBook2);
        store.addMedia(academicBook3);


        store.displayMedias();

        System.out.println("***********************************************");
        User user1 = new User("Shahad", "shahad@example.com");
        User user2 = new User("Nora", "Nora@example.com");


        store.addUser(user1);
        store.addUser(user2);


        store.displayUsers();
        System.out.println("***********************************************");

        user1.addToCart(book1);
        user1.addToCart(movie1);
        user1.addToCart(music1);

        user1.removeFromCart(movie1);


        user1.checkout();


        book1.addReview(4);
        book1.addReview(1);
        book1.addReview(2);
        book1.addReview(3);

        System.out.println(book1.isBestseller());

        System.out.println("Average Rating for " + book1.getTitle() + ": " + book1.getAverageRating());
    }
}