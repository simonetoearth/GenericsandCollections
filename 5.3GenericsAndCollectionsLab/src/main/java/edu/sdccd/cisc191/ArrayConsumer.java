package edu.sdccd.cisc191;

public class ArrayConsumer {
    private String[] array;

    public ArrayConsumer(String[] array) {
        this.array = array;
    }

    public String consume() {
        if (array != null && array.length > 0) {
            String firstElement = array[0];
            // Shift elements to the left
            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = null;
            return firstElement;
        }
        return null;
    }
}
