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
public class Context 
{
   public ITinh tinhtoan;
   public void setTinhToan(ITinh tinhtoan){
       this.tinhtoan = tinhtoan;
   }
   public float tinh(float a, float b)
   {
       return tinhtoan.tinh(a,b);
   }
}
