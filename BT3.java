/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
    import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so dien su dung trong thang: ");
        int soDienSuDung = scanner.nextInt();

        int tongTienDien = 0;

        if (soDienSuDung <= 50) {
            tongTienDien = soDienSuDung * 1000;
        } else {
            tongTienDien = 50 * 1000 + (soDienSuDung - 50) * 1200;
        }

        System.out.println("Tong tien dien trong thang la: " + tongTienDien);

        scanner.close();
    }
}
}
