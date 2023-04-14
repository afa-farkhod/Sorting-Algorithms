package org.example.SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] list){
        for(int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 5, -4}; // sample input
        InsertionSort.insertionSort(list);
        System.out.println("sample input: 1, 9, 4, 6, 5, -4");
        System.out.println("after sorting: " + Arrays.toString(list));
    }
}
