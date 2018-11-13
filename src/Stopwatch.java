import java.util.Date;

public class Stopwatch {
    private long startTime;
    private long endTime;

    public Stopwatch() {
    }

    public long start() {
        Date date = new Date();
        return startTime = date.getTime();
    }

    public long stop() {
        Date date = new Date();
        return endTime = date.getTime();
    }

    public long getElapsedTime() {
        return endTime - startTime;

    }
}
