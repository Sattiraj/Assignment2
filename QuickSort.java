
import java.util.Scanner;
public class QuickSort {
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;	
	}
	static int partition(int[] arr, int low,int high) {
		int i=low-1;
		int pivote=arr[high];
		for(int j=low;j<arr.length;j++) {
			if(arr[j]<pivote) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
		}
	private static void quickSort(int arr[],int low,int high) {
		int n=arr.length;
		if(low<high) {
			int p=partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println(" Enter the values");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(" This is the given array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		int low=0;
		int high=n-1;
		quickSort(arr,low,high);
		System.out.println("This is the sorted array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}	
	}
}
