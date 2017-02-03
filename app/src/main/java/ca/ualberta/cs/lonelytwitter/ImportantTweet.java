package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Important tweet is just an extension of tweet that
 * will return true if isImportant is called.
 *
 * @author Colin Kushniruk
 * @version 1.0.1
 * @since 1.0
 */
public class ImportantTweet extends Tweet {
    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Important tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * This is a override of isImportant in order to return true
     * @return true importance
     */
    @Override
    public Boolean isImportant(){
        return true;
    }
}