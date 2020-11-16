package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */


public class App {
    public static void main(String[] args) {
//Question 1
        int[] numbers = new int[]{11, 23, 39, 55, 88, 121, 165};


        //System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        indexOf();
        Sort();
        CopyArray();
        Average();
    }

//Question 2
    public static int indexOf(){


        int[] numbers = new int []{1, 2, 3, 4, 5,6};

        int element = 6;
        for(int i=0; i < numbers.length; i++) {
            if (numbers[i] == element) {
                System.out.println(i);
                return 0;
            }
        }

       return -1;
    }
//Question 3
    public static void Sort(){

        String[] stringArray = new String[] { "Paris", "London", "New York","Stockholm"};

        Arrays.sort(stringArray);
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(stringArray[3]);
    }
// Question 4
    public static int CopyArray(){

        int [] numbers = new int[]{1, 15, 20};
        int [] numbers2 = new int[numbers.length];
        //int [] numbers3 = new int[numbers.length * 2];

        for(int i=0; i < numbers.length; i++){

            numbers2[i] = numbers[i];
            System.out.println(numbers2[i]);
        } return 0;

    }
    //Question 6

    public static void Average(){

        int [] numbers = new int[]{ 43,5,23,17,2,14};
        double sum = 0;

        for(int i=0; i < numbers.length; i++){
            sum = sum + numbers[i];
        } sum = sum / numbers.length;
        System.out.println(sum);
    }
}
