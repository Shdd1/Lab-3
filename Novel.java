import java.util.List;

public class Novel extends Book{
    private String genre;


    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getMediaType() {
        return getAverageRating() >= 4.5 ? "Bestselling Novel" : "Novel";
    }

    @Override
    public String toString() {
          return super.toString() + ", genre='" + genre + '\'';
    }
}

