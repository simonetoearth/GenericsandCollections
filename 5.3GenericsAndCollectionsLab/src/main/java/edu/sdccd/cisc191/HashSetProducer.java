package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetProducer {
    private HashSet<String> set;

    public HashSetProducer(HashSet<String> set) {
        this.set = set;
    }

    public boolean produce(String value) {
        return set.add(value);
    }
}
