import java.util.*;
public class Weightsascending
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		int sp[] = new int[n];
		//int res[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			sp[j] = arr[j]%k;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				
				if(sp[i]<sp[j])
				{
					int temp1 = sp[j];
					    sp[j] = sp[i];
					    sp[i] = temp1;
					int temp  = arr[j];
					    arr[j] = arr[i];
					    arr[i] = temp;	
					    
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(sp[i]==0 && sp[j]==0)
				{
					int temp11 = sp[j];
				    sp[j] = sp[i];
				    sp[i] = temp11;
				int temp12  = arr[j];
				    arr[j] = arr[i];
				    arr[i] = temp12;
				}
			}
		}
		for(int j=0;j<n;j++)
		{
			System.out.print(arr[j] +" ");
		}	
	}	
}
