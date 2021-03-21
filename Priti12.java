
public class Priti12 
{

	public static void main(String[] args) 
	{
		int a[] ={1,3,5,2,2};
		int n = 0;
		while (n<a.length)
		{
			int sum =0;
			int j;
			int k;
			for(j=0;j<a.length;j++)
			{
				sum = sum +a[j];
			}
			
			int sumation =0;
			for(k=a.length-1;k>=1;k--)
			{
				sumation = sumation +a[k];
			}
			
			if(sum==sumation) 
			{
				System.out.print("equlibrium point is at"+a[j]);
			}
			n++;
            System.out.print("equlibrium point is at"+a[j]);
            
		}
		
		

	}

}