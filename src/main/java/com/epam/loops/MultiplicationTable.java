package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        for(int i=1; i<=10; i++){
            int result = i*numberTableToPrint;
            System.out.println(i + " x " + numberTableToPrint + " = " + result);
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        MultiplicationTable table = new MultiplicationTable();
        table.printTable(number);


    }

}
