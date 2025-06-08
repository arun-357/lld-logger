import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogFormatter formatter = new DefaultFormatter();

        List<LogAppender> appenders = new ArrayList<>();
        appenders.add(new ConsoleAppender());

        LoggerConfig config = new LoggerConfig(LogLevel.INFO, appenders, formatter);

        Logger logger = new Logger(config);

        logger.info("No bugs found");
    }
}