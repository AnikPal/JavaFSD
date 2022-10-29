import java.util.Scanner;

public class Secondweek {
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String isEvenOdd = (x%2 == 0)?"even":"odd";
        System.out.println("The entered number is " + isEvenOdd + ".");
    }
}
