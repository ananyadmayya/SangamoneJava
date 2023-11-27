package com.sangamone.java;

	


import java.util.*;
public class Main {
    private double gain;
    private double stockPrice;

    public Main(double gain, double stockPrice) {
        this.gain = gain;
        this.stockPrice = stockPrice;
    }

    public double expectedValue() {
        return stockPrice + gain;
    }

    public double expectedValue(int transactionCosts) {
        return stockPrice + gain - transactionCosts;
    }

    public double expectedValue(String transactionCosts) {
        try {
            int cost = Integer.parseInt(transactionCosts);
            return stockPrice + gain - cost;
        } catch (NumberFormatException e) {
            // Handle parsing error, e.g., return a default value or throw an exception
            return 0.0; // Change this as needed
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double gain = sc.nextDouble();
        double stockPrice = sc.nextInt();
        int transactionCostsInt = sc.nextInt();
        String transactionCostsStr = sc.nextLine();

        Main prediction = new Main(gain, stockPrice);

        double expectedValueDefault = prediction.expectedValue();
        double expectedValueInt = prediction.expectedValue(transactionCostsInt);
        double expectedValueStr = prediction.expectedValue(transactionCostsStr);

        System.out.println(expectedValueDefault + " " + expectedValueInt + " " + expectedValueStr);
    }
}
