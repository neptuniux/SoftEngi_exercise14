package clock.timer;

import java.util.Calendar;
import java.util.GregorianCalendar;

import clock.Observable;
import clock.analog.AnalogClock;
import java.util.logging.*;

/**
 * <code>ClockTimer</code> is a subject for storing and maintaining the time of 
 * day. It notifies its observers every second. The class provides an interface 
 * for retrieving individual time units such as hour, minute and second.
 * 
 * @author Andreas Ruppen
 */
public class ClockTimer extends Observable implements Runnable {
    private long time;
    
    private Calendar calendar;

    private int[] hourMinuteSecond =new int[3];

    
    // delay in milliseconds
    private long delay = 1000;
    
    private Thread thread;

	private static Logger loggingService = Logger.getLogger("ClockTimer");
	
	/**
	 * 
	 * @uml.property name="analogClock"
	 * @uml.associationEnd multiplicity="(1 1)"
	 */


	
    /**
     * Creates a new instance of <code>ClockTimer</code>.
     */
    public ClockTimer() {
        calendar = new GregorianCalendar();
    }

    /**
     * Returns the current hour.
     */
    private int getHour() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * Returns the current minute.
     */
    private int getMinute() {
        return calendar.get(Calendar.MINUTE);
    }

    /**
     * Returns the current second.
     */
    private int getSecond() {
        return calendar.get(Calendar.SECOND);
    }

    /**
     * Notifies the observers every second.
     */
    public void run() {
        while (thread != null) {
            try {
                time = System.currentTimeMillis();
                calendar.setTimeInMillis(time);
                // TODO Notify observers here, instead of setting the time direcly.
				// Program against the observer interface, instead of programming against the analog clock class!
				//analogClock.update(getHour(), getMinute(), getSecond());
                hourMinuteSecond[0]=getHour();
                hourMinuteSecond[1]=getMinute();
                hourMinuteSecond[2]=getSecond();
                notifyObservers(hourMinuteSecond);
                //notifyObservers();
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            	loggingService.severe("Timer got interrupted");
            }
        }
    }

    /**
     * Starts the timer.
     */
    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    /**
     * Stops the timer.
     */
    public void stop() {
        if (thread != null) {
            thread = null;
        }
    }
}
