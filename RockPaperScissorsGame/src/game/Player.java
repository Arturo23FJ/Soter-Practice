package game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private String choice;

    public Player() {}

    private String choices(int choice) {
        if (choice == 0) {
            return this.choice = "Rock";
        } else if(choice == 1) {
            return this.choice = "Paper";
        } else
            return this.choice = "Scissors";
    }

    public String randomChoice() {
        Random random = new Random();
        int numberOfChoice = random.nextInt(3);

        return choices(numberOfChoice);
    }

    public String setChoiceByInput() {
        System.out.println("Please enter your choice! 0 = Rock, 1 = Paper, 2 = Scissors");
        Scanner scanner = new Scanner(System.in);
        int inputChoice = scanner.nextInt();
        String choice = "";

        if (inputChoice < 0 || inputChoice > 2) {
            System.out.println("Please enter a valid choice! 0 = Rock, 1 = Paper, 2 = Scissors");
            scanner.hasNextInt();
        }
        choice = choices(inputChoice);
        return choice;
    }
}
