package PatternSingleton;

import java.util.Date;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){
        System.out.println("I am created");
    }
    public synchronized  static Singleton  getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
