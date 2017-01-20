package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cdkushni on 1/19/17.
 */

public abstract class CurrentMood {
    private Date date;

    public CurrentMood(){
        this.date = new Date();
    }

    public CurrentMood(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String getMoodString();

}
