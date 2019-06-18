package com.vanny96;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        Birdwatcher watcher = new Birdwatcher(reader);

        boolean quitting = false;
        while(!quitting){
            System.out.print("Enter comand: ");
            String comand = reader.nextLine();

            switch(comand){
                case "add":
                    watcher.add();
                    break;
                
                case "observation":
                    System.out.println(comand);
                    watcher.observation();
                    break;

                case "statistics":
                    watcher.printBirds();
                    break;
                
                case "show":
                    watcher.show();
                    break;
                
                case "quit":
                    quitting = true;
                    break;
                
                default:
                    System.out.println("Not a valid comand, try: add, observation, statistics, show or quit");
            }
        }
    }
}
