package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){}

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) throws IllegalArgumentException {
        if(this.hasTweet(tweet)) {
            throw new IllegalArgumentException();}
        else {
            tweets.add(tweet);
        }
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public int getCount(){
        return tweets.size();
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}
