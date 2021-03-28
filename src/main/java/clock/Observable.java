package clock;

import java.util.Vector;

public abstract class Observable {
    private Vector<Observer> observers = new Vector<>();


    /**
     * Add an observer to the observable list
     * @param o An observer of type Observer to be added
     */
    public void addObserver(Observer o){observers.add(o);}

    /**
     * Remove an observer to the observable list
     * @param o An observer of type Observer to be removed
     */
    public void deleteObserver(Observer o){ observers.remove(o);}

    /**
     * Notify the observers without any parameters
     */
    public void notifyObservers(){
        for (Observer o: observers) {
            o.update(this,null);
        }
    }

    /**
     * Notify the observers with an object
     * @param arg An argument of type Object to notify to the observers
     */
    public void notifyObservers(Object arg){
        for (Observer o: observers) {
            o.update(this,arg);
        }
    }

}
