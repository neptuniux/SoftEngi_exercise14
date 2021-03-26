package clock.digital;

import clock.ClockFrame;
import clock.ClockPanel;
import clock.timer.ClockTimer;

import java.awt.*;

public class DigitalClock extends ClockFrame {
    //private static final long serialVersionUID=12345678654321345L;

    public DigitalClock(ClockTimer timer){super(timer);}

    protected ClockPanel createClockPanel(){
        DigitalClockPanel clockPanel = new DigitalClockPanel();
        clockPanel.setPreferredSize(new Dimension(400, 200));
        return clockPanel;
    }

    protected void setFrameTitle(){setTitle("Just another digital clock");}

}
