package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ListArray {
    public static void main(String[] args) {
//        Step One
//        ArrayList<Double> randomNum = new ArrayList<>(10);
//        randomNum.add(13.0);
//        randomNum.add(35.0);
//        randomNum.add(6.0);
//        randomNum.add(98.0);
//        randomNum.add(16.0);
//        randomNum.add(12.0);
//        randomNum.add(25.0);
//        randomNum.add(76.0);
//        randomNum.add(13.0);
//        randomNum.add(92.0);
//        System.out.println(randomNum);
//        double sum = 0.0;
//        ArrayList<Double> evenNum = new ArrayList<>();
//        for (int i = 0; i < randomNum.size(); i++) {
//            if (randomNum.get(i) % 2 == 0 ) {
//                sum += randomNum.get(i);
//                evenNum.add(randomNum.get(i));
//                System.out.println(randomNum.get(i));
//            };
//        };
//        double avg = sum / evenNum.size();
//        System.out.println("Average of Evens: " + avg);
//        Step 2
//        ArrayList<String> randomWords = new ArrayList<>(10);
//        randomWords.add("epicede");
//        randomWords.add("absorbefacient");
//        randomWords.add("gerontogragy");
//        randomWords.add("delitescent");
//        randomWords.add("calix");
//        randomWords.add("seriema");
//        randomWords.add("dossil");
//        randomWords.add("dol");
//        randomWords.add("knock");
//        randomWords.add("trust");
//        System.out.println(randomWords);
//        ArrayList <String> fiveLetWord = new ArrayList<>();
//        for (int i = 0; i < randomWords.size(); i++) {
//            String wordpoten = randomWords.get(i);
//            if (wordpoten.length() == 5) {
//                fiveLetWord.add(randomWords.get(i));
//                System.out.println(fiveLetWord);
//            }
//        }
//        Step Three
        ArrayList<String> randomWords = new ArrayList<>(10);
        randomWords.add("epicede");
        randomWords.add("absorbefacient");
        randomWords.add("gerontogragy");
        randomWords.add("delitescent");
        randomWords.add("calix");
        randomWords.add("seriema");
        randomWords.add("dossil");
        randomWords.add("dol");
        randomWords.add("knock");
        randomWords.add("trust");
        System.out.println(randomWords);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word length: ");
        double wordLength = input.nextDouble();
        ArrayList <String> letterWord = new ArrayList<>();
        for (int i = 0; i < randomWords.size(); i++) {
            String wordpoten = randomWords.get(i);
            if (wordpoten.length() == wordLength) {
                letterWord.add(randomWords.get(i));
                System.out.println(letterWord);
            }
        }
    }
}
