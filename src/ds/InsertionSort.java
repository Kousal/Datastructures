package ds;

public class InsertionSort {
	public static int[] insertionSort(int[] arr)
	{
		for(int i = 1 ; i < arr.length; i++)
		{
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key)
			{
					arr[j+1] = arr[j];
					j = j-1;
			}
			arr[j+1] = key;
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
		arr = insertionSort(arr);
		for(int i : arr)
			System.out.print(i+",");
	}
}
