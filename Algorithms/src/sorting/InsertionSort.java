package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 78, 45, 32, 90, 15, 16, 81, 72, 56};
		//insertionRecursive(arr, 1);
		selection(arr);
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("Target is " + binarySearch(arr, 32));
	}
	
	public static int binarySearch(int [] arr, int target)
	{
		int first = 0;
		int last = arr.length - 1;
		int mid = 0;
		
		while(first <= last)
		{
			mid = (first + last) / 2;
			
			if(arr[mid] == target)
			{
				return mid;
			}
			else if(arr[mid] < target)
			{
				first = mid + 1;
				continue;
			}
			else
			{
				last = mid - 1;
				continue;
			}
		}
		
		return -1;
	}
	public static void insertion(int[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int desti = i;
			int temp = arr[i];
			for(int j = i - 1; j >= 0; j--)
			{
				if(arr[j] > temp)
				{
					desti = j;
					arr[j+1] = arr[j];
				}
			}
			arr[desti] = temp;
		}
	}
	/*find the target value from a given array,
	 *return the index value
	 *if not found, return -1
	 */
	public static int search(int arr[], int target)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static void selection(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			int index = i;
			int smallest = arr[i];
			for(int j = i; j < arr.length; j++)
			{
				if(arr[j] < smallest)
				{
					index = j;
					smallest = arr[j];
				}
			}
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
	}
	
	public static void insertionRecursive(int[] arr, int index)
	{
		if(index >= arr.length)
			return;
		
		int desti = index;
		int temp = arr[index];
		
		for(int i = index - 1; i >= 0; i--)
		{
			if(arr[i] > temp)
			{
				desti = i;
				arr[i+1] = arr[i];
			}
		}
		arr[desti] = temp;
		
		insertionRecursive(arr, index+1);
	}
	
	//insert arr[index] into the elemnets between [0, index-1]
	public static void insertion2(int[] arr, int index)
	{
		if(index > arr.length -1)
			return;
		
		int temp = arr[index];
		int target = index;
		
		for(int i = index - 1; i >= 0; i--)
		{
			if(arr[i] > temp)
			{
				arr[i+1] = arr[i];
				target = i;
			}
		}
		arr[target] = temp;
		
		insertion2(arr, index + 1);
	}
	
	public static void quickSort(int[] arr, int start, int end)
	{
		int j;
		
		if(start >= end)
			return;
		
		j = split(arr, start, end);
		System.out.println("This round j is " + j);
		if(j < 0)
			return;
		
		quickSort(arr, start, j-1);
		quickSort(arr, j+1, end);
	}
	
	public static int split(int[] arr, int low, int high)
	{
		if(low >= high)
		{
			return -1;
		}
		
		int p = arr[low];
		int target = low;
		int i = low + 1;
		int j = high;
		
		while(i < j)
		{
			while(arr[i] < p && i <= high)
			{
				i++;
			}
			
			while(arr[j] >= p && j > low)
			{
				j--;
			}
		
			
			if(i <= high && j >= low && i < j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			else
			{
				target = j;
				break;
			}
		}
		int temp = arr[target];
		arr[target] = p;
		arr[low] = temp;
		
		return target;
	}

}
