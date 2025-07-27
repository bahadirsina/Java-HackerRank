import java.util.*;
public class Java_String_Reverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String arr[] = new String[A.length()];
        int start = 0;
        int end = 1;
    
        for(int i = 0; i < A.length(); i++ ){
            arr[i] = A.substring(start, end);
            start++;
            end++;
        }
        String str = "";
        for(int i = A.length(); i > 0; i-- ){
            str+= arr[i - 1];
        }
        if (str.compareTo(A) == 0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
