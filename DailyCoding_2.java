public class DailyCoding_2{

public static void main(String arg[]){
int arr[]= {2,3,4,1};
int n = arr.length;
int prd =1;
int[] Parr = new int[n];
for(int i =0;i<n;i++){
prd =1;
for(int j=0;j<n;j++){
if(i==j)continue;
prd = prd*arr[j];
}
Parr[i] = prd; 
}
for(int i =0;i<n;i++){
System.out.print(Parr[i]+" ");}
}
}