package com.company;

import java.util.Scanner;

public class MatchFootball {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MatchFootball start = new MatchFootball();
        int randomFirstNumber = (int) (Math.random() * 10);
        int randomSecondNumber = (int) (Math.random() * 10);
        System.out.println("Guess result first team: ");
        int userFirstNumber = input.nextInt();
        System.out.println("Guess result second team: ");
        int userSecondNumber = input.nextInt();
        System.out.println("Result first team: " + randomFirstNumber);
        System.out.println("Result second team: " + randomSecondNumber);
        System.out.println("Result is: " + start.resultMatch(randomFirstNumber, randomSecondNumber, userFirstNumber, userSecondNumber));
    }

    public int resultMatch(int randomFirstNumber, int randomSecondNumber, int userFirstNumber, int userSecondNumber) {
        return (randomFirstNumber == userFirstNumber && randomSecondNumber == userSecondNumber) ? 2 :
                (randomFirstNumber > randomSecondNumber && userFirstNumber > userSecondNumber) ||
                        (randomFirstNumber < randomSecondNumber && userFirstNumber < userSecondNumber) ? 1 : 0;
    }
}

