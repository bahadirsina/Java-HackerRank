import java.util.Scanner;
public class Java_Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function

        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] harfSayaci = new int[26]; 
        for (int i = 0; i < a.length(); i++) {
            harfSayaci[a.charAt(i) - 'a']++;
        }
        for (int i = 0; i < b.length(); i++) {
            harfSayaci[b.charAt(i) - 'a']--;
        }
        for (int sayi : harfSayaci) {
            if (sayi != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
