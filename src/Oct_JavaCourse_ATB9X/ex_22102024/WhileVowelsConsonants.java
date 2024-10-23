package Oct_JavaCourse_ATB9X.ex_22102024;

import java.util.Scanner;

public class WhileVowelsConsonants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Initialize counters for vowels and consonants
        int vowels = 0, consonants = 0;
        int i = 0; // Initialize the index for the while loop

        // Convert the string to lowercase to simplify comparison
        input = input.toLowerCase();

        // Loop through each character of the string using while loop
        while (i < input.length()) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                //vowels++;
                vowels =vowels+1;
            }
            // Check if the character is a consonant (and a letter)
            else if (ch >= 'a' && ch <= 'z') {
                //consonants++;
                consonants = consonants+1;
            }

            // Increment the index
            i++;
        }

        // Output the counts of vowels and consonants
        System.out.println("Number vowels and consonants: " +i);

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        sc.close();
    }
}
