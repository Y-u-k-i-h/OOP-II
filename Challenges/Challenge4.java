package Challenges;

/* Using a scanner */

import java.util.Scanner;

public class Challenge4 {
    void scanner_implementation() {
        String first_name;
        String last_name;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        first_name = scanner.nextLine();
        System.out.print("Enter your last name: ");
        last_name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        scanner.close();

        System.out.println("Your name is " + first_name + " " + last_name + " " + "and you are " + age + " years old.");
    }

    public static void main(String[] args) {
        (new Challenge4()).scanner_implementation();
    }
}
