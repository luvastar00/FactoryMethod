/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author GIGABYTE
 */
public class HangHoa {
     public String tenHH;
    public int gia;
    public String moTa;

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    public int getGia() {
        return gia;
    }

    public String getThongTin() {
        return "Ten hang hoa: " + this.tenHH + "\tGia : " + this.gia + "\tMo ta: " + this.moTa;
    }
}
