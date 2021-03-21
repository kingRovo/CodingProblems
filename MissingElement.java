import java.util.*;
public class MissingElement {
    public static void main(String[] args) {
        ArrayList<Integer>arr =  new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Array Size: ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++)arr.add(sc.nextInt());
        
        for(int i =1;i<=n;i++){
            if(!arr.contains(i)){
                System.out.print((i));
                break;
            }


        }
    }
    
}
