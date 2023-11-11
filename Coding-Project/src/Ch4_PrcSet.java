import java.util.Scanner;
import java.util.concurrent.Phaser;

public class Ch4_PrcSet {
    public static void main(String[] args) {
//        System.out.println("Enter your marks for the subjects listed below:");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Maths: ");
//        int Maths = sc.nextInt();
//
//        System.out.print("English: ");
//        int English = sc.nextInt();
//
//        System.out.print("ICT: ");
//        int ICT = sc.nextInt();
//
//        float total = ((Maths + English + ICT) / 300f) * 100f;
//
//        if (total >= 40 && Maths >= 33 && English >= 33 && ICT >= 33){
//            System.out.println("Congratulations! You've passed!");
//        }
//        else {
//            System.out.println("Sorry! You've failed!");
//        }
//                Scanner sc = new Scanner (System.in);
//                System.out.println("Enter your income in lakhs :");
//                float income = sc.nextFloat();
//                float tax = 0;
//                if(income<=2.5f){
//
//                    System.out.println("Tax to be paid in lakhs is : " + String.format("%.2f", tax ) + "/-");
//                }
//                else if (income>2.5f && income<=5.0f){
//                    tax = income*.05f;
//                    System.out.println("Tax to be paid is in lakhs : " + String.format("%.2f",tax) + "/-");
//                }
//                else if (income>5.0f && income<=10.0f){
//                    tax = income*0.20f;
//                    System.out.println("Tax to be paid in lakhs is : "+String.format("%.2f",tax)+"/-" );
//                }
//                else if (income>10.0f){
//                    tax = income*0.30f;
//                    System.out.println("Tax to be paid in lakhs is : "+ String.format("%.2f",tax)+ "/-");
//                }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any number 1 to 7: ");
        int num = sc.nextInt();
        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

            }
}
