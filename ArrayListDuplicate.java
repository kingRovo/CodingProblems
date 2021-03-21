import java.util.ArrayList;

public class ArrayListDuplicate {

    public ArrayList<String> findDuplicates(ArrayList<String> input1){

        
        int[]arr = new int[]{1,2,3,4,3,5};
        System.out.println("duplicate elements in");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(arr[i]==arr[j]){System.out.println(arr[j]);
                    input1.add(""+arr[j]);

                }
            }
        }

        return input1;
    }

    public static void main(String[] args) {

        ArrayList<String> input1 =  new ArrayList<String>();

        ArrayListDuplicate ob = new ArrayListDuplicate();
        System.out.print(ob.findDuplicates(input1));
    }

    
}
