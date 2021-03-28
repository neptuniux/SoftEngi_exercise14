package clock;

import clock.timer.ClockTimer;
import clock.util.PositionManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public abstract class ClockFrame extends JFrame implements Observer {
    // The timer (observable) to be used in the customs clocks
    private ClockTimer timer;

    //The clockPanel to be used in the customs clocks
    private ClockPanel clockPanel;

    /**
     * @param timer The timer to be used by the Clock
     */
    public ClockFrame(ClockTimer timer) {
        super();
        this.timer = timer;

        //Set the title of the window
        setFrameTitle();
        //Clean the memory when the windows closes
        addWindowListener(new DetachOnClosingWindowListener());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and display the clock panel
        clockPanel = createClockPanel();
        getContentPane().add(clockPanel, BorderLayout.CENTER);
        setLocation(PositionManager.getUniqueInstance().getClockWindowPosition());
        pack();
        setVisible(true);

    }

    //Set the windows title
    protected abstract void setFrameTitle();


    /**
     * A method to be defined in the custom Clock class
     * @return Returns the clockpanel of the custom clock
     */
    protected abstract ClockPanel createClockPanel();

    /**
     * This method updates the cutoms clocks.
     * @param o An observable to listen of ype Observable
     * @param arg The argument to be passed of type Object
     */
    @Override
    public void update(Observable o, Object arg) {
        int[] hourMinSec = (int[]) arg;
        clockPanel.displayTime(hourMinSec[0], hourMinSec[1], hourMinSec[2]);
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

