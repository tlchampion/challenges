package net.thomaschampion.challenges.permutation;
/*
This program will take in a string provided from the user and return an array containing the distinct
distinct permutations of the characters in the string. Input terminates at the first space or character return.
 */
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    static boolean shouldSwap(char[] str, int start, int curr){
        for(int i = start; i < curr; i++){
            if(str[i] == str[curr]) {
                return false;
            }

        }
        return true;
    }

    static List<String> singlePermutations(String s) {
        List<String> solution = new ArrayList<>();
        char[] str = s.toCharArray();
        int n = str.length;

        findPermutations(str, 0, n, solution);
        return solution;
    }

    static void swap(char[] str, int i, int j) {
        char c = str[i];
        str[i] = str[j];
        str[j] = c;
    }


    public static void findPermutations(char[] str, int index, int n, List<String> solution) {
        if (index >= n) {


            String string = new String(str);
            solution.add(string);

        }

        for (int i = index; i < n; i++) {
            boolean check = shouldSwap(str, index, i);
            if (check) {
                swap(str, index, i);
                findPermutations(str, index + 1, n, solution);
                swap(str, index, i);
            }

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string of characters. Spaces are not allowed");
        String input = scan.next();



        List<String> answer;



        answer = singlePermutations(input);
        System.out.println(answer);
    }
}
