package com.vanny96;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());
        
        System.out.print("seconds to pass: ");
        int wait = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        for (int i = 0; i < wait; i++) {
            System.out.println( hours + ":" + minutes + ":" + seconds);

            seconds.next();

            if (seconds.getValue() == 0){
                minutes.next();

                if (minutes.getValue() == 0){
                    hours.next();
                }
            }

            Thread.sleep(1000);
        } 
    }
}
