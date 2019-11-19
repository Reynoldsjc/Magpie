/**
 * A program to carry on conversations with a human user. This is the initial
 * version that:
 * <ul>
 * <li>
 * Uses indexOf to find strings</li>
 * <li>
 * Handles responding to simple words and phrases</li>
 * </ul>
 * This version uses a nested if to handle default responses.
 * 
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		response = statement.trim();
		if(response.length() < 1) {
			response = "Please don't leave me on read.";
		} else if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) {
			response = "Tell me more about your family.";
		} else if (statement.indexOf(" Cat ") >= 0
				|| statement.indexOf(" cat ") >= 0
				|| statement.indexOf(" dog ") >= 0
				|| statement.indexOf(" Dog ") >= 0) {
			response = "Tell me more about your pets.";
		} else if (statement.indexOf("Mr. Padjen") >=0) {
			response = "Dang, sounds like a sweet teacher. I wish I could have him.";
		} else if (statement.indexOf("sandwhich") >= 0
				|| statement.indexOf("turkey") >=0) {
			response = "Yummy! That sounds tasty";
		} else if (statement.indexOf("poop") >= 0
				|| statement.indexOf("pee") >=0) {
			response = "Can you talk about that somewhere else?";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "Congratulations";
		} else if (whichResponse == 5) {
			response = "WOW! That's so cool";
		}


		return response;
	}
}
