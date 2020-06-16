import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Remove first item from Array:" + "\n");
                
		String[] x = {"alpha","bravo","charlie","delta","echo","foxtrot"};

		Array.shift(x);

		System.out.print("\n");
	}
        public static void shift(String[] items)
        {
		String[] list = Arrays.copyOfRange(items, 1, items.length);

		for(String item : list)
                {
                        System.out.print("item = " + item + "\n");
                }
	}
}
