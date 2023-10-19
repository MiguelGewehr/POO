package simulado_q1;

import java.util.LinkedList;
import java.util.List;

public class User {
    
    private String nome;
    private String tweetrId;
    private List<Tweet> tweets = new LinkedList<>();

    public User(String nome, String tweetrId){

        this.nome = nome;
        this.tweetrId = tweetrId;
    }

    public void addTweet(Tweet t){
        this.tweets.add(t);
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTweetrId() {
        return tweetrId;
    }
    
    public List<Tweet> getTweets() {
        return new LinkedList<>(tweets);
    }
}
