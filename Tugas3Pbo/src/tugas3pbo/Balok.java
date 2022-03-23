/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3pbo;

/**
 *
 * @author ASUS TUF GAMING
 */
public class Balok extends PersegiPanjang{
    protected float tg;

    public Balok(float tinggi, float panjang, float lebar) {
        super(panjang, lebar);
        this.tg = tinggi;
    }

    public float HitungVolume() {
        float volume = pjgn * lbr * tg;
        return volume;
    }

    // overload 
    public float HitungLuas(float panjang,float lebar,float tinggi) {
        float luasP = (panjang * lebar + panjang * tinggi + lebar * tinggi) * 2;
        return luasP;
    }
}
