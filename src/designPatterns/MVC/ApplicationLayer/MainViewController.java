package designPatterns.MVC.ApplicationLayer;

import designPatterns.MVC.ApplicationLayer.DataTypes.Game;
import designPatterns.MVC.DataAccessLayer.GameTXT;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by Dana on 23-Dec-16.
 */
public class MainViewController {
    public static ObservableList<Game> getGames(){
        ObservableList<Game> games = null;
        try {
            games = FXCollections.observableArrayList(GameTXT.readGames());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return games;
    }
}
