package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int [] arr = {1, 2, 3};
        double [] as = {1.57, 7.654, 9.986};
        char [] f = {33, 37};
        // Задание 2
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1)
                System.out.println(arr[i]);
            else
            System.out.print(arr[i] + ", ");
            }
        for (int i = 0; i < as.length; i++) {
            if (i == as.length-1)
            System.out.println(as[i]);
                else
                System.out.print(as[i] + ", ");
        }
        for (int i = 0; i < f.length; i++) {
            if (i == f.length-1)
            System.out.println(f[i]);
            else
            System.out.print(f[i] + ", ");
        }
    }
}
