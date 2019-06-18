package com.vanny96;

public class CashRegister{
  private double cashInRegister;   // the amount of cash in the register
  private int economicalSold;      // the amount of economical lunches sold
  private int gourmetSold;         // the amount of gourmet lunches sold

  public CashRegister() {
    this.cashInRegister = 1000;
  }

  public double payEconomical(double cashGiven) {
    if(cashGiven >= 2.50){
      this.cashInRegister += 2.50;
      economicalSold++;
      return cashGiven - 2.50;
    } else {
      return cashGiven;
    }
  }

  public double payGourmet(double cashGiven) {
    if(cashGiven >= 4.00){
      this.cashInRegister += 4.00;
      gourmetSold++;
      return cashGiven - 4.00;
    } else {
      return cashGiven;
    }
  }

  public boolean payEconomical(LyyraCard card) {
    if(card.balance() >= 2.50){
      card.pay(2.50);

      economicalSold++;
      return true;
    } else {
      return false;
    }
}

public boolean payGourmet(LyyraCard card) {
  if(card.balance() >= 4.00){
    card.pay(4.00);

    gourmetSold++;
    return true;
  } else {
    return false;
  }
}

// This method doesn't make any sense to me but the exercise asked for it so oh well

public void loadMoneyToCard(LyyraCard card, double sum) {
  if(sum >= 0){
    card.loadMoney(sum);
    this.cashInRegister += sum;
  }
}
  

  public String toString() {
      return "money in register "+cashInRegister+" economical lunches sold: "+economicalSold+" gourmet lunches sold: "+gourmetSold;
  }
}