package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This is a child of currentmood that is an pensive mood
 * It has a private string representing it's mood set to "Pensive"
 * It inherits from CurrentMood and will use getMoodString() to return "Pensive"
 *
 * @author Colin Kushniruk
 * @version 1.0.1
 * @since 1.0
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

    /**
     * the inherited abstract getMoodString is used to
     * return the "Pensive" mood string here.
     * @return
     */
    public String getMoodString(){
        return moodString;
    }


}
