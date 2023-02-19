/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class BT11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số đỉnh của đồ thị: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Nhập ma trận đối xứng của đồ thị: ");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 0; // Đường chéo của ma trận là 0
                } else {
                    System.out.print("Nhập trọng số cạnh (" + (i + 1) + ", " + (j + 1) + "): ");
                    int weight = scanner.nextInt();
                    matrix[i][j] = weight;
                    matrix[j][i] = weight; // Mỗi cạnh được lưu ở hai vị trí đối xứng trong ma trận
                }
            }
        }

        System.out.println("Ma trận đối xứng của đồ thị:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

