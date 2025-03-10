// 2025. 03. 10(월)
package com.grepp.coffeemanager.domain.account;

public class Account {

  private int balance;
  private int sales;
  private int expences;

  private static Account instance;

  // NOTE Singleton pattern :
  // 인스턴스를 최초 한번만 생성, 생성한 인스턴스에 접근하기 위한
  // 전역접근점을 제공
  public static Account getInstance(int balance){
    if(instance == null){
      instance = new Account(balance);
    }

    return instance;
  }

  public static Account getInstance(){
    if(instance == null){
      instance = new Account(0);
    }
    return instance;
  }

  private Account(int balance) {
    this.balance = balance;
  }

  public int getBalance() {
    return balance;
  }

  public int getSales() {
    return sales;
  }


  public int getExpenses() {
    return expences;
  }

  public boolean registExpenses(int expences) {
    if(balance < expences ) return false;
    balance -= expences;
    this.expences += expences;
    return true;
  }

  public void registSales(int paymentPrice) {
    balance += paymentPrice;
    sales += paymentPrice;

  }
}
