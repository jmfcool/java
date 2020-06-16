import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Reverse Array:" + "\n");
                
		String[] x = {"alpha","bravo","charlie","delta","echo","foxtrot"};

		Array.reverse(x);

		System.out.print("\n");
	}
        public static void reverse(String[] items)
        {
		for(int i=items.length-1; i>=0; i--)
		{
			System.out.print("item = " + items[i] + "\n");
		}
        }
}
