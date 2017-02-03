package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cdkushni on 1/19/17.
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
