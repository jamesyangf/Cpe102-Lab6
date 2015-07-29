import java.lang.Object;

public class SUnit{

	private static int runs = 0;
	private static int fails = 0;


	public static void assertEquals(double expect, double actual, double epsilon)
	{
		runs++;
		if(Math.abs(expect - actual) > epsilon)
		{
			Throwable throwable = new Throwable("Error: Expected "+expect+" +/-"+epsilon+", found "+actual);
			throwable.printStackTrace();
			fails++;
		}
	}

	public static void assertEquals(long expect, long actual)
	{
		runs++;
		if(expect != actual){
			Throwable throwable = new Throwable("Error: Expected "+ expect+", found "+actual);
			throwable.printStackTrace();
			fails++;
		}

	}

	public static void assertEqualsObject(Object expect, Object actual)
	{
		runs++;
		if(!expect.equals(actual))
		{
			Throwable throwable = new Throwable("Error: Expected object equality, found inequality");
			throwable.printStackTrace();
			fails++;
		}

	}

	public static void assertEqualsReference(Object expect, Object actual)
	{
		runs++;
		if(expect != actual)
		{
			Throwable throwable = new Throwable("Error: Expected reference equality, found inequality");
			throwable.printStackTrace();
			fails++;
		}
	}

	public static void assertFalse(boolean actual)
	{
		runs++;
		if(actual != false)
		{
			Throwable throwable = new Throwable("Error: Expected false, found true");
			throwable.printStackTrace();
			fails++;
		}
	}

	public static void assertNotNull(Object actual)
	{
		runs++;
		if(actual == null)
		{
			Throwable throwable = new Throwable("Error: Expected non-null, found null");
			throwable.printStackTrace();
			fails++;
		}
	}
	public static void assertNull(Object actual)
	{
		runs++;
		if(actual != null)
		{
			Throwable throwable = new Throwable("Error: Expected null, found non-null");
			throwable.printStackTrace();
			fails++;
		}
	}

	public static void assertTrue(boolean actual)
	{
		runs++;
		if(actual != true)
		{
			Throwable throwable = new Throwable("Error: Expected true, found false");
			throwable.printStackTrace();
			fails++;
		}
	}

	public static void fail()
	{
		runs++;
		Throwable throwable = new Throwable("Error: Explicit failure");
		throwable.printStackTrace();
		fails++;
	}
	
	public static int testsFailed()
	{
		return fails;
	}

	public static int testsRun()
	{
		return runs;
	}

}