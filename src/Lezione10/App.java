
package Lezione10;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



public class App {
    
    public static void main (String[] args){
        
       JFrame  f= new JFrame("esempio swing"); //creo la finestra
       f.setBounds(100,100,300,200);//stabilisco le dimensioni della finestra
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //per chiudere il programma quando chiudi la finestra
 
       Container contentPane = f.getContentPane();
       
       contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));//stabilisco le proprietà varie se aggiungo altri botoni li affianca finoa riempire 
       
    //contentPane.setLayout(null);//blocca il layout manager standard se metto null
       JButton cmd = new JButton ("invia");
       cmd.setBounds(50, 50, 100, 50);
       contentPane.add(cmd);
       
       JButton cmd1 = new JButton ("invia1"); //le dimensioni sono date dal testo contenuto perchè ho messo il FlowLayout
        contentPane.add(cmd1);
        cmd1.setPreferredSize(new Dimension(200, 50));//dimensione preferita
        
        
        f.setVisible(true);//visualizzo la finestra come è stata costruita prima
               
    }
    
}
