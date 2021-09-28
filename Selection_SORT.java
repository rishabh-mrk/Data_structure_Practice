package com.company;


import java.util.Scanner;

public class Selection_SORT {
    void sort(int []arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }
    void print_sort(int []arr){
        int n=arr.length;
        for(int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements to sort");
        int []arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Selection_SORT srt = new Selection_SORT();
        srt.sort(arr);
        System.out.println("SORTED ARRAY IS : ");
        srt.print_sort(arr);
    }
}
