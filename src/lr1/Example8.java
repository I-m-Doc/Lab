package lr1;

import java.util.Scanner;
public class Example8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What day of the week is it today? ");
        String weekday = in.nextLine();
        System.out.println("And month? ");
        String month = in.nextLine();
        System.out.println("Finaly, what date is today? ");
        int date = in.nextInt();
        System.out.println("Today is " + date + " of " + month + ", " + weekday);
        in.close();
    }
}
