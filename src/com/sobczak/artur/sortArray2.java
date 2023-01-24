package com.sobczak.artur;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortArray2 {
    public static void main(String[] args) {

        int[] unsoretdArray = {3, 6, 2, 1, 10, 7, 8, 0};
        int mini;
        System.out.println("Array after sort "+ Arrays.toString(unsoretdArray));

        for (int i = 0; i < unsoretdArray.length; i++){
            mini = i;
            for (int j = i + 1; j < unsoretdArray.length; j++){
                if (unsoretdArray[j] < unsoretdArray[i]){
                    mini = unsoretdArray[j];
                    unsoretdArray[j] = unsoretdArray[i];
                    unsoretdArray[i] = mini;
                }
            }
        }
        System.out.println("Array after sort "+ Arrays.toString(unsoretdArray));
    }
}
