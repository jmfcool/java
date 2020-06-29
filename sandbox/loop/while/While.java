public class While
{
	public static void main(String[] args)
	{
		System.out.print("\n" + "While Loop:" + "\n");
		While.loop();
		
		System.out.print("\n" + "Do While Loop:" + "\n");
		While.spin();

		System.out.print("\n");
	}
	public static void loop()
	{
		int count = 1;
		while(count < 10)
		{
			System.out.print("number = " + count + "\n");
			count++;
		}
	}
	public static void spin()
	{
		int count = 11;
		do
		{
			System.out.print("number = " + count + "\n");
			count++;
		} while(count < 20);
	}
}
