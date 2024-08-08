package main.java.com.pareekshit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicalGame {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int noOfPeople = s.nextInt();
        int durationOfSong = s.nextInt();
        List<Integer> peoples = new ArrayList<>();
        for (int i = 0; i < noOfPeople; i++) {
            peoples.add(i + 1);
        }
        int indexToRemove;
        int i = durationOfSong - 1;
        int j = 0;
        while (peoples.size() > 1) {
            for (j = i % peoples.size(); j < peoples.size(); j += durationOfSong) {
                indexToRemove = j % peoples.size();
                peoples.remove(indexToRemove);
                i += durationOfSong;
                j--;
            }
            i = j;
        }
        System.out.println((peoples.isEmpty() ? 0 : peoples.get(0)));
    }
}
