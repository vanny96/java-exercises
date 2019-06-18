package com.vanny96;

import java.util.ArrayList;
import java.util.Scanner;

public class Birdwatcher{
  ArrayList<Bird> birds;
  Scanner reader;

  public Birdwatcher(Scanner reader){
    birds = new ArrayList<Bird>();
    this.reader = reader;
  }

  public void add(){
    System.out.print("Name: ");
    String name = reader.nextLine();

    System.out.print("Latin Name: ");
    String latinName = reader.nextLine();

    Bird bird = new Bird(name, latinName);

    if(!birds.contains(bird)){
      birds.add(bird);
    }
  }

  public void observation(){
    System.out.print("What was observed? ");
    String name = reader.nextLine();

    boolean observed = false;
    for(Bird bird : birds){
      if(bird.getName().equals(name)){
        bird.addObservation();
        observed = true;
      }
    }

    if(!observed){
      System.out.println("It's not a bird!");
    }
  }

  public void printBirds(){
    for (Bird bird : birds){
      System.out.println(bird);
    }
  }

  public void show(){
    System.out.print("Enter bird name: ");
    String name = reader.nextLine();

    boolean exists = false;
    for(Bird bird : birds){
      if(bird.getName().equals(name)){
        System.out.println(bird);
        exists = true;
      }
    }

    if(!exists){
      System.out.println("It's not a bird!");
    }
  }
}