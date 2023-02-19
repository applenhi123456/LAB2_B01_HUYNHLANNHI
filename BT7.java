/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;

public class BT7{
    public static void xephang()
    {
        float n;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so diem ");
        n = sc.nextFloat();
                
        if (n < 5 )
        {
        System.out.println("Kem");
        }
        else 
        
            if (n>=5 && n<=7)
            {
                System.out.println(" Trung Binh ");
            }
            else 
                if( n>=7 && n<=8 )
                {
                    System.out.println("Kha");
                }
        
                else 
                   System.out.println("Gioi"); 
      
    }
    public static void main(String[] arg)
    {
        xephang();
    }
}