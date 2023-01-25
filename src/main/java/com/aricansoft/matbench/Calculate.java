package com.aricansoft.matbench;

import java.util.Timer;
import java.util.TimerTask;

public class Calculate {
    static int krometer = 0;
    static double number = 0.01;

    private static double score;

    public static void mark(){
        Timer myTimer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                krometer++;
                System.out.println(krometer);
                if(krometer == 1){
                    myTimer.cancel();
                }
            }
        };
        myTimer.schedule(task, 10);
        while(true){
            number = number * 1.05;
            System.out.println(number);
            if(krometer == 1){
                System.out.println("Score: " + number);
                break;
            }
        }
    }
    public static String getScore() {
        return Double.toString(number);
    }
}
