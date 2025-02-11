import java.awt.*;
import javax.swing.*;

public class Form2 extends JFrame {

    Container cp ;
    JButton left,right,up,down,box ;
    
    public Form2(){
        Initial();
        setComponent();
        Finally();
    }
    public void Initial(){
        cp = this.getContentPane();
        cp.setLayout(null);
    }
    public void setComponent(){

        left = new JButton("A");
        right = new JButton("D");
        up = new JButton("W");
        down = new JButton("S");
        box = new JButton();
        box.setBackground(Color.black);
        box.setBounds(0, 0, 50, 50);

        left.setBounds(25, 230, 47, 30);
        down.setBounds(70, 230, 47, 30);
        right.setBounds(115, 230, 47, 30);
        up.setBounds(70, 200, 47, 30);

        cp.add(left);cp.add(right);
        cp.add(up);cp.add(down);
        cp.add(box);
    }
    public void Finally(){
        this.setSize(200, 300);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   
}