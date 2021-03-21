import java.util.*;
public class DailyCoding_4{
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){

            System.out.print("Enter "+(i+1)+" Element : ");
            arr.add((sc.nextInt()));

        }
         
        arr.add(4); 

        int min = arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>0 && arr.get(i)<min)min = arr.get(i);
        }
        for(int i=0;i<arr.size();i++){
            min =min+1;
            if(!arr.contains((min))){
                System.out.print("Missing Positive Number : ");
                System.out.print(min);
                break;
            }


        }
  
}}