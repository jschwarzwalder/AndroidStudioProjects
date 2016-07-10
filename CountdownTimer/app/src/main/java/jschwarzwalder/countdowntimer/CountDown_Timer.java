package jschwarzwalder.countdowntimer;
import java.lang.Math;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by jschwarzwalder on 1/18/2015.
 */
public class CountDown_Timer {
    Timer timer = new Timer();
    timer.scheduleAtFixedRate(TimerTask.run(),++1,1000,1000);



}
