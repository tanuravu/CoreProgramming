package Strings;

public class Q1CountVowels {
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase().replaceAll("[^a-z]", "");

        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) vowels++;
            else consonants++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

}
