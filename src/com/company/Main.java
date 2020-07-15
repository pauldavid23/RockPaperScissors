package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Rock, paper, scissors game! \n");

        System.out.println("Enter your attack: ");
        String attack = scanner.nextLine();

        String attack2;
        attack.toLowerCase();
        int systemAttack;
        switch (attack) {
            case "rock":
                systemAttack = 1;
                break;
            case "paper":
                systemAttack = 2;
                break;
            case "scissors":
                systemAttack = 3;
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        double chance = Math.random() * 3;

        Math.round(chance);

        switch ((int) chance) {
            case 1:
                System.out.println("Rock!");
                break;
            case 2:
                System.out.println("Paper!");
                break;
            case 3:
                System.out.println("Scissors!");
                break;
                                //1 beats 3 // 1 loses 2 // 1 to 1 tie//
                                //2 beats 1 // 2 loses 3 // 2 to 2 tie //
                                // 3 beats 2 // 3 loses 1 // 3 to 3 tie//
        }
        if (systemAttack == chance) {
            System.out.println("Tied!");
        } else if (systemAttack == 1 && chance == 2) {
            System.out.println("You lose!");
        } else if (systemAttack == 2 && chance == 3) {
            System.out.println("You lose!");
        } else if (systemAttack == 3 && chance == 1) {
            System.out.println("You lose!");
        }
        //Winning
        else if (systemAttack == 1 && chance == 3) {
            System.out.println("You win!");
        }
        else if (systemAttack == 2 && chance == 1) {
            System.out.println("You win!");
        }
        else if (systemAttack == 3 && chance == 2) {
            System.out.println("You win!");
        }


    }
}
