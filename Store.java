import java.util.List;
import java.util.ArrayList;

public class Store {
    private List<User>users;
    private List<Media>medias;

    public Store() {
        this.users = new ArrayList<>();
        this.medias = new ArrayList<>();
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void addUser(User user){
        users.add(user);
    }

//    public List<User> displayUsers() {
//        return users;
//    }
    public void displayUsers() {
    for (User user : users) {
        System.out.println(user.getUsername());
    }
}
    public void addMedia(Media media){
       medias.add(media);
    }
//    public List<Media> displayMedias(){
//       return medias;
//    }
public void displayMedias() {
    for (Media media : medias) {
        System.out.println(media.getTitle());
    }
}
    public Book searchBook(String title) {
        for (Media media : medias) {
            if (media instanceof Book && media.getTitle().equals(title)) {
                return (Book) media;
            }
        }
        return null;
    }

        @Override
        public String toString() {
            return "Store{" +
                    "users=" + users +
                    ", medias=" + medias +
                    '}';
        }


}
