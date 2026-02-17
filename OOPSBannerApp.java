/**
 * OOPSBannerApp
 * UC2 - Prints "OOPS" as a 7-line ASCII banner.
 *
 * @author Kalp
 * @version 2.0
 */
import java.util.*;
public class OOPSBannerApp {

    public static void main(String[] args) {

        String s,z;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the strings to join: ");
	s = sc.nextLine();
	z = sc.nextLine();
	String k = String.join(" ", s, z);
	System.out.println("Output: " + k);
    }
}