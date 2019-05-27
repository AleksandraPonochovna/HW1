package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Main main = new Main();

        int randomFirstNumber = (int) (Math.random() * 10);
        int randomSecondNumber = (int) (Math.random() * 10);

        System.out.println("Guess result first team: ");
        int userFirstNumber = input.nextInt();
        System.out.println("Guess result second team: ");
        int userSecondNumber = input.nextInt();
        System.out.println("Result first team: " + randomFirstNumber);
        System.out.println("Result second team: " + randomSecondNumber);

        main.resultMatch(randomFirstNumber, randomSecondNumber, userFirstNumber, userSecondNumber);

    }

    public int resultMatch(int randomFirstNumber, int randomSecondNumber, int userFirstNumber, int userSecondNumber) {

        int result;

        result = (randomFirstNumber == userFirstNumber && randomSecondNumber == userSecondNumber) ? 2 :
                (randomFirstNumber > randomSecondNumber && userFirstNumber > userSecondNumber) ||
                        (randomFirstNumber < randomSecondNumber && userFirstNumber < userSecondNumber) ? 1 : 0;

        System.out.println("Result of match: " + result);
        return result;
    }
}

