/** Display numbers from 3 to 30 except number 24  using while loop. **/

public class four
{
	public static void main(String[] args)
	{
		int a=3;
		while(a<31)
		{	
			if(a == 24)
			{
				a++;
			}
			else
			{
				System.out.println(a);
				a++;
			}
		}
	}
}
