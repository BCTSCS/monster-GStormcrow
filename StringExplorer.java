public class StringExplorer
{
	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";

		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);

		int pos = sample.indexOf("slow");
		if (pos != -1)
			System.out.println("slow is found at position " + pos);
		else
			System.out.println("slow is not found.");

		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);

		//  Try other methods here:
		String statement = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		int index = statement.indexOf("the", 0);
		int notFoundPsn = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
		while(index != -1)
		{
			System.out.println("the is found at position: " + index);
			index = statement.indexOf("the", index + 1);
		}
		String anotherStatement = "I do not know what I am doing.";
		int indexI = anotherStatement.indexOf("I", 0);
		System.out.println("anotherStatement.indexOf(\"I\") = " + indexI);
	}
}