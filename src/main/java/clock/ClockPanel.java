package clock;

import javax.swing.*;

public abstract class ClockPanel extends JPanel {
    public ClockPanel(){super();}

    /**
     * Display/update the time in the clockView
     * @param hour The hours of type int to be displayed
     * @param minute The minutes of type int to be displayed
     * @param second The seconds of type int to be displayed
     */
    public abstract void displayTime(int hour, int minute,int second);


}
