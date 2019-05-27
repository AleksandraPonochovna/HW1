package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter maximum number of asterisks: ");
        int maxCountAsterisk = input.nextInt();
        int numOfRowsAndColumns = maxCountAsterisk * 2 - 1;
        int countOfAsterisk = 0;
        char space = ' ';

        char[][] array = new char[numOfRowsAndColumns][numOfRowsAndColumns];

        for (int i = 0; i < numOfRowsAndColumns; i++) {

            System.out.println(" ");

            if (i >= maxCountAsterisk) {
                countOfAsterisk = countOfAsterisk - 1;
            } else {
                countOfAsterisk = i + 1;
            }

            for (int j = 0; j < numOfRowsAndColumns; j++) {

                array[i][j] = space;

                if (j == maxCountAsterisk - countOfAsterisk) {

                    int localCountOfAsterisk = countOfAsterisk;

                    while (localCountOfAsterisk > 0){
                        System.out.print(" ");
                        array[i][j] = '*';
                        System.out.print(array[i][j]);
                        localCountOfAsterisk--;
                    }
                } else {
                    System.out.print(array[i][j]);
                }
            }
        }
        System.out.println(" ");
    }
}
