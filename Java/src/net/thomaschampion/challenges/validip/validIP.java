package net.thomaschampion.challenges.validip;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class validIP{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}