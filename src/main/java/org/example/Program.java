package org.example;

public class Program {

    public static String greeting(int time){
        if (time >= 5 && time<=12 ){
            return "good morning";
        }
        else if (time > 12 && time <= 18){
            return "good afternoon";
        }
        else if ((time < 5 && time >= 0) || (time > 18 && time <=24)){
            return "good night";
        }
        else {
            return "Invalid time";
        }
    }

}
