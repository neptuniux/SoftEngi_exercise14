package clock.analog2;

import clock.ClockFrame;
import clock.ClockPanel;
import clock.Observable;
import clock.analog.AnalogClockPanel;
import clock.timer.ClockTimer;

import java.awt.*;

public class AnalogClock2 extends ClockFrame {
    //private static final long serialVersionUID=12345678654321345L;

    public AnalogClock2(ClockTimer timer){super(timer);}

    protected ClockPanel createClockPanel(){
        AnalogClock2Panel clockPanel = new AnalogClock2Panel();
        clockPanel.setPreferredSize(new Dimension(200, 200));
        return clockPanel;
    }

    protected void setFrameTitle(){setTitle("Just another analog clock");}

}
