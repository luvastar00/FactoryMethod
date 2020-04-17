/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author GIGABYTE
 */
public class Main
{
     public static void main(String[] args)
     {
        // TODO code application logic here
        Context context = new Context();
        context.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + context.tinh(75, 12));
        context.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + context.tinh(54, 78));
}
}
