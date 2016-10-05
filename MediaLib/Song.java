
/**
 * Write a description of class Song here.
 * Sets attributes of the Song class to feed into the main MediaLib class.
 * @author Parjanya Brahmachari 
 * @version 1.0
 */
public class Song {
    // instance variables - replace the example below with your own
    public int rating;
    public String title;
    public double price;
    public boolean favorite;
    /**
     * Constructor for objects of class Song
     */
    public Song(String title, double price, int rating, boolean favorite) {
        // initialise instance variables
        this.rating = rating;
        this.title = title;
        this.price = price;
        this.favorite = favorite;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    
    public int getRating() {
        return rating;
    }
    public void setRating (int r) {
        if (r > 10 || r < 0) {
            System.out.println("Error: Invalid rating");
        } else {
            rating = r;
        }
    }
    
    public double getPrice() {
        return price;
    }
    public void setPrice (double p) {
        price = p;
    }
    
    public boolean getFavorite() {
        return favorite;
    }
    public void addToFavorites(boolean f) {
        favorite = f;
    }
}
