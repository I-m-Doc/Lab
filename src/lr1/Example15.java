package lr1;

import java.util.Scanner;
public class Example15 {
    public static void main(String[] args){
        int B;
        int C;
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int A1 = in.nextInt();
        System.out.println("Input second number: ");
        int A2 = in.nextInt();
        B = A1 + A2;
        C = A1 - A2;
        System.out.println(B + " " + C);
        in.close();
    }
}
