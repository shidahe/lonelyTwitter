package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by cdkushni on 2/16/17.
 */

public class TweetList {
    private ArrayList<NormalTweet> tweets = new ArrayList<NormalTweet>();

    public void add(NormalTweet tweet) {
        tweets.add(tweet);
    }

    public boolean hasTweet(NormalTweet tweet) {
        return tweets.contains(tweet);
    }

    public NormalTweet getTweet(int index) {
        //return new NormalTweet("not the tweet");
        return tweets.get(index);
    }

    public void delete(NormalTweet tweet) {
        tweets.remove(tweet);
    }
    public TweetList getTweets() {
        TweetList returnList = new TweetList();
        ArrayList<NormalTweet> tweetsTemp = tweets;
        Collections.sort(tweetsTemp, new Comparator<NormalTweet>() {
            public int compare(NormalTweet t1, NormalTweet t2) {
                return t1.getDate().compareTo(t2.getDate());
            }
        });

        for (int i = 0; i < tweetsTemp.size(); i++) {
            returnList.add(tweetsTemp.get(i));
        }
        return returnList;
    }

    public int getCount() {
        return tweets.size();
    }
}
