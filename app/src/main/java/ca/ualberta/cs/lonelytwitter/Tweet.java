package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * This class represents a tweet object for use in the main program.
 * In this class Tweet is made abstract and implements the Tweetable class.
 * Tweet is initialized with the private variables: date, message and moodList.
 * <ul>
 * <li>Tweet is constructed by instantiating a new Tweet with default values.</li>
 * <li>Adding to and getting the current values of the moodList can be called.</li>
 * <li>The date of the tweets creation can be gotten and set.</li>
 * <li>The message can also be accessed or set.</li>
 * </ul>
 *
 * @author Colin Kushniruk
 * @version 1.0.1
 * @since 1.0
 */
public abstract class Tweet implements Tweetable{
    private Date date;
    private String message;
    private ArrayList<CurrentMood> moodList;

    /**
     * Instantiates a new Tweet.
     *
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
        moodList = new ArrayList<CurrentMood>();
    }

    /**
     * Instantiates a new Tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
        moodList = new ArrayList<CurrentMood>();
    }

    /**
     * Gets mood list.
     *
     * @return the mood list
     */
    public ArrayList<CurrentMood> getMoodList() {
        return moodList;
    }

    /**
     * Sets mood list.
     *
     * @param moodList the mood list
     */
    public void setMoodList(ArrayList<CurrentMood> moodList) {
        this.moodList = moodList;
    }

    /**
     * Add mood.
     *
     * @param mood the mood
     */
    public void addMood(CurrentMood mood) {
        this.moodList.add(mood);
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Gets Tweet Message.
     *
     * @return the Tweet Message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the Tweet Message
     *
     * @param message Tweet Message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Is important boolean.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    /**
     * Overrides 'toString' function for Tweet objects to add the date
     * to each tweet message before output.
     * @return date concatenated with the message
     */
    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}