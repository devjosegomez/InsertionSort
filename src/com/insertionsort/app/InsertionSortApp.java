package com.insertionsort.app;

public class InsertionSortApp {

    public static void main(String[] args) {
    	//Example of Insertion Sort algorithm
    	//Declare array
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        
        System.out.println("*** Insertion sort ***");
        breakln("Unsorted Array:");
        //Displaying Unsorted array
        for(int element : intArray) {
        	System.out.print("[" + element + "]");
        }
        
        breakln();
        
        //Insertion sort
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
        
        breakln("Sorted array:");
        //Display Sorted array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("[" + intArray[i] + "]");
        }
    }
    
    public static void breakln() {
    	System.out.println();
    }
    
    public static void breakln(String m) {
    	System.out.print(m + "\n");
    }


}
