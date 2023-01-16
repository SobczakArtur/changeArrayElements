package com.sobczak.artur;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] unsortedArray = {2, 10, 5, 3, 9, 7, 14, 12, 11};
        System.out.println("Array before sort " + Arrays.toString(unsortedArray));
        int miniElement = 0;
        int tmpElement = 0;

        for (int i = 0; i < unsortedArray.length; i++) {
            miniElement = i;
            for (int j = i; j < unsortedArray.length; j++){
                if (unsortedArray[j] < unsortedArray[miniElement]){
                    miniElement = j;
                }
            }
            tmpElement = unsortedArray[i];
            unsortedArray[i] = unsortedArray[miniElement];
            unsortedArray[miniElement] = tmpElement;
        }
        System.out.println("Array after sort " + Arrays.toString(unsortedArray));
    }
}