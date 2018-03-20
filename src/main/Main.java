
package main;

import java.util.ArrayList;
import universe.Person;
import universe.Universe;

public class Main {
    public static void main(String[] args) {
        Universe milkyway= new Universe();
        milkyway.addHuman("Pablo", "Male");
        milkyway.addHuman("Juan", "Male");
        milkyway.addHuman("Andres", "Male");
        milkyway.addHuman("Paula", "Female");
        milkyway.addHuman("Valentina", "Female");
        
        milkyway.searchPerson("Andres").addParent(milkyway.searchPerson("Juan"));
        milkyway.searchPerson("Andres").addParent(milkyway.searchPerson("Paula"));
        milkyway.searchPerson("Valentina").addParent(milkyway.searchPerson("Juan"));
        milkyway.searchPerson("Valentina").addParent(milkyway.searchPerson("Paula"));
        milkyway.searchPerson("Pablo").addParent(milkyway.searchPerson("Juan"));
        
        milkyway.searchPerson("Juan").addChildren(milkyway.searchPerson("Andres"));
        milkyway.searchPerson("Juan").addChildren(milkyway.searchPerson("Valentina"));
        milkyway.searchPerson("Juan").addChildren(milkyway.searchPerson("Pablo"));
        milkyway.searchPerson("Paula").addChildren(milkyway.searchPerson("Andres"));
        milkyway.searchPerson("Paula").addChildren(milkyway.searchPerson("Valentina"));
        
        System.out.println(milkyway.infoHumans());
        System.out.println("Quantity of people with daughters: " + milkyway.getPeopleWithDaughters() + "\n");
    }
}
