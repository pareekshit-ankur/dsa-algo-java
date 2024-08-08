package main.java.com.pareekshit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TheMinimumCost {
    static int solve(int N, int M) {
        // Write your code here
        int cost = 0;
        if (N % 2 == 1) {
            return -1;
        } else {
            int divisor = N / 2;
            while (N < M) {
                if (divisor % 2 == 1) {
                    divisor -= 1;
                }
                if (N + divisor < M) {
                    cost += N / divisor;
                    N += divisor;
                    divisor = N / 2;
                } else if (N + divisor == M) {
                    cost += N / divisor;
                    return cost;
                } else
                    break;
            }
            if (N + divisor > M) {
                if (N % (M - N) == 0) {
                    cost += N / (M - N);
                    return cost;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int M = Integer.parseInt(line[1]);

            int out_ = solve(N, M);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
}
