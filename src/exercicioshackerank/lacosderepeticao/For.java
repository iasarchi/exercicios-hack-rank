package exercicioshackerank.lacosderepeticao;

import java.util.Scanner;

public class For {
    Scanner scanner= new Scanner(System.in);
    int t= scanner.nextInt();
    int a=scanner.nextInt();
    int b=scanner.nextInt();
    int n=scanner.nextInt();
    {
        for (int i = 0; i < t; i++) {
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int n=scanner.nextInt();
            for (int j = 0; j < n ; j++) {

                a += (Math.pow(2,j)*b);
                System.out.print(a+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}



