package designPatterns.singleton;

/**
 * Created by Dana on 23-Dec-16.
 */
public class StatementFactory extends Factory {
    private static StatementFactory uniqueInstance;

    private StatementFactory() {
    }

    public static StatementFactory getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new StatementFactory();
            System.out.println("Creating a new StatementFactory instance");
        }
        return uniqueInstance;

    }

    public StatementType createStatements(String selection) {
        if (selection.equalsIgnoreCase("detailed")) {
            return new DetailedStatement();
        } else if (selection.equalsIgnoreCase("short")) {
            return new ShortStatement();
        }
        throw new IllegalArgumentException("Selection doesnot exist");
    }
}
