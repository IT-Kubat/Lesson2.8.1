package com.company;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String[]> dictionary = new HashMap<>();
        dictionary.put("Cool", new String[]{"beautiful", "wonderful", "smart", "calm"});
        dictionary.put("House", new String[]{"Zhilishe", "Hizhina", "Department", "Kvartiry"});
        dictionary.put("Chelovek", new String[]{"Lichnost'", "Persona", "Homosapiens", "Individum"});

        System.out.println("Enter your word");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words
        ) {
            String[] synonyms = dictionary.get(word);
            Random r = new Random();
            if (synonyms != null) {
                System.out.printf(synonyms[r.nextInt(synonyms.length)] + " ");
            } else {
                System.out.println("Такого слова в словаре нет");
            }
            //Set<String> keys = dictionary.keySet();
//        String[] words = dictionary.get(word);
//        Random r = new Random();
//        r.nextInt(words.length);
//        int index = r.nextInt(words.length);
//        System.out.println(words[index]);

            // write your code here
        }
    }
}
