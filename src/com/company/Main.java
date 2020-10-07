package com.company;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int wordCount = 0;

    public static void main(String[] args) {
        String words = "the ye yasszz pez pay letz yellow beny!p bkz:z";
        countYZ(words);
    }

    public static void countYZ(String str) {
//        String[] collectionsOfStrings = str.split(" ",Integer.MAX_VALUE);
//        List<String> words = new ArrayList<>(Arrays.asList(collectionsOfStrings));
//        int wordCount = 0;
//        for (String word : words) {
//            if (word.endsWith("y") || word.endsWith("z")) {
//                wordCount++;
//            }
//        } return wordCount;
//    }
        System.out.println(loopThroughWords(storeWords(str)));
    }
    private static ArrayList<String> storeWords(String words) {
        String[] collectionOfWords = words.split(" ");
        return new ArrayList<>(Arrays.asList(collectionOfWords));
    }
    private static int loopThroughWords(ArrayList<String> ListOfWords) {
        for (String word: ListOfWords) {
            if (word.endsWith("y") || word.endsWith("z")) {wordCount++;}
        } return wordCount;
    }
}