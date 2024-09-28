package org.java.sorts;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] array = new int[]{5, 40, 15, 3, 2, 25};
        for(int i = 1;i < array.length;i++){
            int temp = array[i];
            for(int j = i-1;j>=0;j--){
                System.out.println("Compare "+ temp + " " + array[j]);
                if(temp < array[j]){
                    System.out.println(array[j] + " is bigger");
                    array[j+1] = array[j];
                    array[j] = temp;
                    System.out.println("swap with "+array[j]);
                    System.out.println(Arrays.toString(array));
                }
            }
            System.out.println("final: "+Arrays.toString(array));
        }
    }
}
