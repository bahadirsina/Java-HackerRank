import java.util.*;
public class Java_Arraylist {
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int count = scn.nextInt();  
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int count2 = scn.nextInt();
            int[] arr = new int[count2];
            for (int j = 0; j < count2; j++) {
                arr[j] = scn.nextInt();
            }
            list.add(arr);
        }

        int count3 = scn.nextInt();  
        for (int i = 0; i < count3; i++) {
            int x = scn.nextInt(); 
            int y = scn.nextInt();  
            if (x - 1 < list.size() && y - 1 < list.get(x - 1).length) {
                System.out.println(list.get(x - 1)[y - 1]);
            } else {
                System.out.println("ERROR!");
            }
        }
    }
        
}
