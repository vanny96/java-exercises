package com.vanny96;

public class LyyraCard{
  private double balance;

  public LyyraCard(double balanceAtStart) {
    this.balance = balanceAtStart;
  }

  public String toString() {
    return "The card has " + this.balance + " euros";
  }

  public double balance() {
    return this.balance;
  }

  public boolean loadMoney(double amount) {
    if(amount >= 0){
      this.balance += amount;
      return true;
    } else {
      System.out.println("Can't load negative money on card, try pay()");
      return false;
    }
  }

  public boolean pay(double amount){
    if(this.balance >= amount){
      this.balance -= amount;
      return true;
    } else {
      return false;
    }
  }
}