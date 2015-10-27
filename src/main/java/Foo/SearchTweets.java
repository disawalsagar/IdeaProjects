package Foo;


import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.*;


/**
 * Created by disawalsagar on 10/26/15.
 */
public class SearchTweets {

    public static void getTweets(String key) {
        if (key.length() < 1) {
            System.out.println("No argument is passed");
            System.exit(-1);
        }


         try {
            Query query = new Query(key);
            QueryResult result;
            do {
                result = TweetApp.tr.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                }
            } while ((query = result.nextQuery()) != null);
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
    }

}
