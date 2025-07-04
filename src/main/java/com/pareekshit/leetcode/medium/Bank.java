package main.java.com.pareekshit.leetcode.medium;

//Simple Banking System Leetcode
public class Bank {
    static long[] balance = {10,100,20,50,30};

    public static void main(String[] args) {
        System.out.println(withdraw(3,10));
        System.out.println(transfer(5,1,20));
        System.out.println(deposit(5,20));
        System.out.println(transfer(3,4,15));
        System.out.println(withdraw(10,50));
    }

    public static boolean transfer(int account1, int account2, long money) {
        if (account1> balance.length ||  account2> balance.length || balance[account1 - 1] < money) {
            return false;
        } else {
            balance[account1 - 1] -= money;
            balance[account2 - 1] += money;
        }
        return true;
    }

    public static boolean deposit(int account, long money) {
        if (account> balance.length) {
            return false;
        }
        balance[account - 1] += money;
        return true;
    }

    public static boolean withdraw(int account, long money) {
        if (account> balance.length || balance[account - 1] < money) {
            return false;
        } else {
            balance[account - 1] -= money;
        }
        return true;
    }
}
