package eu.mcapp.java.basic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by waqar on 11/06/15.
 */
public class guiDemo {

    JFrame J;

    public guiDemo() {
        System.out.println("Gui demo started");

        J = new JFrame("Gui Demo");
        J.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        J.setResizable(true);
        J.setBounds(new Rectangle(0, 0, 300, 300));
        J.setVisible(true);

        J.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                int i=JOptionPane.showConfirmDialog(null, "Are you sure?S?");
                if(i==0)
                    J.dispose(); //return;//System.exit(0);//cierra aplicacion
            }
        });



    }


    public void addLabel() {
        JLabel l = new JLabel("Labeling is not cool");
        J.add(l);
        System.out.println("Label Added");

    }

}
