package com.company;

public class Main {

    public static void main(String[] args) {
        double array[] = {1.2, 2.4, -8.5, -5.6, 5.6, -0.8, 6.7, 5.6, -8.5, 6.7, 8.9, 0.6, -5.6, 5.0, 3.4, 4.5};
        double a = 0;
       int b = 0;
        boolean game = false;
        for (double numbers : array) {
            if (numbers < 0) {
                game = true;
            }else if (game) {
                b++;
                a += numbers;
            }
    }
        System.out.println(a / b);
    }
    public static void games () {
        int arr []={-4,-2, 2,3,6,8};
        for (int i = 0; i < arr.length; i++);
        int i=0;
        int min=arr[i];
        int min_i=i;
        for (int j = i+1; j <arr.length ; j++) {
            if(arr[j]< min);
            min_i=j;
            if(i!=min_i) {
                int tmp = arr[i];
                arr[min_i] = tmp;
            }
            }

    }

}