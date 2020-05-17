package homework_oop;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){

    }

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public void setSecond(int second){
        this.second = second;
    }
    public void setTime(int setHour, int setMinute, int setSecond){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public String toString(){return "Time is: hh " + getHour() + " mm " + getMinute() + " ss " + getSecond();}
    public int nextSecond(){
        return second + 1;
    }
    public int prevSecond(){
        return second - 1;
    }
}
