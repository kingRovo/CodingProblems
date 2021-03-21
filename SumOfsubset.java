public class SumOfsubset{
    static int TF=0;
    void subset(int set[],int pos,int sum,int tmpsum,int size){
        if(sum==tmpsum)
            TF = 1; 
                
        for(int i=pos;i<size;i++){
            if(tmpsum+set[i]<=sum){
                tmpsum +=set[i];
                subset(set,i+1,sum,tmpsum,size);
                tmpsum =tmpsum-set[i];
                
            }
        }
    }

    public static void main(String[] args) {
        SumOfsubset ob = new SumOfsubset();
        
        int arr[]={10,5,4,8};
        int n =arr.length;
        int fs = 17;
        ob.subset(arr,0,fs,0,n);
        if(TF==1){System.out.print("Found");}
        else System.out.print("Not Found");
    }

}