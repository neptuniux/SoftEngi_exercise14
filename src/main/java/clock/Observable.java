package clock;

import java.util.Vector;

public abstract class Observable {
    private Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer o){observers.add(o);}

    public void deleteObserver(Observer o){ observers.remove(o);}

    public void notifyObservers(){
        for (Observer o: observers) {
            o.update(this,null);
        }
    }

    public void notifyObservers(Object arg){
        for (Observer o: observers) {
            o.update(this,arg);
        }
    }

}
