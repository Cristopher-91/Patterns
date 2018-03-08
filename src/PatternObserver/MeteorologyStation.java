package PatternObserver;

import java.util.ArrayList;
import java.util.Random;


public class MeteorologyStation implements Observable {

    private static float temperature;
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void AddObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void DeleteObserver(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
    }

    @Override
    public void InformObserver() {
        for (Observer o:observers
          ) {o.actualization(temperature);
        }
    }

    public void checkTemperature(){
        while(true){
            temperature = -20 + (int) (Math.random() * ((1 + 45) +20));
            InformObserver();
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){
                e.getMessage();
            }
        }
    }
}
