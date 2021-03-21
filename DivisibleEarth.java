import java.util.Scanner;

public class DivisibleEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size : ");
        int n =sc.nextInt();
        int sn =n/2;
        int[] arr = new int[n];
        for (int i = 0; i <n; ++i)arr[i] = sc.nextInt();     
        int frstD=0;
        for (int i = 0; i < n; i++) {
            if(i<sn){
            while(arr[i]>10){
                arr[i] = arr[i]/10;
            }
            frstD = (frstD+arr[i])*10;}
            else{arr[i] =arr[i]%10;frstD = (frstD+arr[i])*10;}
        }
        System.out.print((frstD/10));
        if((frstD/10)%11==0)System.out.println("OUI");
        else System.out.println("NON");
    }
    
}
