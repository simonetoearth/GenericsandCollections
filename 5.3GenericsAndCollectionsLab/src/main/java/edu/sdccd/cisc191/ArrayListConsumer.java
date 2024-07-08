package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListConsumer {
    private ArrayList<String> list;

    public ArrayListConsumer(ArrayList<String> list) {
        this.list = list;
    }

    public String consume() {
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        return null;
    }
}