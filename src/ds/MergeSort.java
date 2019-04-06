package ds;

public class MergeSort {


	public static int[] mergeSort(int[] arr, int left, int right)
	{
		if(left<right)
		{
			int m = left + ((right+left) / 2);
			mergeSort(arr, left, m);
			mergeSort(arr, m+1, right);
			merge(arr, left, m, m+1, right);
		}
		return arr;
	}
	
	public static void merge(int[] arr, int start1, int end1, int start2, int end2)
	{
		while(start1<=end1 && start2<=end2)
		{
			if(arr[start1] < arr[start2])
				start1++;
			else
			{
				int value = arr[start1];
				
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {10,5,3,8,6,1,2,9,4,7};
		System.out.println("Before sorting");
		for(int i : arr)
			System.out.print(i+",");
		System.out.println("\nAfter sorting");
		arr = mergeSort(arr,0,9);
		for(int i : arr)
			System.out.print(i+",");
	}


}
