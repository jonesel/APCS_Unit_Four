
import java.util.Scanner;

public class Disemvoweling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the disemvoweling utility.");
        System.out.println("Enter your phrase: ");
        String og = scan.nextLine();
        og = og.toLowerCase();
        String newF1 = vowelFind(og);
        String end = doubleFind(newF1);
        System.out.println("The disemvoweled phrase is: " + end);
        double l = (og.length());
        double l1 = (end.length());
        double lengthP = l1 - l;
        double lengthP1 = lengthP/l;
        double lengthP2 = lengthP1 * 10000;
        double lengthP3 = (int) (lengthP2 + .5);
        double lengthP4 = (lengthP3 / 100);
        System.out.println("Reduced from " + l + " to " + l1 + " characters. Reduction rate of " + lengthP4 + "%");

    }

    public static String doubleFind(String original) {
        int l = original.length() - 1;
        String newF = "";
        for (int i = 0; i < l; i++) {
            String a = original.substring(i, i + 1);
            String b = original.substring(i + 1, i + 2);

            if (!(a.equals(b))) {
                newF += original.substring(i, i + 1);

            }
        }
        newF += original.substring(l);
        return newF;
    }

    public static String vowelFind(String original)
    {
        int l = original.length();
        String newF1 = "";
        String a = "a";
        String e = "e";
        String vowelI = "i";
        String o = "o";
        String u = "u";
        String y = "y";
        for (int i = 0; i < l; i++) {
            if ((!(original.substring(i,i+1).equals(a)) && !(original.substring(i, i+1).equals(e)) && !(original.substring(i, i+1).equals(vowelI)) && !(original.substring(i, i+1).equals(o)) && !(original.substring(i, i+1).equals(u)) && !(original.substring(i, i+1).equals(y)))){
           newF1 += original.substring(i, i+1);
            }
            else {
                newF1 += "";
            }
        }
    return newF1;

    }
}
