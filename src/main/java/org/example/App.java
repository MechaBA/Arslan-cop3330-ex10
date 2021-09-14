/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Berkay Arslan
 */

package org.example;
import java.util.*;
public class App
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double price1 = sc.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        int item1 = sc.nextInt();
        System.out.print("Enter the price of item 2: ");
        double price2 = sc.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        int item2 = sc.nextInt();
        System.out.print("Enter the price of item 3: ");
        double price3 = sc.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        int item3 = sc.nextInt();
        double subTotal = (price1 * item1) + (price2 * item2) + (price3 * item3);
        double tax = (subTotal * 5.5) / 100;
        double total = subTotal + tax;
        System.out.println("Total: $" +total);
        System.out.println("Subtotal: $" +subTotal);
        System.out.println("Tax: $" +tax);
    }
}