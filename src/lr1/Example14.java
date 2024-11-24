package lr1;

import java.util.Scanner;
public class Example14 {
    public static void main(String[] args){
        int B;
        int C;
        int D;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int A = in.nextInt();
        B = A - 1;
        C = A + 1;
        D = (A + B + C) * (A + B + C);
        System.out.println(B + " " + A + " " + C + " " + D);
        in.close();
    }
}
