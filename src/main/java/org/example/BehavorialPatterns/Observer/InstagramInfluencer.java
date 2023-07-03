package org.example.BehavorialPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class InstagramInfluencer implements Influencer {

    private ArrayList<Follower> followers;

    public void postText() {
        // Code to post text in instagram
        notifyFollowers();
    }
    public void postPhoto() {
        // Code to post photo in instagram
        notifyFollowers();
    }
    public void postVideo() {
        // Code to post video in instagram
        notifyFollowers();
    }

    @Override
    public void register(Follower follower) {
        followers.add(follower);
    }

    @Override
    public void unregister(Follower follower) {
        followers.remove(follower);
    }

    @Override
    public void notifyFollowers() {
        for(Follower follower : followers) {
            follower.update(new Object()); //Send post to feed of followers
        }
    }
}
