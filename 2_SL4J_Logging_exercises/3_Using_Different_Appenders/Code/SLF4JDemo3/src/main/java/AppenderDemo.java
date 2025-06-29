import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderDemo {
    private static final Logger logger = LoggerFactory.getLogger(AppenderDemo.class);

    public static void main(String[] args) {
        logger.info("Logging to both console and file");
        logger.debug("Debug message for deeper inspection");
        logger.error("An error occurred during processing");
    }
}