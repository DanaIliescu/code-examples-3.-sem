package designPatterns.MVC.PresentationLayer;

import designPatterns.MVC.ApplicationLayer.DataTypes.Game;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Created by Dana on 23-Dec-16.
 */
public class MainView {
    public static TableView makeTableView(ObservableList<Game> allGames) {

        TableView<Game> gamesTableView = new TableView<>();
        gamesTableView.itemsProperty().setValue(allGames);

        TableColumn<Game, Integer> idColumn = new TableColumn<>("ID");
        TableColumn<Game, String> titleColumn = new TableColumn<>("Title");
        TableColumn<Game, Double> priceColumn = new TableColumn<>("Price");
        TableColumn<Game, String> genreColumn = new TableColumn<>("Genre");

        idColumn.setMinWidth(120);
        titleColumn.setMinWidth(120);
        priceColumn.setMinWidth(120);
        genreColumn.setMinWidth(120);

        idColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        genreColumn.setCellValueFactory(new PropertyValueFactory<>("genre"));

        gamesTableView.getColumns().addAll(idColumn, titleColumn, priceColumn, genreColumn);
        return gamesTableView;
    }
}
