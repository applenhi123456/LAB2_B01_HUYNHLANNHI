/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
    import java.util.Scanner;
public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm học sinh: ");
        float diem = sc.nextFloat();
        String xepLoai;
        if (diem < 5.0) {
            xepLoai = "Học lực kém";
        } else if (diem < 7.0) {
            xepLoai = "Học lực trung bình";
        } else if (diem < 8.0) {
            xepLoai = "Học lực khá";
        } else {
            xepLoai = "Học lực giỏi";
        }
        System.out.println("Xếp loại học tập: " + xepLoai);
    }
}


