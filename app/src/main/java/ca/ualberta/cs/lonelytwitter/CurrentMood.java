package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Current Mood is a default mood class to represent a mood
 * that can be used for a tweet message.
 * It has a date associated along with getters and setters for such.
 * It also has a abstract getMoodString to use for it's children.
 *
 * @author Colin Kushniruk
 * @version 1.0.1
 * @since 1.0
 */
public abstract class CurrentMood {
    private Date date;

    /**
     * Instantiates a new Current mood.
     */
    public CurrentMood(){
        this.date = new Date();
    }

    /**
     * Instantiates a new Current mood.
     *
     * @param date the date
     */
    public CurrentMood(Date date){
        this.date = date;
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
     * Gets mood string.
     *
     * @return the mood string
     */
    public abstract String getMoodString();

}
