
public class Duplicates {
	void duplicates(int index ,int num,int[] ar)
	{
		int count=1;
		for(int i=index;i<ar.length;i++)
		{
			if(num==ar[i]&&num!=0)
			{
				ar[i]=0;
				System.out.println(num +" is used "+count+" times at index "+i);
				count++;
			}
		}
	}
	public static void main(String[] args) {
		Duplicates d=new Duplicates();
		int[] arr= {1,2,3,4,5,3,1,4,2,1};
		for(int i=0;i<arr.length;i++)
		{
			int a=arr[i];
			d.duplicates(i,a,arr);	
		}
	}
}