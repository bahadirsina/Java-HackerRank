import java.util.*;
import java.util.Arrays;
public class Java_Subarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int subcount = 0;
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scn.nextInt();
        }
        for (int start = 0; start < arr.length; start++) {
            for (int end = start + 1; end <= arr.length; end++) {
                int[] subArray = Arrays.copyOfRange(arr, start, end);
                int sum = 0;
                for (int num : subArray) {
                    sum += num;
                }
                if(sum < 0){
                    subcount++;
                }
            }
        }
        System.out.println(subcount);
    }
}
