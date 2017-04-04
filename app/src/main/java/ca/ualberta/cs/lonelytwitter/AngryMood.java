package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This is a child of currentmood that is an angry mood
 * It has a private string representing it's mood set to "Angry"
 * It inherits from CurrentMood and will use getMoodString() to return "Angry"
 *
 * @author Colin Kushniruk
 * @version 1.0.1
 * @since 1.0
 */
public class AngryMood extends CurrentMood{
    private String moodString = "Angry";

    /**
     * Instantiates a new Angry mood.
     */
    public AngryMood(){
        super();
    }

    /**
     * Instantiates a new Angry mood.
     *
     * @param date the date
     */
    public AngryMood(Date date){
        super(date);
    }

    /**
     * the inherited abstract getMoodString is used to
     * return the "Angry" mood string here.
     * @return moodString
     */
    public String getMoodString(){
        return moodString;
    }

}
