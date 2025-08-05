import java.util.*;
public class Java_List {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        List<Integer> liste = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            int temp = scn.nextInt();
            liste.add(temp);
        }
        int q = scn.nextInt();
        for(int j = 0; j < q; j++){
            scn.nextLine();
            String queries = scn.nextLine();
            if(queries.compareTo("Insert") == 0){
                int temp1 = scn.nextInt();
                int temp2 = scn.nextInt();
                liste.add(temp1, temp2);
            } else if(queries.compareTo("Delete") == 0){
                int temp3 = scn.nextInt();
                liste.remove(temp3); 
            } else{
                System.out.println("Not Allowed!");
            }
        } 
        for (int sayi : liste) {
            System.out.print(sayi + " ");
        }     
    }
}
