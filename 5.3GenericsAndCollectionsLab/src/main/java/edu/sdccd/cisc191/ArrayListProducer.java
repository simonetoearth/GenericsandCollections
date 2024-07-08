package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListProducer {
    private ArrayList<String> list;

    public ArrayListProducer(ArrayList<String> list) {
        this.list = list;
    }

    public void produce(int index, String string) {
        list.add(index, string);
    }
}
