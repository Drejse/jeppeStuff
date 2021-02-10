package com.company;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        SelectionSort select = new SelectionSort();
        int[] arr = {9,6,4,8,7,1,2};
        System.out.println("arrayet før sort");
        for (int tmp : arr){
            System.out.print(tmp);

        }
        bubble.bubbleSort(arr);
        System.out.println();
        System.out.println("Her har du et bubblesorted array");
        bubble.printTheBubbleSort(arr);

        
        System.out.println();
        insertionSort.insertionSort(arr);
        System.out.println("Insertion sort");
        insertionSort.printInsertionSort(arr);


        System.out.println();
        select.selectionSort(arr);
        System.out.println("Selection sort");
        select.printTheSelectionSort(arr);



    }

    public static class BubbleSort{

        void bubbleSort(int[] array){
            int n = array.length;
            for(int i = 0; i < n-1; i++){
                for (int j = 0; j <n-i-1; j++){
                    if(array[j]>array[j+1]){
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }
                }
            }
        }

        void printTheBubbleSort(int[] array){
            int n = array.length;
            for (int j : array) {
                System.out.print(j + " ");
            }

        }

    }

    public static class InsertionSort{

        void insertionSort(int[] array){
            int i,j,key,tmp;

            for (i = 0; i < array.length; i++) {
                key=array[i];
                j = i - 1;
                while(j>=0 && key < array[j]){
                    tmp = array[j];
                    array[j] = array[j +1];
                    array[j+1] = tmp;
                    j--;
                }
            }

        }

        void printInsertionSort(int[] array){
            int n = array.length;
            for (int j : array) {
                System.out.print(j + " ");
            }

        }
    }

    public static class SelectionSort{

        void selectionSort(int[] array){
            int i,j,minimumVal,minimumIndex, tmp = 0;

            for (i = 0; i < array.length; i++) {
                minimumVal = array[i];
                minimumIndex = i;
                for (j = 0;  j < array.length ; j++) {
                    if(array[j] < minimumVal){
                        minimumVal = array[j];
                        minimumIndex = j;
                    }
                }
                if(minimumVal < array[i]){
                    tmp = array[i];
                    array[i] = array[minimumIndex];
                    array[minimumIndex] = tmp;
                }
            }
        }
        void printTheSelectionSort(int[] array){
            int n = array.length;
            for (int j : array) {
                System.out.print(j + " ");
            }

        }
    }
}
