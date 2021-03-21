import java.util.*;
public class BinarySearch {

    
    public boolean binarySearch(int[] input1, int input2){
         
        int lw =0;
        int hg = input1.length-1;
        while (lw <= hg) {
            int mid = lw + (hg - lw) / 2;
            if (input1[mid] == input2)
                return true;
            if (input1[mid] < input2)
                lw = mid + 1;
            else
                hg = mid - 1;
      }
  
      return false;
    }
    
    public static void main(String[] args) {

        BinarySearch ob =new BinarySearch();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] input1 = new int [n];

        for (int i = 0; i < n; i++) {

            input1[i] = sc.nextInt();
            
        }
        int input2 = sc.nextInt();

        System.out.print(ob.binarySearch(input1, input2));


        
    }
    
}
