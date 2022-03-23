package tugas3pbo;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import static java.lang.Float.parseFloat;
/**
 *
 * @author ASUS TUF GAMING
 */
public class GUI extends JFrame implements ActionListener {
    JLabel title,etLength, etWidth, etHeight,etResult,lblSA,lblSC,lblCV,lblCSA;
    JLabel SquareArea,SquareCircumstance,CuboidVolume,CuboidSurfaceArea;//
    JTextField MLength, MWidth, MHeight; //textfield
    JButton BCount,BReset; //tabel
    
    
    public GUI(){
        setSize(350,450);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);  
        setLayout(null);
        setResizable (false);
        setVisible(true);
        
        title = new JLabel("Cuboid Calculator");
        etLength = new JLabel("Length");
        etWidth = new JLabel("Width");
        etHeight = new JLabel("Height");
        etResult = new JLabel("Result : ");
        SquareArea = new JLabel();
        SquareCircumstance = new JLabel();
        CuboidVolume = new JLabel();
        CuboidSurfaceArea = new JLabel();
            
        MLength = new JTextField();
        MWidth = new JTextField();
        MHeight = new JTextField();
        
        BCount = new JButton("Count");
        BReset = new JButton("Reset");
        
        BCount.addActionListener(this); 
        BReset.addActionListener(this); 
        
        add(etLength);
        add(etWidth);
        add(etHeight);
        add(etResult);
        add(SquareArea);
        add(SquareCircumstance);
        add(CuboidVolume);
        add(CuboidSurfaceArea);
        add(MLength);
        add(MWidth);
        add(MHeight);
        add(BCount);
        add(BReset);
        
        
        title.setBounds(100,5,200,20);
        etLength.setBounds(25, 50, 200, 20);
        etWidth.setBounds(25, 125, 200, 20);
        etHeight.setBounds(25, 200, 200, 20);
        MLength.setBounds(100, 50, 150, 20);
        MWidth.setBounds(100, 125, 150, 20);
        MHeight.setBounds(100, 200, 150, 20);
        BCount.setBounds(65, 375, 75, 20);
        BReset.setBounds(175, 375, 75, 20);
        etResult.setBounds(100, 225, 100, 50);
        SquareArea.setBounds(10, 250, 300, 50);
        SquareCircumstance.setBounds(10, 275, 300, 50);
        CuboidVolume.setBounds(10, 300, 300, 50);
        CuboidSurfaceArea.setBounds(10, 325, 300, 50);
          
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        HandledError er = new HandledError();
        
        
        if(e.getSource() == BCount){
            float p = 0, l = 0 , t = 0;
             
            try{   
             t = parseFloat(this.MHeight.getText());
             }catch(NumberFormatException x){
             er.erTinggi(this.MHeight.getText());
             
             }
            
            try{   
             p = parseFloat(this.MLength.getText());
             }catch(NumberFormatException x){
             er.erPanjang(this.MLength.getText());
             
             }
            
            try{   
             l = parseFloat(this.MWidth.getText());
             }catch(NumberFormatException x){
             er.erLebar(this.MWidth.getText());
          
             }
            
            if(t > 0 && p > 0 && l > 0){  
                Balok balok = new Balok(t,p,l);
                SquareArea.setText("Square Area   =  " + String.valueOf(balok.HitungLuas()));
                SquareCircumstance.setText("Square Circumstance   =  " + String.valueOf(balok.HitungKeliling()));
                CuboidVolume.setText("Cuboid Volume =  " + String.valueOf(balok.HitungVolume()));
                CuboidSurfaceArea.setText("Cuboid Surface Area  =  " + String.valueOf(balok.HitungLuas(p,l,t)));       
            }
             
        }
        if(e.getSource() == BReset){
            MLength.setText("");
            MWidth.setText("");
            MHeight.setText("");
            SquareArea.setText("");
            SquareCircumstance.setText("");
            CuboidVolume.setText("");
            CuboidSurfaceArea.setText("");
        }
    }
    
}
