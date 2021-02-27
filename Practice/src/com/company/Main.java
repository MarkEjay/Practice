package com.company;
import com.company.LinkedList;


public class Main {

      /*  public static int count(int[] a)
        { // Count triples that sum to 0.
            int N = a.length;
            int cnt = 0;
            for (int i = 0; i < N; i++)
                for (int j = i+1; j < N; j++)
                    for (int k = j+1; k < N; k++)
                        if (a[i] + a[j] + a[k] == 0)
                            cnt++;
            return cnt;
        }*/
    public static void main(String[] args) {



    }

    public static void selection(int[] arr){
        int size = arr.length;
        for(int i =0; i<size-1; i++){
            int min = i;
            for(int j = i+1; j<size; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }

                int temp = arr[min];
                arr[min]=arr[i];
                arr[i] = temp;
            }
        }
    }
}
