package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        Main.printDiamond(height, width);

    }

    private static void printDiamond(int height, int width) {
        int s;
        for (int i = 0; i < height; i++) {

            if (i == 0 || i == height - 1 || width == 1) {
                s = 0;
            } else {
                s = 1;
            }
            int a = width / 2 - (i * width / height);
            System.out.println(" ".repeat(Math.abs(a)) + "#".repeat(1)
                    + " ".repeat(Math.max((width - (Math.abs((a) * 2)) - 1 - s), 0))
                    + "#".repeat(s));
        }
    }
}
