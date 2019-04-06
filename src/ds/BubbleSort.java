package ds;

public class BubbleSort {


	public static int[] bubbleSort(int[] arr)
	{
		for(int i = 0 ; i < arr.length; i ++)
		{
			
			for(int j = i+1; j < arr.length; j ++)
			{
				if(arr[i] > arr[j])
					
				{
					//Swap logic
					int temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
			
			
		}
		return arr;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {10,5,3,8,6,1,2,9,4,7};
		System.out.println("Before sorting");
		for(int i : arr)
			System.out.print(i+",");
		System.out.println("\nAfter sorting");
		arr = bubbleSort(arr);
		for(int i : arr)
			System.out.print(i+",");
	}


}
