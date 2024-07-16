import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Music extends Media{
  private String artist;
    public Music(){

    }
    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title, auteur, ISBN, price);
        this.artist = artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    //Method
   public void listen(User user){
       user.getPurchasedMediaList().add(this);
   }

    public List<Music> generatePlaylist(List<Music> musicCatalog) {
        List<Music> playlist = new ArrayList<>();
        for (Music music : musicCatalog) {
            if (music.getArtist().equals(this.getArtist())) {
                playlist.add(music);
            }
        }
        return playlist;
    }

   public String getMediaType(){
       return getPrice() >= 10 ? "Premium Music" : "Music";
   }

    @Override
    public String toString() {

        return super.toString() + ", artist='" + artist + '\'';
//        return "Music{" +
//                "artist=" + artist +
//                '}';
    }
}


