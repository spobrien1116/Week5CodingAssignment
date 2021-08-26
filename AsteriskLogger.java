public class AsteriskLogger implements Logger {

    public void log(String log) {
        System.out.println("***" + log + "***");
    }

    public void error(String error) {
        for (int i = 0; i < error.length() + 13; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("***" + "ERROR: " + error + "***");
        for (int i = 0; i < error.length() + 13; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
