package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cdkushni on 1/19/17.
 */
public class PensiveMood extends CurrentMood{
    private String moodString = "Pensive";

    /**
     * Instantiates a new Pensive mood.
     */
    public PensiveMood(){
        super();
    }

    /**
     * Instantiates a new Pensive mood.
     *
     * @param date the date
     */
    public PensiveMood(Date date){
        super(date);
    }
    public String getMoodString(){
        return moodString;
    }


}
