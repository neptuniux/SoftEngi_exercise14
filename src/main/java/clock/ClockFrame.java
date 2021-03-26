package clock;

import clock.analog.AnalogClock;
import clock.timer.ClockTimer;
import clock.util.PositionManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public abstract class ClockFrame extends JFrame implements Observer {
    private ClockTimer timer;

    private ClockPanel clockPanel;

    public ClockFrame(ClockTimer timer){
        super();
        this.timer=timer;

        setFrameTitle();
        addWindowListener(new DetachOnClosingWindowListener());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clockPanel = createClockPanel();

        getContentPane().add(clockPanel, BorderLayout.CENTER);

        setLocation(PositionManager.getUniqueInstance().getClockWindowPosition());



        pack();
        setVisible(true);

    }

    protected abstract void setFrameTitle();


    protected abstract ClockPanel createClockPanel();

    @Override
    public void update(Observable o, Object arg) {
        int[] hourMinSec = (int[])arg;
        clockPanel.displayTime(hourMinSec[0],hourMinSec[1],hourMinSec[2]);
        clockPanel.repaint();

    }

    private class DetachOnClosingWindowListener implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {

        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }
};

