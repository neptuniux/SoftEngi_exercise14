package clock.digital;

import clock.ClockFrame;
import clock.ClockPanel;
import clock.timer.ClockTimer;

import java.awt.*;

/**
 * @author Daniel Borcard Daniel.Borcard@unifr.ch
 * @version 1.0
 */
public class DigitalClock extends ClockFrame {

    public DigitalClock(ClockTimer timer){super(timer);}

    /**
     * The constructor of the custom lock
     * @return Returns a clockpanel of the custom clock
     */
    protected ClockPanel createClockPanel(){
        DigitalClockPanel clockPanel = new DigitalClockPanel();
        clockPanel.setPreferredSize(new Dimension(400, 200));
        return clockPanel;
    }

    /**
     * Set the title of the custom clock windows.
     */
    protected void setFrameTitle(){setTitle("Just another digital clock");}

}
