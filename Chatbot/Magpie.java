public class Magpie
{
   public String getGreeting()  {return "Hello, let's talk.";}
   public String getResponse(String statement)
   {
     String response = "";
     if (findKeyword(statement, "mother") >= 0
                 || findKeyword(statement, "father") >= 0
                 || findKeyword(statement, "sister") >= 0
                 || findKeyword(statement, "brother") >= 0) {
       response = "Tell me more about your family.";
     }else if (findKeyword(statement, "dog") >= 0
                 || findKeyword(statement, "cat") >= 0
                 || findKeyword(statement, "bird") >= 0
                 || findKeyword(statement, "fish") >= 0) {
       response = "Tell me more about your pets.";
     }else if (findKeyword(statement, "Mr.") >= 0
                 || findKeyword(statement, "Mrs.") >= 0
                 || findKeyword(statement, "Ms.") >= 0
                 || findKeyword(statement, "Dr.") >= 0) {
       response = "Tell me more about that person.";
     } else if (findKeyword(statement, " no ") >= 0) {
       response = "Why so negative?";
     } else {
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
     final int NUMBER_OF_RESPONSES = 6;
     double r = Math.random();
     int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
     String response = "";

     if (whichResponse == 0) {
       response = "Interesting, tell me more.";
     } else if (whichResponse == 1) {
       response = "Hmmm.";
     } else if (whichResponse == 2) {
       response = "Do you really think so?";
     } else if (whichResponse == 3) {
       response = "You don't say.";
     }else if (whichResponse == 4) {
       response = "I see.";
     }else if (whichResponse == 5) {
       response = "Fascinating.";
     }
     return response;
       }
  }
