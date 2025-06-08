public class Logger {
    private final LoggerConfig config;

    public Logger(LoggerConfig config) {
        this.config = config;
    }

    public void log(LogLevel level, String consoleMsg) {
        if (level.getSeverity() < config.getLevel().getSeverity()) return;

        LogMessage message = new LogMessage(level, consoleMsg);
        String formatter = config.getFormatter().format(message);

        for (LogAppender appender : config.getAppenders()) {
            appender.append(formatter);
        }
    }

    public void debug(String msg) { log(LogLevel.DEBUG, msg); }
    public void info(String msg) { log(LogLevel.INFO, msg); }
    public void warn(String msg) { log(LogLevel.WARN, msg); }
    public void error(String msg) { log(LogLevel.ERROR, msg); }
}
