
package exercicioshackerank.lacosderepeticao;

import java.util.Scanner;

/*
We use the integers a, b, and n to create the following series:

(a+2°*b),(a+2°*b+2¹*b),....

You are given  queries in the form of a, b, and n. For each query, print the series corresponding
to the given a, b, and n values as a single line of  space-separated integers.
 */
public class For {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        {
            for (int i = 0; i < t; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int n = scanner.nextInt();
                for (int j = 0; j < n; j++) {

                    a += (Math.pow(2, j) * b);
                    System.out.print(a + " ");
                }
                System.out.println();
            }
            scanner.close();
        }
    }
}



