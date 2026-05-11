
public class Demo {
	public static void main(String args[])
	{
		String s[] = {"abcd","efgh","ijkl"};
		//String s1 = null;
		try
		{
			System.out.println(s[1]);
			//System.out.println(s1.length());
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		catch (NumberFormatException e)
		{
			System.out.println(e);
		}
		catch (Exception e)
		{
			System.out.println("Exception");
		}
		finally 
		{
			System.out.println("ITER");
		}
	}
}
