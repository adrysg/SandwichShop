package com.pluralsight;
import java.util.*;

public class SandwichShop {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    double regPrice = 5.45;
    double lrgPrice = 8.95;
    double discount = 0;
    double price = 0;

//prompt user to select size option
    System.out.println("Hi! Welcome to Sandwich Shop ");
    System.out.println("Please make a selection: ");
    System.out.println("1. Regular ($5.45)");
    System.out.println("2. Large ($8.95");
    int size = s.nextInt();
    s.nextLine();


//prompt user to select their age
    System.out.println("Please select age group: ");
    System.out.println("1. Student (10% off) ");
    System.out.println("2. Senior (20% off) ");
    int age = s.nextInt();
    s.nextLine();

//price based on size selection
    if (size == 1) {
        price = regPrice;
    }
    else if (size == 2){
        price = lrgPrice;
        System.out.println();
    }
//discounts
    if (age == 1) {
        discount = 0.10;
    }
    else if (age == 2) {
        discount = 0.20;
        System.out.println();
    }
//Calculating discounts
    double discountTotal = price * discount;
    double total = price - discountTotal;

    System.out.println("Your total is $" + String.format("%.2f", total));




    }
}

