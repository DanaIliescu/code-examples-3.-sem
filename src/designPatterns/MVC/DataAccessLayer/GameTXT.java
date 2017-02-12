package designPatterns.MVC.DataAccessLayer;

import designPatterns.MVC.ApplicationLayer.DataTypes.Game;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Dana on 23-Dec-16.
 */
public class GameTXT {
    //Returns all the game objects - read from the games.txt file
    public static ArrayList<Game> readGames()throws Exception{
        ArrayList<Game> games = new ArrayList<>();
        Scanner input = new Scanner(new File("C:/xampp/htdocs/Exam3/src/designPatterns/MVC/games.txt"));
        while (input.hasNextLine()){
            String line = input.nextLine();
            Scanner tokenScan = new Scanner(line);
            Game game = new Game(tokenScan.nextInt(), tokenScan.next(),
                    tokenScan.nextDouble(), tokenScan.next());
            games.add(game);
            System.out.println(game.toString());
        }
        return games;
    }
}
