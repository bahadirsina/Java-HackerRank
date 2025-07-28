import java.util.*;
public class Java_String_Tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }
        String arr[] =  s.trim().split("[!,?._'@\\s]+");
        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // Write your code here.
        scan.close();
    }
}
