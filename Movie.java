import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Movie extends Media{
    private int duration;

    public Movie() {

    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
    public void watch(User user) {
        user.getPurchasedMediaList().add(this);
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        List<Movie> recommendations = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(this.getAuteur())) {
                recommendations.add(movie);
            }
        }
        return recommendations;
    }

    @Override
    public String getMediaType() {
        return duration >= 120 ? "Long Movie" : "Movie";
    }

    @Override
    public String toString() {
        return super.toString() + ", duration=" + duration + " minutes";
    }


}

