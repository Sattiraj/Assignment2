public class checkSubsetArray
{
    public static void main(String[] args) 
    {
        // declaring two arrays
        int[] arr1 = {1, 2, 3,5,6,8,4,9};
        System.out.println("First array is : ");
        printArray(arr1);
        System.out.println();
        int[] arr2 = {1, 2, 5,9};
        System.out.println("Second array is : ");
        printArray(arr2);
        if(isSubset(arr1, arr2))
		{
            System.out.println("Subset of another array");
		}
        else
		{
            System.out.println("Not Subset");
		}
    }
    static boolean isSubset(int[] arr1, int[] arr2) 
    {
        if (arr1.length < arr2.length) 
            return false;
         
         int j=0;   
        for (int i = 0; i < arr2.length; i++) 
        {
            for (j = 0; j < arr1.length; j++)
			{
                if (arr2[i] == arr1[j])
                    break;
			}
            if (j == arr1.length)
                return false;
        }
        return true;
    }
    
    static void printArray(int[] arr) 
    { 
        for (int i=0; i<arr.length; i++) 
        { 
            System.out.print(arr[i] + " "); 
        } 
        System.out.println();
    }
}