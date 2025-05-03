package fittingShop;

public class Logger {

    private static Logger instance = new Logger();
    private long startTime;

    private Logger() {}

    public static Logger getInstance() {
        return instance;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public synchronized void log(String message) {
        double timestamp = (System.nanoTime() - startTime) / 1_000_000_000.0;
        System.out.printf("%.1f %s%n", timestamp, message);
    }
}
