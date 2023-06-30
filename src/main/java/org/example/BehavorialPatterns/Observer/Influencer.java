package org.example.BehavorialPatterns.Observer;

public interface Influencer {
    void register(Follower follower);
    void unregister(Follower follower);

    void notifyFollowers();
}
