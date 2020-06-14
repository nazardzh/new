package Enum;

import java.util.Scanner;

import static Enum.Day.*;

public class whileTrue {
    public static void main(String... args){
        //  МЕТОД 1 //
//        while(true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Provide day: ");
//            String provided = scanner.nextLine();
//            Day day = Day.valueOf(provided.toUpperCase());
//            int workHours;
//            if (day == MONDAY || day == TUESDAY){
//                workHours = 8;
//            }else if(day == WEDNESDAY || day == THURSDAY){
//                workHours = 13;
//            }else{
//                workHours = 7;
//            }
//            System.out.println("You have to work " + workHours + " hours this day");
//
//        }
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Provide day: ");
            String provided = scanner.nextLine();
            Day day = Day.valueOf(provided.toUpperCase());
            int workHours;
            switch (day){
                case MONDAY:
                case TUESDAY:
                    workHours = 8;
                    break;

                case WEDNESDAY:
                case THURSDAY:
                    workHours = 13;
                    break;
                default:
                    workHours = 6;
            }
            System.out.println("You have to work " + workHours + " hours this day");



        }
    }
}
