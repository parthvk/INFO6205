package edu.neu.coe.info6205.union_find;

import java.util.*;
public class UF_Client {

    public static int count(int n) {
        int count = 0;
        UF_HWQUPC u = new UF_HWQUPC(n);
        Random r = new Random();

        while (u.components() > 1) {
            int a = r.nextInt(n);
            int b = r.nextInt(n);

            u.connect(a, b);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("The number of objects is " + num + ", and the number of connections is " + count(num));

        System.out.println("Part 3: Test the relationship between m and n");
        for (int i = 1000; i < 1000000; i *= 2) {
            int total = 0;
            for (int j = 0; j < 100; j++) {
                total += count(i);
            }
            int meanNumber = total / 100;
            System.out.println("The number of objects is " + i + ", and the number of pairs is " + meanNumber);
        }
    }
}
