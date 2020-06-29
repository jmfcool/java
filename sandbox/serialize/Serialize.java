import java.io.*;

public class Serialize
{
	public static void main(String[] args)
	{
		String x = "www.jeremiahfaria.com";

                System.out.print("\n" + "Serialize a String:" + "\n");
                Serialize.serialize(x);
   	
                System.out.print("\n" + "Deserialize a String:" + "\n");
                Serialize.deserialize(x);

		System.out.print("\n");
	}
	public static void serialize(String data)
	{
		try
		{
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(data);
			oos.flush();
			System.out.print(baos.toString() + "\n");
		}
		catch (Exception e)
		{
			System.out.print(e + "\n");
		}
	}
	public static void deserialize(String data) {}
}
