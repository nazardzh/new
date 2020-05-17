package homework_oop;

public class mainTime {
    public static void main(String[] args){
     Time time1 = new Time(12, 35, 41);
     System.out.println("Hour: " + time1.getHour());
     System.out.println("Minutes: " + time1.getMinute());
     System.out.println("Seconds: " + time1.getSecond());

     Time time2 = new Time();
     time2.setHour(12);
     time2.setMinute(22);
     time2.setSecond(33);
     System.out.println(time2);
     System.out.println("Next second is: " + time2.nextSecond());
     System.out.println("Previous second is: " + time2.prevSecond());




    }
}
