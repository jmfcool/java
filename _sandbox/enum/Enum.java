public class Enum
{
	public enum alpha 
	{
		January, February, March, April, May, June, July, August, September, October, November, December
	}

	alpha bravo;

	public Enum(alpha bravo)
	{
		this.bravo = bravo;
	}

	public void charlie()
	{
		switch(bravo)
		{
			case January: System.out.print("\n" + "January is cold..." + "\n"); break;
			case February: System.out.print("February is cold... " + "\n"); break;
			case March: System.out.print("March is warm..." + "\n"); break;
			case April: System.out.print("April is warm..." + "\n"); break;
			case May: System.out.print("May is warm..." + "\n"); break;
			case June: System.out.print("June is hot..." + "\n"); break;
			case July: System.out.print("July is hot..." + "\n"); break;
			case August: System.out.print("August is hot..." + "\n"); break;
			case September: System.out.print("September is warm..." + "\n"); break;
			case October: System.out.print("October is cold..." + "\n"); break;
			case November: System.out.print("November is cold..." + "\n"); break;
			case December: System.out.print("December is cold..." + "\n\n"); break;
		}
	}

	public static void main(String[] args) 
	{
		Enum january = new Enum(alpha.January);
		january.charlie();
		        
		Enum february = new Enum(alpha.February);
		february.charlie();
		        
		Enum march = new Enum(alpha.March);
		march.charlie();
		        
		Enum april = new Enum(alpha.April);
		april.charlie();
		        
		Enum may = new Enum(alpha.May);
		may.charlie();
		        
		Enum june = new Enum(alpha.June);
		june.charlie();
		        
		Enum july = new Enum(alpha.July);
		july.charlie();
		        
		Enum august = new Enum(alpha.August);
		august.charlie();
		        
		Enum september = new Enum(alpha.September);
		september.charlie();
		        
		Enum october = new Enum(alpha.October);
		october.charlie();
		        
		Enum november = new Enum(alpha.November);
		november.charlie();
		        
		Enum december = new Enum(alpha.December);
		december.charlie();
   	}
}
