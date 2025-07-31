package main.java.com.pareekshit.leetcode.easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        List<Pair> list = new ArrayList<>();
        for (String string : arr) {
            list.add(new Pair(string.substring(0, string.length() - 1), Integer.parseInt(string.substring(string.length() - 1))));
        }
        list.sort(Comparator.comparingInt(Pair::getPosition));
        StringBuilder sb = new StringBuilder();
        for (Pair pair : list) {
            sb.append(pair.getWord());
            sb.append(" ");
        }

        return sb.toString().trim();

        // Better optimized solution
        /*String[] sentenceArr = s.split(" ");
        String[] finalString = new String[sentenceArr.length];

        for(String word : sentenceArr) {
            int wordLength = word.length();

            int index = Character.getNumericValue(word.charAt(wordLength - 1));
            finalString[index - 1] = word.substring(0, wordLength - 1);
        }

        return String.join(" ", finalString);*/
    }

    class Pair {
        String word;
        Integer position;

        public Pair(String word, Integer position) {
            this.word = word;
            this.position = position;
        }

        public String getWord() {
            return word;
        }

        public Integer getPosition() {
            return position;
        }
    }
}
