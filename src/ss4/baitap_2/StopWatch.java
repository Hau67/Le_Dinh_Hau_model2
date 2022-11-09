package ss4.baitap_2;

import java.util.Date;

public class StopWatch {
    long startTime , endTime;
    public StopWatch(){
    }
    public StopWatch(long startTime, long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return new Date().getTime();
    }
    public long strart() {
        return startTime = getStartTime();
    }
    public long stop() {
        return endTime = getStartTime();
    }
    public long getElapsedTime() {
        return endTime - startTime ;
    }
}
