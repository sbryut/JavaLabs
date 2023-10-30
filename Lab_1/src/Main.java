package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final String INVALID_INPUT_ERROR = "Invalid input!";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hero hero = new Hero();
        int x1 = 0, x2 = 0, y1 = 0, y2 = 0, numOfMove = 0;

        System.out.println("Welcome to our game. Enter the hero's starting coordinates:");
        try {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(INVALID_INPUT_ERROR);
            sc.close();
            System.exit(1);
        }

        System.out.println("""
                Movement options for hero:\s
                 1 - walk\s
                 2 - ride a horse\s
                 3 - fly\s
                 4 - go by car\s
                 5 - end the game\s
                """);

        System.out.println("Choose how the hero should move:");
        while (true) {
            while (true) {
                try {
                    numOfMove = sc.nextInt();
                    if (0 < numOfMove && numOfMove < 6) {
                        break;
                    } else {
                        System.out.println(INVALID_INPUT_ERROR + " " + "Try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println(INVALID_INPUT_ERROR);
                    sc.close();
                    System.exit(1);
                }
            }

            if (numOfMove == 5) {
                System.out.println("Game over...");
                sc.close();
                System.exit(0);
            }


            // hero.setMove(null);

            System.out.println("Enter destination coordinates for the hero:");
            try {
                x2 = sc.nextInt();
                y2 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(INVALID_INPUT_ERROR);
                sc.close();
                System.exit(1);
            }

            switch (numOfMove) {
                case 1 -> hero.setMove(new WalkStrategy());
                case 2 -> hero.setMove(new HorseRideStrategy());
                case 3 -> hero.setMove(new FlyStrategy());
                case 4 -> hero.setMove(new GoByCarStrategy());
                default -> System.out.println(INVALID_INPUT_ERROR);
            }

            System.out.println(hero.doMove(x1, y1, x2, y2));
            x1 = x2;
            y1 = y2;

            System.out.println("\nChoose a new way to move your hero:");
        }
    }
}
