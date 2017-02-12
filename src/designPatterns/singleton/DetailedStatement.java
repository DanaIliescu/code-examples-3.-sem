package designPatterns.singleton;

/**
 * Created by Dana on 23-Dec-16.
 */
public class DetailedStatement implements StatementType {
    @Override
    public String print() {
        System.out.println("Detailed Statement Created");
        return "detailedStmt";
    }
}