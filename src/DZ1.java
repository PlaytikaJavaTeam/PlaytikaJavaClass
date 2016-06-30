/**
 * Created by mfutornyak on 6/29/2016.
 */

import java.util.Scanner;

public class DZ1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Exponentiation of 'a' to degree 'b' ");
        System.out.println("Enter a = ");
        int a = in.nextInt();
        System.out.println("Enter b = ");
        int b = in.nextInt();
        int c = 1;

        for (int i = 0; i < b; i++) {
            c = c * a;
        }
        System.out.println("result = " + c);
    }
}

