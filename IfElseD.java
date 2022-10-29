import java.util.Scanner;

public class IfElseD {
    public static void main(String[] args) {
        System.out.println("Please enter the year :");
        Scanner yrs = new Scanner(System.in);
        int year = yrs.nextInt();
        if(year%400 == 0) {
            System.out.println("Leap Year");
        }
        else if(year%4 == 0 && year%100 != 0) {
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
