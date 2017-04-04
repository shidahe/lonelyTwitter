package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by cdkushni on 2/16/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }


    public void testAddTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        if (tweets.hasTweet(tweet)) {
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        //assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweets() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        NormalTweet tweet2 = new NormalTweet("some tweet next");

        tweets.add(tweet);
        tweets.add(tweet2);
        TweetList returnedTweets = tweets.getTweets();
        assertEquals(returnedTweets.getTweet(0), tweets.getTweet(0));
        assertEquals(returnedTweets.getTweet(0).getDate(), tweets.getTweet(0).getDate());
        assertEquals(returnedTweets.getTweet(1).getDate(), tweets.getTweet(1).getDate());
    }

    public void testGetCount() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        NormalTweet tweet2 = new NormalTweet("some tweet next");

        tweets.add(tweet);
        tweets.add(tweet2);
        int returnedCount = tweets.getCount();
        assertEquals(returnedCount, 2);
    }

    public void testGetTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.add(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }


}
