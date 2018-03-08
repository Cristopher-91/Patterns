package com.company;

import PatternObserver.MeteorologyStation;
import PatternObserver.Television;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MeteorologyStation meteorologyStation = new MeteorologyStation();

        Television television = new Television("Sony");
        Television television2 = new Television("Panasonic");

        meteorologyStation.AddObserver(television);
        meteorologyStation.AddObserver(television2);

        meteorologyStation.checkTemperature();
    }
}
