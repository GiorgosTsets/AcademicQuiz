package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton About, Exit;
    JTextField tfname;
    
    Login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("pics/quizpic.png"));
        JLabel image = new JLabel(image1);
        image.setBounds(0, 0, 1000, 500);
        add(image);
        
        JLabel Message = new JLabel("Καλώς ήρθες!");
        Message.setBounds(1025, 60, 300, 45);
        Message.setFont(new Font("MACHINE", Font.BOLD, 40));
        Message.setForeground(new Color(204, 0, 0));
        add(Message);
        
        JLabel name = new JLabel("Πληκτρολόγησε το όνομά σου");
        name.setBounds(1005, 155, 330, 35);
        name.setFont(new Font("MACHINE", Font.BOLD, 22));
        name.setForeground(new Color(204, 0, 0));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(1010, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        About = new JButton("Πληροφορίες");
        About.setBounds(1010, 270, 120, 40);
        About.setBackground(new Color(204, 0, 0));
        About.setForeground(Color.WHITE);
        About.addActionListener(this);
        add(About);
        
        Exit = new JButton("Έξοδος");
        Exit.setBounds(1190, 270, 120, 40);
        Exit.setBackground(new Color(204, 0, 0));
        Exit.setForeground(Color.WHITE);
        Exit.addActionListener(this);
        add(Exit);
        
        setSize(1500, 600);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == About) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == Exit) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
