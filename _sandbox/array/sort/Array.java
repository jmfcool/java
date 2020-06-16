import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Sort Array:" + "\n");
 
		String[] x = {"bravo","delta","alpha","echo","foxtrot","charlie"};

		Arrays.sort(x);

		System.out.print("\n");
	}
        public static void sort(String[] items)
        {
		Arrays.sort(items);	
		for(String item : items)
                {
                        System.out.print("item = " + item + "\n");
                }
	}
}
