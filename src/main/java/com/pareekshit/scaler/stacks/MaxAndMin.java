package main.java.com.pareekshit.scaler.stacks;

import java.util.Stack;

public class MaxAndMin {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 7, 3, 8}));
        System.out.println(solve(new int[]{994390, 986616, 976849, 979707, 950477, 968402, 992171, 937674, 933065, 960863, 980981, 937319, 951236, 959547, 991052, 991799, 992213, 941294, 978103, 997198, 960759, 988476, 963517, 980366, 921767, 979757, 977912, 983761, 981869, 947454, 930202, 999086, 973538, 999798, 996446, 944001, 974217, 951595, 942688, 975075, 970973, 970130, 897109, 927660, 862233, 997130, 986068, 954098, 978175, 889682, 988973, 996036, 969675, 985751, 977724, 881538, 988613, 924230, 906475, 915565, 986952, 975702, 994316, 964011, 986848, 983699, 949076, 989673, 981788, 929094, 988310, 926471, 994763, 999736, 980762, 973560, 996622, 934475, 998365, 966255, 998697, 998700, 911868, 983245, 996382, 996992, 953142, 994104, 987303, 853837, 960626, 904203, 998063, 977596, 977868, 996012, 946345, 949255, 988138, 996298, 954933, 965036, 886976, 998628, 990878, 953725, 916744, 985233, 919661, 970903, 986066}));
    }

    public static int solve(int[] A) {
        if (A.length == 1) {
            return 0;
        }
        int[] nsl = prevSmaller(A);
        int[] ngl = prevGreater(A);
        int[] nsr = nextSmaller(A);
        int[] ngr = nextGreater(A);
        long ans = 0, mod = 1000000007;
        for (int i = 0; i < A.length; i++) {
            long max = (long) (i - ngl[i]) * (ngr[i] - i);
            long min = (long) (i - nsl[i]) * (nsr[i] - i);
            ans += (max - min) * A[i];
        }
        return (int) (ans % mod);
    }

    public static int[] nextGreater(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = A.length;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    public static int[] nextSmaller(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = A.length;
            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }


    public static int[] prevGreater(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;

            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    public static int[] prevSmaller(int[] A) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                res[i] = -1;

            } else {
                res[i] = stack.peek();
            }
            stack.push(i);
        }
        return res;
    }

    /*public static int solve(int[] A) {
    if (A.length == 1) {
        return 0;
    }
    int[] prevSmaller = prevSmaller(A);
    int[] prevGreater = prevGreater(A);
    int[] nextSmaller = nextSmaller(A);
    int[] nextGreater = nextGreater(A);
    long ans = 0, mod = 1L*1000000007;
    for (int i = 0; i < A.length; i++) {
        long nsl = prevSmaller[i];
        long ngl = prevGreater[i];
        long nsr = nextSmaller[i];
        long ngr = nextGreater[i];
        long max = (i - ngl) * (ngr - i);
        long min = (i - nsl) * (nsr - i);
        ans += A[i] * (max-min);
        ans %= mod;
    }
    return (int) (ans%mod);
}*/
}
