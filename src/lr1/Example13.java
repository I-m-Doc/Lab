package lr1;

import java.util.Scanner;
public class Example13 {
    public static void main(String[] args){
        int C;
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int A = in.nextInt();
        System.out.println("Input second number: ");
        int B = in.nextInt();
        C = A + B;
        System.out.println(A + " + " + B + " = " + C);
        in.close();
    }
}
