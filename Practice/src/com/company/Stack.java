package com.company;

public class Stack<Item> {
    Item[] arr;
    int n=0;



    public void push(Item data){
        arr[n++]= data;
    }
    public Item pop(){
        Item x = arr[--n];
        
        return x;
    }

    public void printStack(){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
