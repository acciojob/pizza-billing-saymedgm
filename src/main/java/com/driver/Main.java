package com.driver;

public class Main {
  public static void main(String[] args) {
    // Pizza p = new Pizza(false);
    // p.addExtraCheese();
    // p.addExtraToppings();
    // p.addTakeaway();
    // System.out.println(p.getPrice());
    // System.out.println(p.getBill());
    // System.out.println(p.getBill());
    // System.out.println(p.getBill());

    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraCheese();
    p.addExtraToppings();
    p.addTakeaway();
    p.getBill();
  }
}