package Enum;

import java.util.Scanner;

public class Main {
    public static void main(String... args){


//       Day[] possibleValues = Day.values();
//       for (Day d : possibleValues){
//           System.out.println(d);
//       }
//        for(Planet planet : Planet.values()){
//            System.out.println(planet);
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Provide day: ");
//        String provided = scanner.nextLine();
//
//        Day day = Day.valueOf(provided.toUpperCase());
//        System.out.println(day);
//        System.out.println("Just do it");


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Provide planet: ");
//        String providedPlanet = scanner.nextLine();
//
//        Planet planet = Planet.valueOf(providedPlanet.toUpperCase());
//        System.out.println(planet);
//        System.out.println("Just do it");

     for(Planet planet : Planet.values()){
         System.out.println(planet.toString() + " ordinal: " + planet.ordinal());
     }



    }
}

