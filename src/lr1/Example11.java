package lr1;

import java.util.Scanner;
public class Example11 {
    public static void main(String[] args){
        int currentyear = 2024;
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = in.nextLine();
        System.out.println("Input year of your birth: ");
        int year = in.nextInt();
        age = currentyear - year;
        System.out.println(name + ", you are " + age + " years old now");
        in.close();
    }
}
