package Challenges;

/* USING VARIABLES */

import java.util.Scanner;

public class Challenge2 {
    void calculate_age() {
        int age;
        int current_year;
        int birth_year;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your current year: ");
        current_year = sc.nextInt();
        System.out.print("Enter your birth year: ");
        birth_year = sc.nextInt();

        age = current_year - birth_year;
        System.out.println("Your age is " + age);
    }

    public static void main(String[] args) {
        (new Challenge2()).calculate_age();
    }
}
