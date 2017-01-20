package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by cdkushni on 1/19/17.
 */

public class AngryMood extends CurrentMood{
    private String moodString = "Angry";
    public AngryMood(){
        super();
    }
    public AngryMood(Date date){
        super(date);
    }
    public String getMoodString(){
        return moodString;
    }

}
