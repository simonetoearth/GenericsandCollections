package edu.sdccd.cisc191;

public class ArrayProducer {
    private String[] array;

    public ArrayProducer(String[] array) {
        this.array = array;
    }

    public void produce(int index, String string) {
        if (index >= 0 && index < array.length) {
            array[index] = string;
        }
    }
}
