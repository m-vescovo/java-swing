
package Lezione10;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;



public class App {
    
    public static void main (String[] args){
        
       JFrame  f= new JFrame("esempio swing"); //creo la finestra
       f.setBounds(100,100,300,200);//stabilisco le dimensioni della finestra
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //per chiudere il programma quando chiudi la finestra
 
       Container contentPane = f.getContentPane();
       
       JButton cmd = new JButton ("invia");
       cmd.setBounds(10, 10, 50, 20);
       contentPane.add(cmd);
       
       f.setVisible(true);//visualizzo la finestra
               
    }
    
}
