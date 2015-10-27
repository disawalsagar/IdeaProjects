package Foo;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.Scanner;

/**
 * Created by disawalsagar on 10/26/15.
 */
public class TweetApp {


    public static ConfigurationBuilder getConfigurationBuilder() {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey("IJscYxE8UznhCaJg0VB9ltDfq")
                .setOAuthConsumerSecret("pypUzW0S7xeimuHg6o1Ek6g671rY8zSB1voMypqn9QbToEawC1")
                .setOAuthAccessToken("4028970080-HMYs8NrOd4KKeaN41srYeIzBcqCKUFddg6b0B3x")
                .setOAuthAccessTokenSecret("FhwVjLdVumVCQJYpHFrLjSoZFfj44lIGglN8twvxOjrxq");
        return configurationBuilder;
    }

    public static TwitterFactory tf;
    public static Twitter tr;

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int option=0;
        do {
            System.out.println("========== TWITTER APPLICATION =============");
            System.out.println("1. Search for tweets");
            System.out.println("2. Update status");
            System.out.println("Enter 1 or 2");
            option=sc.nextInt();
        }while(option!=1 && option!=2);

        tf = new TwitterFactory(getConfigurationBuilder().build());
        tr = tf.getInstance();

        if(option==1)
        {
            System.out.println("Enter search key:");
            SearchTweets.getTweets(sc.next());
        }
        else if(option==2)
        {
            System.out.println("Enter status update:");
            String tweet =  sc.nextLine();
            CreateTweet.postTweet(tweet);
        }
        else
        {
            System.out.println("successful");
        }

    }











}
