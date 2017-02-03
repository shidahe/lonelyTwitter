package ca.ualberta.cs.lonelytwitter;

/**
 * This is a tweetable interface setting the base for tweets.
 *
 * @author Colin Kushniruk
 * @version 1.0.1
 * @since 1.0
 */
public interface Tweetable {
    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage();

    /**
     * Sets message.
     *
     * @param string the string
     * @throws TweetTooLongException the tweet too long exception
     */
    public void setMessage(String string) throws TweetTooLongException;
}