import java.util.Scanner;

public class Terningspil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();
        System.out.println("This game has to two dice. Winner is first to roll two ones.");
        while(true) {
            System.out.println("Enter any key to roll (or \"quit\" to quit):");
            String choice = input.next();
            if(choice.toLowerCase().equals("quit")) {
                System.out.println("Game quit.");
                break;
            }
            terning1.roll();
            terning2.roll();
            System.out.println("You rolled " + terning1.faceValue + " and " + terning2.faceValue + ".");
            if(terning1.faceValue == 1 && terning2.faceValue == 1) {
                System.out.println("Snake eyes! Game over.");
                break;
            }
        }
    }
}