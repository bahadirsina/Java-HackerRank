import java.util.*;
public class Java_Static_Initializer_Block {
static int B;
static int H;
static boolean flag = true;
static {
	Scanner scn = new Scanner(System.in);
	B = scn.nextInt();
	H = scn.nextInt();
	if (B <= 0 || H <= 0) {
		flag = false;
	    System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
}    
public static void main(String[] args){
	if(flag){
		int area=B*H;
		System.out.print(area);
	}
			
}//end of main
}