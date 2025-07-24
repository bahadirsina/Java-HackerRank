import java.util.*;
public class Java_End_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int i = 0;
        while (scn.hasNextLine()) {
            i++;
            String kelime = scn.nextLine();
            System.out.println(i + " " + kelime);
        }
    }
}
