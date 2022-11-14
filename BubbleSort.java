
import java.util.*;
public class BubbleSort
{
	static void bubbleSort(int array[]) 
	{
	    int size = array.length;
	    for(int i=0;i<size;i++)
	    {
	    	for(int j=1;j<size-i;j++)
	    	{
	    		if(array[j] < array[j-1])
	    		{
	    			int temp = array[j];
	                array[j] = array[j-1];
	                array[j-1] = temp;
	    		}
	        }
	    }
	}
	public static void main(String args[]) 
	  { 
	    int[] data = {-2,14,5,0,11,-9,30,25};
	    System.out.println("Before BubbleSort:");
	    System.out.println(Arrays.toString(data));
	   
	    BubbleSort.bubbleSort(data);
	    System.out.println("Sorted Array in Ascending Order:");
	    System.out.println(Arrays.toString(data));
	  }
}
