package ex_02_Java_Basics;

import java.util.Scanner;

public class test001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().charAt(0);

        // Convert to lowercase to simplify comparison
        ch = Character.toLowerCase(ch);

        // Check if input is a letter
        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }

        scanner.close();

    }
}
