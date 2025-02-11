import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Form1 extends JFrame implements ActionListener{

    Container cp ;
    JLabel name , id ;
    JTextField t1 ,t2 ;
    JButton b1,b2 ;
    public Form1(){
        Initial();
        setComponent();
        Finally();
    }
    public void Initial(){
        cp = this.getContentPane();
        cp.setLayout(null);
    }
    public void setComponent(){
        id = new JLabel("ID : ");
        name = new JLabel("Name : ");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Add");
        b2 = new JButton("Clear");  

        b1.addActionListener(this);
        b2.addActionListener(this);
        
        id.setBounds(32, 10, 60, 25);
        name.setBounds(10, 40, 60, 25);
        t1.setBounds(60, 10, 120, 25);
        t2.setBounds(60, 40, 180, 25);
        b1.setBounds(30, 80, 70, 25);
        b2.setBounds(120, 80, 70, 25);
        
        cp.add(id); cp.add(t1);
        cp.add(name); cp.add(t2);
        cp.add(b1) ; cp.add(b2);
    }
    public void Finally(){
        this.setSize(270, 160);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            int i= 1;
            String id = t1.getText();
            String n = t2.getText();
            /*File f = null;
            FileReader fr = null ;
            BufferedReader fb = null;
            FileWriter fw = null;
            BufferedWriter bw = null;
                    try {
                        f = new File("STD.csv");
                        fr = new FileReader(f);
                        fb = new BufferedReader(fr);
                        fw = new FileWriter(f);
                        bw = new BufferedWriter(fw);
                        String s ; int i =1;
                        while((s = fb.readLine()) != null){
                        bw.write(t1.getText());
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    } finally{ try {
                        bw.close(); fb.close();
                        fw.close(); fr.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                */
                for (i = 0; i < id.length(); i++) {                 
                String currentChar = id.substring(i, i + 1);                 
                if (Character.isDigit(currentChar.charAt(0))) {                              
                    
                } else {
                    break;
                }
            }
            for (i = 0; i < n.length(); i++) {                 
                String currentChar = n.substring(i, i + 1);                 
                if (Character.isAlphabetic(currentChar.charAt(0))) {                              
                    
                }else{
                    break;
                }
            }
        
        }else if(e.getSource() == b2){
            t1.setText("");
            t2.setText("");
        }
    }
}