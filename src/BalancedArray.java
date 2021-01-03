import java.util.Scanner;
public class BalancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedArray br = new BalancedArray();
		Scanner input  = new Scanner(System.in);
		
		//size of the array
		System.out.printf("Enter size of the array : ");
		int size = input.nextInt();
		
		int [] arr = new int[size];
		
		System.out.println("Enter element for array index : ");
		for(int i=0;i<size;i++)
		{
			arr[i] = input.nextInt();
		}
		
		BalancedArray.minValueToBalance( arr, size);
		input.close();
	}
	public static void  minValueToBalance(int arr[], int size)
	{
		int sum1=0;
		for(int j=0;j<size/2;j++)
		{
			sum1 += arr[j];
		}
		int sum2 = 0;
		
		for(int k=size/2;k<size;k++)
		{
			sum2+=arr[k]; 
		}
		System.out.println("Out put is : " + Math.abs(sum2-sum1));
	}

}
