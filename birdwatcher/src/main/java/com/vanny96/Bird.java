package com.vanny96;

public class Bird{
  private String name;
  private String latinName;
  private int timesObserved;

  public Bird(String name, String latinName){
    this.name = name;
    this.latinName = latinName;
    this.timesObserved = 1;
  }

  public String toString(){
    return name + ", " + latinName + ", observed " + timesObserved + " times.";
  }

  public String getName(){
    return name;
  }

  public void addObservation(){
    timesObserved++;
  }
}