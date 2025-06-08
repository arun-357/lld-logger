import java.util.List;

public class LoggerConfig {
    private LogLevel level;
    private List<LogAppender> appenders;
    private LogFormatter formatter;

    public LoggerConfig(LogLevel level, List<LogAppender> appenders, LogFormatter formatter) {
        this.level = level;
        this.appenders = appenders;
        this.formatter = formatter;
    }

    public LogLevel getLevel() {
        return level;
    }

    public List<LogAppender> getAppenders() {
        return appenders;
    }

    public LogFormatter getFormatter() {
        return formatter;
    }
}
