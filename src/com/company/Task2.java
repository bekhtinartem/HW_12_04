package com.company;

import java.util.Scanner;

public class Task2 {
    interface GetD{
        double get(double a, double b, double c);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GetD getD=(a, b, c)-> b*b-4*a*c;
        System.out.println(getD.get(in.nextDouble(), in.nextDouble(), in.nextDouble()));
    }
}
