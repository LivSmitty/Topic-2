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

    long startTimer() {
        return startTime = currentTimeMillis();
    }

    long stopTimer() {

        return endTime = currentTimeMillis();
    }

    long getElapsedTime(){
        return elapsedTime = endTime - startTime;

    }


}
