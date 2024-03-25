package com.epam.langSyntax;

import java.util.Scanner;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int sum = 0;
        while (number > 0){
            int digit = number%10;
            sum = sum + digit;
            number = number/10;
        }
        System.out.println(sum);
    }
}
