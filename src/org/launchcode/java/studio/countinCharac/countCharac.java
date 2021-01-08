package org.launchcode.java.studio.countinCharac;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static java.lang.Character.isLetter;

public class countCharac {
    public static void main(String[] args) {
        HashMap<Character, Integer> letterCount = new HashMap<>();
        converttoCharArr(letterCount);
//        String poem = "Natures first green is gold. Her hardest hue to hold. Her early leaf's a flower, but only so an hour. Then leaf subsides to leaf, and Eden sank to grief. Dawn goes down to day. Nothing gold can stay.";


    }
    public static String poem = "Natures first green is gold. Her hardest hue to hold. Her early leaf's a flower, but only so an hour. Then leaf subsides to leaf, and Eden sank to grief. Dawn goes down to day. Nothing gold can stay.";

    public static void converttoCharArr(HashMap<Character, Integer> letterCount){
        char [] charactersInString = poem.toLowerCase().toCharArray();
        for (char letter : charactersInString) {
           if (!letterCount.containsKey(letter)) {
               letterCount.put(letter, 1);
           } else {
               letterCount.put(letter, letterCount.get(letter) + 1);
           };
        };
//        letterCount.forEach(k,v) ->System.out.println(k + ":" + v);

        for (Map.Entry entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        };
//        letterCount.forEach(k,v) ->System.out.println(k + ":" + v);
//        System.out.println(letterCount);

    }

}
