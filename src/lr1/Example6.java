package lr1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input surname: ");
        String surname = in.nextLine();
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input Patronymic: ");
        String Patronymic = in.nextLine();
        System.out.println("Hello " + surname + " " + name + " " + Patronymic);
        in.close();
    }
}
