package org.alex.arrays;

public class ArrayApp {

    public static void main(String[] args) {
        LowArray arr;   // reference
        arr = new LowArray(100);
        int nElems = 0;
        int j;
        arr.setElem(77, 0);
        arr.setElem(99, 1);
        arr.setElem(44, 2);
        arr.setElem(55, 3);
        arr.setElem(22, 4);
        arr.setElem(88, 5);
        arr.setElem(11, 6);
        arr.setElem(00, 7);
        arr.setElem(66, 8);
        arr.setElem(33, 9);
        nElems = 10;    // now 10 items in array

        for (j=0; j<nElems; j++) { // Display itenms
            System.out.println(arr.getElement(j) + " ");
        }

        System.out.println(" ");

        int searchKey = 26; // Search for data item
        for (j=0; j<nElems;j++) {
            if (arr.getElement(j) == searchKey) {
                break;
            }
        }

        if (j == nElems) {
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        // Delete value 55
        for(j=0; j<nElems; j++) {
            if (arr.getElement(j) == 55) {
                break;
            }
        }
        for(int k=j; k < nElems; k++) { // Higher ones down
            arr.setElem(arr.getElement(k+1), k);
        }
        nElems--;

        for (j=0; j<nElems; j++) { // Display elements
            System.out.println(arr.getElement(j) + " ");
        }
        System.out.println(" ");
    }
}
