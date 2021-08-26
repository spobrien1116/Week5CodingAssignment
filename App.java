public class App {

    public static void main(String[] args) {
        String log = "Hello";
        String error = "Goodbye";
        Logger asteriskLogger = new AsteriskLogger();
        asteriskLogger.log(log);
        asteriskLogger.error(error);
        Logger spacedLogger = new SpacedLogger();
        spacedLogger.log(log);
        spacedLogger.error(error);
    }
}
