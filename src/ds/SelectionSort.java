package ds;

public class SelectionSort {

	public static int[] selectionSort(int[] arr)
	{
		for(int i = 0 ; i < arr.length-1; i ++)
		{
			int currMin = i ;
			for(int j = i+1; j < arr.length; j ++)
			{
				if(arr[currMin] > arr[j])
					currMin = j;
			}
			
			//Swap logic
			int temp = arr[currMin];
			arr[currMin]=arr[i];
			arr[i]=temp;
			
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
		arr = selectionSort(arr);
		for(int i : arr)
			System.out.print(i+",");
	}

}
