package com.company;

import PatternDecorator.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Observer Test
        /*
        MeteorologyStation meteorologyStation = new MeteorologyStation();

        Television television = new Television("Sony");
        Television television2 = new Television("Panasonic");

        meteorologyStation.AddObserver(television);
        meteorologyStation.AddObserver(television2);

        meteorologyStation.checkTemperature();
        */

        //Decorator Test
        //Creating Two Genders
        Person man = new Man();
        Person woman = new Woman();

        man.sayYourGender();
        woman.sayYourGender();

        //Decorating(Teaching) Woman to be polite
        Person PoliteWoman = new PoliteDecorator(woman);

        man.sayYourGender();
        PoliteWoman.sayYourGender();


    }
}
