package accademy.learnprogramming;

public class SecondsAndMinutesChallenge {
    public static String getDurationString(int minutes, int seconds){
        if (minutes <=0 && seconds <=0 && seconds >=59){
            return "Invalid Value";
        }else {
            int hours = minutes / 60;
            minutes = minutes - hours * 60;
            System.out.println(hours +" Hours "+ minutes +" Minutes "+ seconds + " Seconds");
            return hours +" Hours "+ minutes +", Minutes "+ seconds + ", and Seconds";
        }
    }

    public static String getDurationString(int seconds){
        if (seconds >=0){
            int minutes = seconds / 60;
            seconds = seconds - minutes * 60;
            return getDurationString(minutes, seconds);
        }else{
            return "Invalid Value";
        }
    }
}
