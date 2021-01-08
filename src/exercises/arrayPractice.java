package exercises;


import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {
//        Steps One & Two
//        int[] arrrayValue = {1, 1, 2, 3, 5, 8};
//        Step One:
//        for (int arrayVal : arrrayValue) {
//            System.out.println(arrayVal);
//        }
//        Step Two
//        for (int arrayVal : arrrayValue) {
//            if (arrayVal % 2 != 0) {
//                System.out.println(arrayVal);
//            }
//    }
//        Step Three & Four
//        String wordsWords = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] arrayValue;
//        arrayValue = wordsWords.split(" ");
//        System.out.println(Arrays.toString(arrayValue));
        String wordsWords = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] arrayValue;
        arrayValue = wordsWords.split("\\.");
        System.out.println(Arrays.toString(arrayValue));

    }
}
