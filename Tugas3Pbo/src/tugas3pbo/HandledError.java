/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3pbo;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS TUF GAMING
 */
public class HandledError {
    public void erTinggi(String erTinggi){
        JOptionPane.showMessageDialog(null, "For input string : " + erTinggi, "kesalahan", JOptionPane.ERROR_MESSAGE);
    }

    public void erPanjang(String erPanjang){
        JOptionPane.showMessageDialog(null, "For input string : " + erPanjang, "kesalahan", JOptionPane.ERROR_MESSAGE);
    }

    public void erLebar(String erLebar){
        JOptionPane.showMessageDialog(null, "For input string : " + erLebar, "kesalahan", JOptionPane.ERROR_MESSAGE);
    }
}
