public class Prime
{
	public static void main(String [] args)
	{
		int num=98;
		int j=0;
		for(int i=2;i<num;i++)
		{
			if(num/i==0)
			{
				j++;
			}
			i++;
		}
		if(j>0)
		{
			System.out.println("Number is not Prime!");
		}
		else
		{
			System.out.println("Prime Number!");
		}
	}	
}