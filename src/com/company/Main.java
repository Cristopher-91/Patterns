package com.company;

import PatternComposite.*;

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
        /*
        Player player = new Player(35);
        player.gamble(10);
        player.gamble(20);
        player.gamble(25);
        player.gamble(5);
        */

        //NullObjectTest
        /*
        Company company = new Company();

        //Firma zatrudnia trzech pracowników
        company.HireEmployee("Adam");
        company.HireEmployee("Weronika");
        company.HireEmployee("Michał");

        //Firma sprawdza czy posiada takowych pracowników
        AbstractEmployee E1 = company.getEmployee("Adam");
        AbstractEmployee E2 = company.getEmployee("Natalia");
        AbstractEmployee E3 = company.getEmployee("Michał");
        AbstractEmployee E4 = company.getEmployee("Krystyna");

        System.out.println("Employees");
        System.out.println(E1.getName());
        System.out.println(E2.getName());
        System.out.println(E3.getName());
        System.out.println(E4.getName());
        */

        //CompositeText

        //Stworzenie Dowódcy Generała jako Kompozytu zarządzajęcego armią
        GeneralComposite general = new GeneralComposite();

        //Tworzymy trzy jednostki
        Army inantry = new Infantry();
        Army cavalry = new Cavalry();
        Army shoooter = new Shooter();

        //Generał zbiera oddziały
        general.gatherArmy(inantry);
        general.gatherArmy(cavalry);
        general.gatherArmy(shoooter);

        //Generał wydaje rozkaz do ataku
        general.fight();

    }
}
