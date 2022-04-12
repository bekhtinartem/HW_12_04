package com.company;

import java.util.Scanner;

public class Task1 {
    interface IsDiv{
        boolean is(int x);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IsDiv isDiv = (x) -> x%13==0, ab;
        System.out.println(isDiv.is(in.nextInt()));
    }
}
