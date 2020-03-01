package com.ranjit;

/**
 * works on the basic of divide and conquire
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] input = {23, 4, 65, 26, 98, 7, 43, 12};
       quicksort(input);
        print(input);
    }

    private static void quicksort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = arr[(left + right) / 2];
        if (left < right) {
            int index = partition(arr, left, right, pivot);
            quickSort(arr, left, index - 1);
            quickSort(arr, index, right);
        }
    }

    private static int partition(int[] arr, int left, int right, int pivot) {

        while (left <= right) {
            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(arr,left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    private static void swap(int[] arr,int left,  int right) {
       int temp= arr[left];
       arr[left]=arr[right];
       arr[right]=temp;
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
