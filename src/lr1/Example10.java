package lr1;

import java.util.Scanner;
public class Example10 {
    public static void main(String[] args){
        int currentyear = 2024;
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Input year of your birth: ");
        int year = in.nextInt();
        age = currentyear - year;
        System.out.println("You are " + age + " years old now");
        in.close();
    }
}
