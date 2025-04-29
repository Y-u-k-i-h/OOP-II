package Challenges;

/* Using Random module to make a password generator */

import java.util.Random;
import java.util.Scanner;

public class Challenge6 {
    void password() {

        Random rand = new Random();

        int length;
        String password = "";
        String character_pool =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-{}[]:";

        Scanner sc = new Scanner(System.in);
        System.out.print("How long do you want your password to be (I'll suggest a minimum 8 characters): ");
        length = sc.nextInt();

        for (int i = 0; i < length; i++) {
            int random_index = rand.nextInt(character_pool.length());
            char chosen_character = character_pool.charAt(random_index);
            password += chosen_character;
        }
        System.out.println("Your password is: " + password);
    }

    public static void main(String[] args) {
        (new Challenge6()).password();
    }
}
