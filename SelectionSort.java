import java.util.Arrays;
public class SelectionSort
{
	void selectionSort(int array[])
	{
	    int n= array.length;
	    for (int i=0;i<n-1;i++) {
	      int min = i;

	      for (int j =i+1; j < n; j++) {

	        if (array[j] < array[min]) {
	          min = j;
	        }
	      }
	      int temp = array[i];
	      array[i] = array[min];
	      array[min] = temp;
	    }
	}
	public static void main(String args[]) 
	{
	    int[] data = { 20,22,12,25,10,30,15,5,82,1,8};
	    SelectionSort ss = new SelectionSort();
		System.out.println();
	    System.out.println("Before SelectionSort : ");
	    System.out.println(Arrays.toString(data));
	    ss.selectionSort(data);
		System.out.println();
	    System.out.println("After SelectionSort : ");
	    System.out.println(Arrays.toString(data));
    }
}