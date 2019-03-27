import java.util.*;
public class Glowingbulbs1
 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases u want");
		int c=sc.nextInt();
		int arr[]=new int[10];
		int k=0;
		for(int i=0;i<c;i++)
		{
			System.out.println("test case"+ " "+i);
			System.out.println("Ener the values of switch");
			
			for(int j=0;j<10;j++)
			{
				arr[j] = sc.nextInt();
			}
			System.out.println("Enter the integer k");
			k = sc.nextInt();
		}
		for(int i=0;i<c;i++)
		{
			System.out.println("case"+ +i);
			for(int j=0;j<10;j++)
			{
				System.out.print(arr[j]);
		}
			System.out.println();
			System.out.println(k);
			System.out.println();
		}
		
	}
}








