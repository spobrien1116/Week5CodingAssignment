public class App {

    static Logger logger;

    public static void main(String[] args) {
        Logger logger = new AsteriskLogger();
        logger.log("Hello");
        logger.error("Goodbye");
        setLogger(new AsteriskLogger());
        setLogger(new SpacedLogger());
    }

    private static void setLogger(Logger log) {
        logger = log;
    }
}
