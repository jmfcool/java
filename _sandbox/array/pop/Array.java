import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Pop last item off of Array:" + "\n");

		String[] x = {"alpha","bravo","charlie","delta","echo","foxtrot"};

                Array.pop(x);

		System.out.print("\n");
	}
        public static void pop(String[] items)
        {
		String[] list = Arrays.copyOf(items,items.length-1);	

		for(String item : list)
                {
                        System.out.print("item = " + item + "\n");
                }
	}
}
