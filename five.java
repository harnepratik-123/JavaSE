/** Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  **/

public class five
{
	public static void main(String[] args)
	{
		int m=62;
		if(m>70)
		{
			System.out.println("Distinction");
		}
		else if(m>60 && m<70)
		{
			System.out.println("first class");
		}
		else if(m>35 && m<60)
		{
			System.out.println("second class");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
