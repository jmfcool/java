import java.util.*;

public class Array
{
	public static void main(String[] args)
	{
                System.out.print("\n" + "Add item to beginning of Array:" + "\n");

                String[] x = {"alpha","bravo","charlie","delta","echo","foxtrot"};
                String y = "Xray";

                Array.unshift(x,y);

		System.out.print("\n");
	}
        public static void unshift(String[] items,String element)
        {
		List<String> temp = new ArrayList<String>(Arrays.asList(items));
		temp.add(0,element);
		items = temp.toArray(new String[temp.size()]);

		for(String item : items)
                {
                        System.out.print("item = " + item + "\n");
                }
	}
}
