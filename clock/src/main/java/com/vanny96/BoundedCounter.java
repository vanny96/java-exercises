package com.vanny96;

public class BoundedCounter{
  private int value;
  private int upperBound;

  public BoundedCounter(int upperBound){
    this.value = 0;
    this.upperBound = upperBound;
  }

  public void next(){
    this.value ++;
    if (this.value > this.upperBound){
      value = 0;
    }
  }

  public String toString(){
    String prefix = "";
    if (this.value < 10){
      prefix = "0";
    }
    return prefix + value;
  }

  public int getValue(){
    return this.value;
  }

  public void setValue(int value){
    if (value >= 0 && value <= this.upperBound){
      this.value = value;
    } else {
      System.out.println("Couldn't set value");
    }
    return;
  }
}