public class Foreach
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "Foreach Loop using String:" + "\n");
		String[] x = {"alpha","bravo","charlie","delta","echo","foxtrot"};
		Foreach.string(x);
		
		System.out.print("\n" + "Foreach Loop using Int:" + "\n");
		int[] y = {5,10,15,20,25,30};
		Foreach.integer(y);
	
		System.out.print("\n");
	}
	public static void string(String[] items)
	{
		for(String item : items)
		{
			System.out.print("item = " + item + "\n");
		}
	}
	public static void integer(int[] numbers)
	{
		for(int number : numbers)
		{
		        System.out.print("number = " + number + "\n");
		}
	}
}
