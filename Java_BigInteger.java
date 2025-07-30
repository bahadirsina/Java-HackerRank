import java.util.*;
import java.math.*;
public class Java_BigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        String n = scn.next();
        BigInteger number = new BigInteger(n);
        String n2 = scn.next();
        BigInteger number2 = new BigInteger(n2);
        System.out.println(number.add(number2));
        System.out.println(number.multiply(number2));
    }
}
