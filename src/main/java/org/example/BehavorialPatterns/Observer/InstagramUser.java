package org.example.BehavorialPatterns.Observer;

public class InstagramUser implements Follower {
    private String name;

    private Influencer influencer;

    InstagramUser(Influencer influencer) {
        this.influencer = influencer;
        influencer.register(this);
    }

    @Override
    public void update(Object instagramPost) {
        System.out.println("User" + name + "saw this post" + instagramPost);
    }
}
