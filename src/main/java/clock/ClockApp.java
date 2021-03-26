package clock;

import clock.digital.DigitalClock;
import clock.timer.ClockTimer;

/**
 * The <code>ClockApp</code> class represents the application's main window.
 * 
 * @author Andreas Ruppen
 */
public class ClockApp {
 
    /**
     * Creates a new instance of <code>ClockApp</code>.
     */
    public ClockApp() {

		ClockTimer timer = new ClockTimer();
		DigitalClock analogClock2 = new DigitalClock(timer);
		timer.addObserver(analogClock2);
		timer.start();
    }
    
    /**
     * The application's main method.
     */
    public static void main(String[] args) {
        new ClockApp();
    }
}
