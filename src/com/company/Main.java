package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int size = sc.nextInt();

        int[][] A = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                Random rand = new Random();
                A[i][j] = rand.nextInt(15);
            }
        }

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("Rotated matrix");
        for (int k = 0; k < size/2; k++)
        {
            for (int j = k; j < size - 1 - k; j++)
            {
                int tmp         = A[k][j];
                A[k][j]         = A[j][size-1-k];
                A[j][size-1-k]     = A[size-1-k][size-1-j];
                A[size-1-k][size-1-j] = A[size-1-j][k];
                A[size-1-j][k]     = tmp;
            }
        }

        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.println();
        }
    }
}
