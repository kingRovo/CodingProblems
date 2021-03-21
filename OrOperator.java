public class OrOperator {
    public static void main(String[] args) {
        int arr[] = {5,9,2,6};
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i==(n-1))arr[i] = arr[i];
            else arr[i] = (arr[i]|arr[i+1]);
        }
        for(int i =0;i<n;i++)System.out.print(arr[i]+" ");
    }
}
