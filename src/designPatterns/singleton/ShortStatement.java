package designPatterns.singleton;

/**
 * Created by Dana on 23-Dec-16.
 */
public class ShortStatement implements StatementType {
    @Override
    public String print() {
        System.out.println("Mini Statement Created");
        return "miniStmt";
    }
}