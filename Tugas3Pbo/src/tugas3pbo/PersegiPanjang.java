/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3pbo;

/**
 *
 * @author ASUS TUF GAMING
 */
public class PersegiPanjang {
    protected float pjgn;
    protected float lbr;

    public PersegiPanjang(float panjang, float lebar) {
        this.pjgn = panjang;
        this.lbr = lebar;
    }
 
    public float HitungKeliling() {
        float keliling = (pjgn+lbr) * 2;
        return keliling;
    }

    public float HitungLuas() {
        float luas = pjgn * lbr;
        return luas;
    }
}
