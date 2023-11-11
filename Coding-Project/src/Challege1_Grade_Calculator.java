import java.util.Scanner;

public class Challege1 {
    public static void main(String[] args) {
        int totalMarks = 500;
        int totalPercent = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name:");
        String str = sc.nextLine();
        System.out.println("Enter Maths grades:");
        int math = sc.nextByte();
        System.out.println("Enter English grades:");
        int eng = sc.nextByte();
        System.out.println("Enter Physics grades:");
        int phy = sc.nextByte();
        System.out.println("Enter Biology grades:");
        int bio = sc.nextByte();
        System.out.println("Enter Chemistry grades:");
        int chem = sc.nextByte();
        System.out.println("----------- * REPORT *-------------");
        System.out.println("Name: " + str);
        System.out.println("Maths: " + math);
        System.out.println("English: " + eng);
        System.out.println("Physics: " + phy);
        System.out.println("Biology: " + bio);
        System.out.println("Chemistry: " + chem);

        int sum = math+eng+phy+bio+chem;
        int totalPercentage = sum/totalMarks*totalPercent;
        System.out.println(sum);
        System.out.println(totalPercentage);
    }
}
