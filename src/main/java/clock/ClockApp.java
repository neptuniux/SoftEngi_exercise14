package clock;

import clock.analog.AnalogClock;
import clock.analog2.AnalogClock2;
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
		AnalogClock2 analogClock2 = new AnalogClock2(timer);
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
