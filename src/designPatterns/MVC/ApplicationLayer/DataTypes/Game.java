package designPatterns.MVC.ApplicationLayer.DataTypes;

/**
 * Created by Dana on 23-Dec-16.
 */
public class Game {
    private int id;
    private String title;
    private double price;
    private String genre;

    public Game(int ID, String title, double price, String genre) {
        this.id = ID;
        this.title = title;
        this.price = price;
        this.genre = genre;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Game{" +
                "game_ID=" + id +
                ", game_title='" + title + '\'' +
                ", game_price=" + price +
                ", game_genre='" + genre + '\'' +
                '}';
    }
}
