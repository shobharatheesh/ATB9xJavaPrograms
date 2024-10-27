package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class VowelsConsonantsWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        //Performing operation

        countVowelsAndConsonants(str);

        sc.close();

    }

    public static void countVowelsAndConsonants(String str)
    {
        int i = 0;
        int vowels =0;
        int consonants =0;

        str = str.toLowerCase();

        while(i < str.length())
        {
            char ch = str.charAt(i);

            if(ch=='a' || ch == 'e'||ch=='i'||ch =='o'||ch=='u')
            {
                vowels =vowels+1;

            }
            else
            {
                consonants = consonants+1;
            }

           i++;
        }
        System.out.println("Number vowels and consonants: " +i);

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

}
