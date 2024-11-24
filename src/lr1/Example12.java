package lr1;

import java.util.Scanner;
public class Example12 {
    public static void main(String[] args){
        int currentyear = 2024;
        int birthyear;
        Scanner in = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = in.nextInt();
        birthyear = currentyear - age;
        System.out.println("You were born in " + birthyear);
        in.close();
    }
}
