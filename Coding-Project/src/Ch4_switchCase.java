import java.util.Scanner;

public class Ch4_switchCase {
    public static void main(String[] args) {
        int age;
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("You're adult!");
            case 23 -> System.out.println("eligible to work");
            case 60 -> System.out.println("Time to retire!");
            default -> System.out.println("Best time!");
        }

//        if (age > 56){
//            System.out.println("You're experienced!");
//        }
//        else if (age > 46) {
//            System.out.println("You're semi-experienced!");
//        }
//        else if (age > 36) {
//            System.out.println("You're semi-semi-experienced!");
//        }
//        else {
//            System.out.println("Sorry!, you're not experienced!");
//        }
    }
}
