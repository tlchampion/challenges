package net.thomaschampion.leetcode.primecounter;

import java.util.Scanner;
import java.util.ArrayList;

public class PrimeCounter {
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(checkForPrimes(num));
    }

    public static int checkForPrimes(int num) {
        if (num <= 2) {
            return 0;
        } else if (num == 3) {
            return 1;
        } else {
            ArrayList<Integer> primes = new ArrayList<>();
            primes.add(2);

            for (int i = 3; i < num; i += 2) {
                if (isPrime(primes, i)){
                    primes.add(i);
                }

            }
            return primes.size();

        }
    }

    public static boolean isPrime(ArrayList<Integer> primes,int num ) {
        for (int j =0; j < primes.size(); j++) {
            if(num % primes.get(j) == 0) {
                return false;
            }

        }
        return true;
    }

}
