import static java.lang.System.currentTimeMillis;

/**
 * Created by scott_000 on 9/10/2016.
 */
public class StopWatch {
    /**
     * Created by scott_000 on 9/10/2016.
     */


    long startTime;
    long endTime;
    long elapsedTime;


    StopWatch() {
        startTime = currentTimeMillis();

    }

    long startTimer(long startTime) {
        startTime = currentTimeMillis();
    }

    public void stopTime(long endTime) {
        endTime = currentTimeMillis();
    }

    public void getElapsedTime(long startTime, long endTime){
        elapsedTime = endTime - startTime;

    }


}
