import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "Join Array:" + "\n");

                String[] x = {"alpha","bravo","charlie","delta","echo","foxtrot"};
                String y = "#";

		Array.join(x,y);

		System.out.print("\n");
	}
	public static void join(String[] items,String delimiter)
	{
		StringBuffer buffer = new StringBuffer();

                for(String item : items)
                {
        		buffer.append(item);
        		buffer.append(delimiter);
                }

		System.out.print(buffer.toString() + "\n");
	}
}
