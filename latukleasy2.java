package com.mycompany.latihanukl2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihanukl2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan sebuah bilangan: ");
            int nilai = scanner.nextInt();

            if (nilai % 2 == 0) {
                System.out.println(nilai + " adalah bilangan genap.");
            } else {
                System.out.println(nilai + " adalah bilangan ganjil.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid! Harap masukkan angka bulat.");
        }

        scanner.close();
    }
}
