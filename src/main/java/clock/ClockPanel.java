package clock;

import javax.swing.*;

public abstract class ClockPanel extends JPanel {
    public ClockPanel(){super();}
    public abstract void displayTime(int hour, int minute,int second);


}
