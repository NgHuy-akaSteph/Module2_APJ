package StopWatch;

public class Watch {
    private long startTime;
    private long endTime;

    public Watch() {
        this.startTime = System.currentTimeMillis(); // Get the current time in milliseconds
    }

    public void start() {
        this.startTime = System.currentTimeMillis(); // Get the current time in milliseconds
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
