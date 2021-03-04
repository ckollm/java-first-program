package com.h2;

import java.util.*;
import java.util.Map;

/* Playing */

public class BestLoanRates {

    public static final Map<Integer, Float> bestRates
            // Add 3 key-value pairs. Add 1, 5.50f, 2, 3.45f, 3, 2.67f as the argument to Map.of()
            = Map.of(1,5.50f,2,3.45f,3,2.67f);

    public static void main(String[] args) {
        System.out.println("Best Loan Rates");
        Scanner scanner = new Scanner(System.in);

        // Enter Name
        System.out.println("Enter your name please!:");
        String name;
        name = scanner.nextLine();
        System.out.println("Hello:"+ name);

        System.out.println("Enter the loan term (in years)");
        Integer loanTermInYears;
        loanTermInYears = scanner.nextInt();

        float bestRate = getRates(loanTermInYears);
        if (bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        } else {
            System.out.println ("Best Available Rate: " + bestRate + "%");
        }
        scanner.close();
    }

    public static float getRates(int loanTermInYears) {

        if (bestRates.containsKey(loanTermInYears)) {
           return bestRates.get(loanTermInYears);
        } else {
            return 0.0f;
        }
    }

}

