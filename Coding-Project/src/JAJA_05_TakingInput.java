import java.util.Scanner;

public class JAJA_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The total is:" + c);

    }
}
