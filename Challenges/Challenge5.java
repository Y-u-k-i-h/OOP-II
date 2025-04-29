package Challenges;

/* Using a do while loop */

public class Challenge5 {
    void use_while() {
        int i = 1;
        do {
            System.out.println("Number " + i) ;
            i++;
        }
        while (i <= 20);
    }

    public static void main(String[] args) {
        (new Challenge5()).use_while();
    }
}
