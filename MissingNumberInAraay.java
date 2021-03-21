public class MissingNumberInAraay{
public static void main(String arg[]){
int arr[] = {1,2,3,5};
for(int i=0;i<arr.length;i++){
if(arr[i]!=(arr[i+1]+1))System.out.println("Missing Number  .."+arr[i+1]);
}
}}