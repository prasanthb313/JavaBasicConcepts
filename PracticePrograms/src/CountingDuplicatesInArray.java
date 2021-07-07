
public class CountingDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,3,3};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			
			int num1=arr[i];
			for(int j=1+i;j<arr.length;j++)
			{
				int num2=arr[j];
				
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			
		}
		System.out.println(count);
	}
}
