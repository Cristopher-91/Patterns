package com.company;

import PatternDecorator.*;
import PatternSingleton.Singleton;
import PatternState.Player;

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
        /*
        //Creating Two Genders
        Person man = new Man();
        Person woman = new Woman();

        man.sayYourGender();
        woman.sayYourGender();

        //Decorating(Teaching) Woman to be polite
        Person PoliteWoman = new PoliteDecorator(woman);

        man.sayYourGender();
        PoliteWoman.sayYourGender();
        */

        //Singleton
        //Even though I get instance two times message of creation is displayed only once
        //as Singleton is created only in the first time.
        /*
        Singleton.getInstance();
        Singleton.getInstance();
        */

        //State Test
        Player player = new Player(35);
        player.gamble(10);
        player.gamble(20);
        player.gamble(25);
        player.gamble(5);

    }
}
