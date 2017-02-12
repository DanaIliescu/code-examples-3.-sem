package designPatterns.MVC;

import designPatterns.MVC.ApplicationLayer.DataTypes.Game;
import designPatterns.MVC.ApplicationLayer.MainViewController;
import designPatterns.MVC.PresentationLayer.MainView;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

import static java.awt.SystemColor.window;

/**
 * Created by Dana on 23-Dec-16.
 */
public class Main extends Application {
    static ObservableList<Game> allGames;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Games");

        allGames = MainViewController.getGames();

        TableView tableView = MainView.makeTableView(allGames);

        Scene scene = new Scene(tableView, 480, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
