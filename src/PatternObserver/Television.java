package PatternObserver;

import javax.xml.transform.sax.SAXSource;

public class Television implements Observer {

    private String name;
    private double temperature;

    public Television(){};
    public Television(String name){
        this.name = name;
    }
    @Override
    public void actualization(float temperature) {
        this.temperature = temperature;
        InformAboutTemperature();
    }

    public void InformAboutTemperature(){
        System.out.println(name +": temperature is " + temperature);
    }
}
