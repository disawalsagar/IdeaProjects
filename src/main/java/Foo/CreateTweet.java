package Foo;

import twitter4j.*;
import twitter4j.TwitterFactory;

/**
 * Created by disawalsagar on 10/26/15.
 */
public class CreateTweet {

    public static void postTweet(String tweet) {


        try {
            Status status = TweetApp.tr.updateStatus(tweet);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }



}
