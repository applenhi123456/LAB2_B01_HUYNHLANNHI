/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
    Import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao he so a: ");
        float a = scanner.nextFloat();

        System.out.print("Nhap vao he so b: ");
        float b = scanner.nextFloat();

        System.out.print("Nhap vao he so c: ");
        float c = scanner.nextFloat();

        if (a == 0) {
            // phuong trinh bac nhat
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                float x = -c / b;
                System.out.println("Phuong trinh co 1 nghiem x = " + x);
            }
        } else {
            // phuong trinh bac hai
            float delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                float x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x = " + x);
            } else {
                float x1 = (-b + (float)Math.sqrt(delta)) / (2 * a);
                float x2 = (-b - (float)Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

        scanner.close();
    }
}

