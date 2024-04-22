package org.alex.arrays;

public class LowArray {

    private long[] a; //ref to array a

    // ---------------------------------------------------------
    public LowArray() { // If no parameters its an array of size 1
        a = new long[1];
    }

    public LowArray(int size){ // Constructor with parameters
        a = new long[size];
    }
    // ---------------------------------------------------------
    public void setElem(long value, int index) { // set value
        a[index] = value;
    }
    // ---------------------------------------------------------
    public long getElement(int index) {
        return a[index];
    }
} // end class
