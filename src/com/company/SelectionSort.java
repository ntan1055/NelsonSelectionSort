package com.company;

public class SelectionSort extends SortingUtil
{
    public static void selectionSort(double[] arr)
    {
        int min;
        for(int i = 0; i < arr.length; i++)
        {
            min = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            if(min != i)
            {
                doubleSwap(arr, i, min);
            }
        }
    }
}
