package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Normal tweets are an extension of tweets that are pretty normal
 * They have the same inherited functions from tweet
 * They do have an override of isImportant to return false though.
 *
 * @author Colin Kushniruk
 * @version 1.0.1
 * @since 1.0
 */


public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * Overrides isImportant function for Normal tweets to return false.
     *
     * @return false importance
     */
    @Override
    public Boolean isImportant(){
        return false;
    }
}