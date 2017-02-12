package designPatterns.singleton;

/**
 * Created by Dana on 23-Dec-16.
 */
public abstract class Factory {
    protected abstract StatementType createStatements(String selection);
}