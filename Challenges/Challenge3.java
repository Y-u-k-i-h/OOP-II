package Challenges;

/* Using if else */

import java.util.Scanner;

public class Challenge3 {
    void grade_remarks() {
        float grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the grade for remarks: ");
        grade = sc.nextFloat();

        if (grade >= 70) {
            System.out.println("You have passed!");
        }
        else if (grade >=40 && grade < 70) {
            System.out.println("You have really tried");
        }
        else {
            System.out.println("You have failed");
        }
    }

    public static void main(String[] args) {
        (new Challenge3()).grade_remarks();
    }
}
