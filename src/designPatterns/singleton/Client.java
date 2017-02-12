package designPatterns.singleton;

import java.util.Scanner;

/**
 * Created by Dana on 23-Dec-16.
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = StatementFactory.getUniqueInstance();
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter your selection (detailed/short, x to exit):");
            String selection = in.nextLine();
                if (!selection.equalsIgnoreCase("x")) {
                    StatementType objStmtType = factory.createStatements(selection);
                    System.out.println(objStmtType.print());
                }
        } while (!in.nextLine().equalsIgnoreCase("x"));
    }
}