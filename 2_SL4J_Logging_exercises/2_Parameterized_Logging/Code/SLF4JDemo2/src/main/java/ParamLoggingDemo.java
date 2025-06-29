import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParamLoggingDemo {
    private static final Logger logger = LoggerFactory.getLogger(ParamLoggingDemo.class);

    public static void main(String[] args) {
        String user = "Aman";
        int attempts = 3;

        logger.info("User {} has logged in", user);
        logger.warn("User {} has attempted to login {} times unsuccessfully", user, attempts);
    }
}