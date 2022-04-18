package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int[] arr = {1, 2, 3};
        double[] as = {1.57, 7.654, 9.986};
        char[] f = {33, 37};
        // Задание 2
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.println(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < as.length; i++) {
            if (i == as.length - 1)
                System.out.println(as[i]);
            else
                System.out.print(as[i] + ", ");
        }
        for (int i = 0; i < f.length; i++) {
            if (i == f.length - 1)
                System.out.println(f[i]);
            else
                System.out.print(f[i] + ", ");
        }
        // Задание 3
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
        for (int i = as.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(as[i]);
            } else {
                System.out.print(as[i] + ", ");
            }
        }
        System.out.println();
        for (int i = f.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(f[i]);
            } else {
                System.out.print(f[i] + ", ");
            }
        }
        System.out.println();
        // Задача 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            } else if (arr[i] % 2 ==0) {

            }
                System.out.print(arr[i] + ", ");
        }
    }
}

