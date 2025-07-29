import java.util.*;
import java.util.regex.*;
public class Tag_Content_Extractor {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
		while(testCases>0){
			String line = in.nextLine();
			Matcher matcher = pattern.matcher(line);
            boolean found = false;
          	//Write your code here
            while (matcher.find()) {
                System.out.println(matcher.group(2)); 
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
			
			testCases--;
		}
	}
}
