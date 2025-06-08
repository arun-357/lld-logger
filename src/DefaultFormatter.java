public class DefaultFormatter implements LogFormatter{
    @Override
    public String format(LogMessage message) {
        return String.format("[%s] [%s] [%s]: [%s]",
                message.getLevel(),
                message.getThread(),
                message.getTimestamp(),
                message.getMessage()
        );
    }
}
