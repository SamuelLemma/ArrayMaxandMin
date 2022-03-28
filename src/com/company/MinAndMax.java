package com.company;

	import java.util.Random;

        public class MinAndMax {
            public static void main(String[] args) {
                int  max= 0, min = 100;
                Random rd = new Random();
                int[] arr = new int[10];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rd.nextInt(1,100);
                    System.out.println(arr[i]);

                    if(arr[i] < min) min = arr[i];
                    if(arr[i] > max) max = arr[i];
                }
                System.out.println("\n The smallest number: " + min);
                System.out.println("The largest number: " + max);
            }
        }


