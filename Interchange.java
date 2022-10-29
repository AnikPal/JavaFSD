import java.util.Scanner;

public class Interchange {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        float a = no.nextFloat();
        System.out.print("Enter the 2nd number : ");
        float b = no.nextFloat();
        System.out.println("The 1st and 2nd number before swap are : " + a + " & " + b);
        b = b+a;
        a = b-a;
        b = b-a;
        System.out.println("The 1st and 2nd number after swap are : " + a + " & " + b);

    }
}
