package quiz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon image1 = new ImageIcon(ClassLoader.getSystemResource("pics/score.jpg"));
        Image image2 = image1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(0, 120, 300, 250);
        add(image);
        
        JLabel heading = new JLabel(name + " ολοκλήρωσες το κουίζ");
        heading.setBounds(45, 30, 700, 40);
        heading.setFont(new Font("MACHINE", Font.PLAIN, 30));
        add(heading);
        
        
        
        if (score==100){
        JLabel message = new JLabel("ΑΡΙΣΤΑ");
        message.setBounds(420, 130, 300, 30);
        message.setFont(new Font("MACHINE", Font.BOLD, 34));
        add(message);
        }
		else if (score>=70){
		JLabel message = new JLabel("ΠΟΛΥ ΚΑΛΑ");
        message.setBounds(380, 130, 300, 30);
        message.setFont(new Font("MACHINE", Font.BOLD, 32));
        add(message);
		}
		else{
		JLabel message = new JLabel("ΠΡΟΣΠΑΘΗΣΕ ΠΑΛΙ");
        message.setBounds(330, 130, 320, 40);
        message.setFont(new Font("MACHINE", Font.BOLD, 32));
        add(message);
		}
        
        
        
        
        JLabel lblscore = new JLabel("Το σκορ σου είναι " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("MACHINE", Font.PLAIN, 30));
        add(lblscore);
        
        JButton submit = new JButton("Παίξε ξανά");
        submit.setBounds(390, 260, 120, 50);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
