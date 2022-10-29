import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");

        int x= 10;
        int y = 15;
        int z = x+y;

        int a = 100/z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int b = sc.nextInt();
        System.out.println("Enter your text");
        String s = sc.next()+sc.nextLine();

        System.out.println("The output is : "+(a*b)+" "+s);
        //test
    }
}
