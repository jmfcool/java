import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "Concatenate two Array's:" + "\n");

                String[] x = {"alpha","bravo","charlie","delta","echo","foxtrot"};
                String[] y = {"golf","hotel"};

		Array.concat(x,y);
		
		System.out.print("\n");
	}
	public static void concat(String[] a,String[] b)
	{
		List<String> array = new ArrayList<String>(Arrays.asList(a));
		array.addAll(Arrays.asList(b));
		
		Object[] c = array.toArray();
		System.out.print(Arrays.toString(c) + "\n");
	}
}
