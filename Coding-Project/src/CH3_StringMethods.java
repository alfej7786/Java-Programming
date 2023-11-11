

public class CH3_StringMethods {
    public static void main(String[] args) {
        String s = "Alfej Savaya";
//        System.out.println(s);
//        int value = s.length();
//        System.out.println(value);

//        String toLower = s.toLowerCase();
//        System.out.println(toLower);

//        String toUpper = s.toUpperCase();
//        System.out.println(toUpper);

//        String trimmm = s.trim();
//        System.out.println(trimmm);

//        String substr = s.substring(3,8);
//        System.out.println(substr);

//        String rp = s.replace('S','H');
//        System.out.println(rp);

        System.out.println(s.indexOf("A"));
        String modifiedName = "Allffeejj";
        System.out.println(modifiedName.indexOf("ee",2));
        System.out.println(modifiedName.lastIndexOf("ff", 4));
    }
}
