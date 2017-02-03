package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by cdkushni on 1/19/17.
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

    public String getMessage() {
        return message;
    }

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

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}