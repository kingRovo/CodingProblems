public class subList {
    public static void main(String[] args) {
        int arr[] = {5,2,1};
        int s=0,k=2;
        int n =arr.length;
        for(int i=0;i<=n-k;i++){
        s=arr[i];
        for(int j=i;j<i+k;j++){
            
            if(s<=arr[j])
            {
            s=arr[j];
            }
        }
        System.out.print(s+" ");}
    }
}
