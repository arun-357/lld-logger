import java.time.LocalDateTime;

public class LogMessage {
    private final LogLevel level;
    private final String message;
    private final String thread;
    private final LocalDateTime timestamp;

    public LogMessage(LogLevel level, String message) {
        this.timestamp = java.time.LocalDateTime.now();
        this.message = message;
        this.level = level;
        this.thread = Thread.currentThread().getName();
    }

    public LogLevel getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getThread() {
        return thread;
    }
}
