/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sanke
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class wordle extends JFrame implements
        ActionListener {
    JPanel p1;
    JButton check;
    JLabel chn;
    int chances = 6;
    static ArrayList<JTextField> tff = new ArrayList<>();
    wordle(){
        setSize(500,500);
        p1 = new JPanel();
        p1.setBounds(100,80,300,60);
        p1.setLayout(new
                BoxLayout(p1,BoxLayout.X_AXIS));
// p1.setBackground(Color.GRAY);
        add(p1);
        createTexfields();
        chn = new JLabel("Chances remaining: "+chances);
                chn.setBounds(150,250,150,50);
        add(chn);
        check = new JButton("Check");
        check.setBounds(150,350,150,50);
        check.addActionListener(this);
        add(check);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==check) {
            if (chances > 0) {//checking each textboxes loop
                for (int i = 0; i < wordle_logic.wordSize;
                     i++) {
                    if (wordle_logic.matchExactLetter(i)) {

                        tff.get(i).setBackground(Color.green);
                    } else if (wordle_logic.matchLetter(i))
                    {

                        tff.get(i).setBackground(Color.yellow);
                    } else {

                        tff.get(i).setBackground(Color.WHITE);
                    }
                }
                chances--;
                chn.setText("Chances remaining: "+chances);
            }
            else{
                JOptionPane.showMessageDialog(null,"sorry mate, you couldnt make it!");
                System.exit(0);
            }
        }
    }
    void createTexfields(){
        //for adding the textboxes in arraylist
        for(int i =0; i<wordle_logic.wordSize ; i++){
            tff.add(new JTextField());
            tff.get(i).setFont(new
                    Font("Tahoma",Font.BOLD,32));

            tff.get(i).setHorizontalAlignment(JTextField.CENTER);
        }
        //for placing the textboxes on the JPanel
        for(int i =0;i<wordle_logic.wordSize;i++){
            p1.add(tff.get(i));
        }
    }
    public static void main(String[] args) {
        new wordle_logic();
        new wordle();
    }
}