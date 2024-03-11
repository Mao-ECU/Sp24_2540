package array_practice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void selction(int[] a)
	{
		for(int i = 0; i < a.length - 1; i++)
		{
			//find the smallest value from a[i] to a[n-1]
			int smallest = i;
			for(int j = i + 1; j < a.length; j++)
			{
				if(a[j] < a[smallest])
				{
					smallest = j;
				}
			}

			
			//swap
			int temp = a[i];
			a[i] = a[smallest];
			a[smallest] = temp;
		}
	}

}
