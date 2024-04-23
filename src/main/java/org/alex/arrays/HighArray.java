package org.alex.arrays;

public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    /**
     * Finds specified value
     * @param searchKey
     * @return
     */
    public boolean find(long searchKey) {
        int i;
        for (i=0; i<nElems; i++) {
            if (a[i] == searchKey) {
                break;
            }
        }

        if (nElems == i) {
            return false;
        } else {
        return true;
        }
    }

    /**
     * Inserts new value at the end
     * @param value
     */
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    /**
     * Deletes value if exists
     * @param value
     * @return
     */
    public boolean delete(long value) {
        int i;

        for (i=0; i<nElems; i++) {
            if (a[i] == value) {
                break;
            }
        }
        if (i==nElems) {
            return false;
        } else {
            for (int j=i; j<nElems;j++) {
                a[j] = a[j+1];
            }
            nElems--;
            return true;
        }
    }
}
