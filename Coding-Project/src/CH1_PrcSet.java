import java.util.Scanner;

public class CH1_PrcSet {
    public static void main(String[] args) {
        float ml = 0.621371f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kiloMetre: ");
        float kmNumber = sc.nextFloat();
        System.out.println(kmNumber);
        float convertToML = kmNumber * ml;
        System.out.println("Converted Km to ml is: " + convertToML);
    }
}



