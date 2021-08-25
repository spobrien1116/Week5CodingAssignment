public class SpacedLogger implements Logger {
    
    public void log(String log) {
        for (int i = 0; i < log.length(); i++) {
            System.out.print(log.charAt(i) + " ");
        }
        System.out.println("");
    }

    public void error(String error) {
        System.out.print("ERROR: ");
        for (int i = 0; i < error.length(); i++) {
            System.out.print(error.charAt(i) + " ");
        }
        System.out.println(""); 
    }
}
