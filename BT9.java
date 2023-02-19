/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class BT9 {
    public static void nhapsonguyen()
    {
        int n;
        do
        {
        Scanner c = new Scanner (System.in);
        System.out.print("nhap n");
        n = c.nextInt();
        }
        while(n <= 0);
        giaithua(n);
    }
    public static void giaithua (int n)
    {
        int kq =1;
        int i = 1;
        // nếu ta để dòng i++ lên trc dòng kq=kq*i thì while bắt buộc phải thay đổi thành while (i<n)//
        while(i<=n)
        {
            kq=kq*i;
            i++;
        }
         
        System.out.println("vay ket qua la "+kq);
    }
    public static void main(String[] arg)
    {
        nhapsonguyen();
    }
    
}
