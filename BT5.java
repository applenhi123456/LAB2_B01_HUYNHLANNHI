/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class BT5 {
    
}
package bt;

import java.util.Scanner;

public class b5 {
    public static void sochinhphuong()
    {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap a  ");
        a= sc.nextInt();
        float cp = (float)Math.sqrt(a);
        if (cp == Math.sqrt(a))
        {
            System.out.println(" day la so chinh phuong");
        }
        else
        {
           System.out.println(" ko phai la so chinh phuong ");
            
        }
        
    }
    public static void main (String[] arg)
    {
        sochinhphuong();
    }
}
