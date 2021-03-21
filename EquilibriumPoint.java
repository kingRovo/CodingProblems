public class EquilibriumPoint {

    public static void main(String[] args) {
        int arr[] = {1,3,6,1,0};
        int n  = arr.length;
        int lf_sum=0,rt_sum=0;
        if(n==1)System.out.println(arr[0]);
        else
        for(int i=0;i<n/2;i++){

            lf_sum=lf_sum+arr[i];
            rt_sum=rt_sum+arr[n-i-1];

            if(lf_sum==rt_sum){
                System.out.println((i+2));break;
            }
        }
    }
    
}
