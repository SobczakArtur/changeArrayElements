package com.sobczak.artur;

import java.lang.reflect.Array;
import java.util.Arrays;

public class swappingFirstToLast {
    public static void main(String[] args) {

        int[] tab = {10, 15, 30};
        int[] result = new int[3];
        int lastPosition = result.length - 1;

        for (int i = 0; i < tab.length; i++) {
           if (i == 0){
               result[lastPosition] = tab[0];
           } else {
              result[i - 1] = tab[i];
           }

        }
        System.out.println(Arrays.toString(result));

      }

   }
