import java.util.*;
public class Java_1D_Array {
    public static void main(String[] args) {
 	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int temp;
        for (int j = 0; j < a.length; j++) {
             temp = scan.nextInt();
             a[j] = temp;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
