/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ANIL
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Dart {
    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void main(String[] args) {
        System.out.println("DART GAME!");
        System.out.println("Enter the number of darts to be thrown:");
        Scanner scn = new Scanner(System.in);
        long dartnumber = scn.nextLong();
        long numberofthrown = 1;

        int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, U = 0;

        while (numberofthrown <= dartnumber) {
            System.out.println("Dart " + numberofthrown);
            double x = (Math.random() * 2) - 1;
            double y = (Math.random() * 2) - 1;
            System.out.println("Coordinates: (" + df.format(x) + ", " + df.format(y) + ")");

            if (x >= 0 && y >= 0 && x + y < 1) {
                System.out.println("The dart hits the region A");
                A++;
            } else if (x >= 0 && y >= 0 && x + y >= 1) {
                System.out.println("The dart hits the region B");
                B++;
            } else if (x < 0 && y >= 0) {
                System.out.println("The dart hits the region C");
                C++;
            } else if (x < 0 && y < 0 && x < y) {
                System.out.println("The dart hits the region D");
                D++;
            } else if (x < 0 && y < 0 && x >= y) {
                System.out.println("The dart hits the region E");
                E++;
            } else if (x >= 0 && y < 0) {
                System.out.println("The dart hits the region F");
                F++;
            } else {
                System.out.println("The dart hits the region Undecided");
                U++;
            }

            numberofthrown++;
        }

        double AP = 100.0 * A / dartnumber;
        double BP = 100.0 * B / dartnumber;
        double CP = 100.0 * C / dartnumber;
        double DP = 100.0 * D / dartnumber;
        double EP = 100.0 * E / dartnumber;
        double FP = 100.0 * F / dartnumber;
        double UP = 100.0 * U / dartnumber;

        System.out.println("Region statistics:");
        System.out.println("A: " + A + " darts, %" + df.format(AP));
        System.out.println("B: " + B + " darts, %" + df.format(BP));
        System.out.println("C: " + C + " darts, %" + df.format(CP));
        System.out.println("D: " + D + " darts, %" + df.format(DP));
        System.out.println("E: " + E + " darts, %" + df.format(EP));
        System.out.println("F: " + F + " darts, %" + df.format(FP));
        System.out.println("Undecided: " + U + " darts, %" + df.format(UP));
    }
}



