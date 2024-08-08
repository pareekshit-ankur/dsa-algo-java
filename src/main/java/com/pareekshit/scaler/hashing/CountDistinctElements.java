package main.java.com.pareekshit.scaler.hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class CountDistinctElements {

    public int solve(ArrayList<Integer> A) {
        HashSet<Integer> set = new HashSet<>(A);
        return set.size();
    }
}
