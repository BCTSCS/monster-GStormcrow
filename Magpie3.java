public class Magpie3
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "Mr. Armstrong") >= 0)
		{
			response = "Your teacher is a great teacher.";
		}
		else if (findKeyword(statement, "school") >= 0)
		{
			response = "What do you like best about school?";
		}
		else if (findKeyword(statement, "weekend") >= 0)
		{
			response = "What do you like to do on the weekend?";
		}
		else if (findKeyword(statement, "computer science") >= 0)
		{
			response = "Everyone should learn computer science!";
		}

		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "hamster") >= 0
				|| findKeyword(statement, "frog") >= 0)
		{
			response = "Tell me more about your pets.";
		}

		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim();
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn).toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(),
						                   psn + goal.length() + 1).toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if ((before.compareTo("a") < 0 || before.compareTo("z") > 0) && // before is not a letter
				 (after.compareTo("a") < 0 || after.compareTo("z") > 0))     // after is not a letter
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
		}
		return -1;
	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "How does that make you feel?";
		}
		else if (whichResponse == 5)
		{
			response = "Tell me more.";
		}
		else if (whichResponse == 6)
		{
			response = "Think positive thoughts.";
		}
		return response;
	}

	public static void main(String[] args) {
		Magpie3 magpie = new Magpie3();
		System.out.println(magpie.findKeyword("She's my sister.", "sister", 0));
		System.out.println(magpie.findKeyword("Brother Tom is helpful.", "brother", 0));
		System.out.println(magpie.findKeyword("I can't catch wild cats.", "cat", 0));
		System.out.println(magpie.findKeyword("I know nothing about snow plows.", "no", 0));
		System.out.println(magpie.findKeyword("yesterday is today's day before.", "day", 0));
	}
}