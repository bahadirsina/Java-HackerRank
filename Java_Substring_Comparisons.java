import java.util.Scanner;
public class Java_Substring_Comparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] arr = new String[(s.length()- k) + 1];
        int start = 0;
        for (int i = 0; i < arr.length; i++ ){
            String temp = s.substring(start, k);
            arr[i] = temp;
            start++;
            k++;
        }
        for (int p = 0; p < arr.length - 1; p++) {
            for (int j = 0; j < arr.length - 1 - p; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        smallest = arr[0];
        largest = arr[(arr.length) - 1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
