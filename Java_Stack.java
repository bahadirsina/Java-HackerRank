import java.util.*;
public class Java_Stack {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Stack<String> stc = new Stack<>();
	        while (sc.hasNextLine()) {
	            String ifade = sc.nextLine();
	            Stack<Character> stack = new Stack<>();
	            boolean dogruMu = true;

	            for (char c : ifade.toCharArray()) {
	                if (c == '(' || c == '{' || c == '[') {
	                    stack.push(c);
	                } else if (c == ')' || c == '}' || c == ']') {
	                    if (stack.isEmpty()) {
	                        dogruMu = false;
	                        break;
	                    }

	                    char son = stack.pop();

	                    if ((c == ')' && son != '(') ||
	                        (c == '}' && son != '{') ||
	                        (c == ']' && son != '[')) {
	                        dogruMu = false;
	                        break;
	                    }
	                }
	            }

	            if (!stack.isEmpty()) {
	                dogruMu = false;
	            }

	            System.out.println(dogruMu);
	        }
	    }
}
