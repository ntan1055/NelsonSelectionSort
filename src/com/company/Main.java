package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] doubleArr = {8.5, 6.6, 6.9, 1.1, 8.8, 9.9};
        double[] selectionSortArr = SortingUtil.copyDoubleArray(doubleArr);

        System.out.print("Before Selection Sorting: ");
        for(double num:selectionSortArr)
            System.out.print(num + " ");
        System.out.println();

        SelectionSort.selectionSort(selectionSortArr);

        System.out.print("After Selection Sorting: ");
        for(double num:selectionSortArr)
            System.out.print(num + " ");
        System.out.println();
    }
}
