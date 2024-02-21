package tasks.task4;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Main {
    private final static Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) {
        logger.log(new LogRecord(Level.INFO, "hello"));
    }
}
