package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Vuk on 1/19/2017.
 */

public abstract class CurrentMood {

    private Date date;
    private String text;

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

    public String getText() {
        return text;
    }

}
