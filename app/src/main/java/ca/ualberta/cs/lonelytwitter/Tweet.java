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

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
        moodList = new ArrayList<CurrentMood>();
    }

    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
        moodList = new ArrayList<CurrentMood>();
    }

    public ArrayList<CurrentMood> getMoodList() {
        return moodList;
    }

    public void setMoodList(ArrayList<CurrentMood> moodList) {
        this.moodList = moodList;
    }
    public void addMood(CurrentMood mood) {
        this.moodList.add(mood);
    }

    public Date getDate() {
        return date;
    }

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

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

}