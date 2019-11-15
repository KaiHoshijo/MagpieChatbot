/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
            response = "I have a pet too! His name is Murphy! He is a little rascal!";
        } else if (statement.indexOf("cooper") >= 0) {
            response = "She sounds like a good teacher.";
        } else if (statement.indexOf("hate") >= 0) {
            response = "hate is such a strong word";
        } else if (statement.indexOf("how is your day") >= 0 || statement.indexOf("how\'s your day") >= 0) {
            response = "It is going as well as it can for a nonliving being.";
        } else if (statement.indexOf("what is the meaning of life") >= 0
                || statement.indexOf("what\' the meaning of life") >= 0) {
            if ((int) Math.random() * 2 == 1) {
                response = "42";
            } else {
                response = "The meaning of life is what you make it. You should try to do what you want in life that" +
                        " makes you happy. I believe that\'s meaning of life, but hey, what do I know? I just live " +
                        "forever";
            }
        }
        else if (statement.trim().length() == 0) {
            response = "Type something please.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
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
        } else if (whichResponse == 4) {
            response = "That is awesome!";
        } else if (whichResponse == 5) {
            response = "Fun fact: The world is round";
        }

        return response;
    }
}
