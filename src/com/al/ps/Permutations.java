package com.al.ps;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class Permutations {
 public static void printArray(int []a){
     for (int i = 0; i < a.length; i++){
         System.out.print(a[i]+" ");
     }
     System.out.println();
 }
 public static void swap(int a[], int i, int cid){
     int temp = a[i];
     a[i] = a[cid];
     a[cid] = temp;
 }
 public static void printPermutations(int []a, int cid){
     if (cid == a.length -1){
         printArray(a);
     }
     for (int i = cid; i < a.length; i++){
         swap(a, i, cid);
         printPermutations(a, cid+1);
         swap(a, i, cid);
     }
 }
 public static void main(String[] args) {
     System.out.println("Hello, World!");
     int a[]={1,2,3,4,5};
     printPermutations(a, 0);
 }
}