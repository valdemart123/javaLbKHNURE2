package com.valentyn;

import java.util.Scanner;

public class Main {
    double m[][];


    public static void main(String[] args) {
        int n=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы N: ");

        n = sc.nextInt();

        double [][] userArray = createArray(n);
        Determinant logic = new Determinant(userArray, n);
        System.out.println(logic.determinant(userArray, n));
    }

    public static double [][] createArray (int n) {
        double [][] result = new double[n][n];
        for (int i=0; i<n; i++) {
            for (int j =0; j<n; j++){
                result[i][j] = Math.random()*((n-(-n)+1)-n);
            }
        }
        return result;
    }
}
