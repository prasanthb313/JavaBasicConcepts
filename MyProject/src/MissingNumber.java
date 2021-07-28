
public class MissingNumber {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,7,8,9,10};
		int [] missingNum = null;
		for(int i=1;i<=10;i++)
		{
			
			for(int j=0;j<array.length;j++)
			{
				int num=array[i];
				if(i!=num)
					missingNum[i]=j;
			}
		}
	}
	
}

