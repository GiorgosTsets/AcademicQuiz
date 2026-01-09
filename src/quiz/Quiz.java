package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String studentAnswers[][] = new String[10][1];
    JLabel qNumber, question, warning, level, tips;
    JRadioButton option1, option2, option3, option4;
    ButtonGroup options;
    JButton next, submit, help;
    
    public static int timer = 30;
    public static int answer_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon image2 = new ImageIcon(ClassLoader.getSystemResource("pics/quizpic2.jpg"));
        JLabel image = new JLabel(image2);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        qNumber = new JLabel();
        qNumber.setBounds(50, 500, 280, 30);
        qNumber.setFont(new Font("MACHINE", Font.PLAIN, 23));
        add(qNumber);
        
        question = new JLabel();
        question.setBounds(170, 500, 900, 30);
        question.setFont(new Font("MACHINE", Font.PLAIN, 23));
        add(question);
        
        level = new JLabel();
        level.setBounds(50, 420, 280, 30);
        level.setFont(new Font("MACHINE", Font.BOLD, 26));
        add(level);
        
        warning = new JLabel();
        warning.setBounds(250, 420, 800, 30);
        warning.setFont(new Font("MACHINE", Font.BOLD, 25));
        add(warning);
        
        tips = new JLabel();
        tips.setBounds(50, 750, 970, 30);
        tips.setFont(new Font("MACHINE", Font.BOLD, 21));
        add(tips);
        
        questions[0][0] = " Τι φανερώνει το 5 στον αριθμό 2530;";
        questions[0][1] = "Χιλιάδα";
        questions[0][2] = "Εκατοντάδα";
        questions[0][3] = "Δεκάδα";
        questions[0][4] = "Μονάδα";

        questions[1][0] = " Ποιός αριθμός δηλώνει πέντε χιλιοστά;";
        questions[1][1] = "0,5";
        questions[1][2] = "0,05";
        questions[1][3] = "0,005";
        questions[1][4] = "5";

        questions[2][0] = " Ποιό είναι το ελάχιστο κοινό πολλαπλάσιο του 4 και του 9;";
        questions[2][1] = "36";
        questions[2][2] = "28";
        questions[2][3] = "45";
        questions[2][4] = "40";

        questions[3][0] = " Ποιός είναι ο κύβος του 4;";
        questions[3][1] = "16";
        questions[3][2] = "64";
        questions[3][3] = "32";
        questions[3][4] = "28";
        
        questions[4][0] = " 20 φίλoi θέλουν από ένα εισιτήριο των 4,80 ευρώ.Πόσα ευρώ πρέπει να πληρώσουν;";
        questions[4][1] = "90";
        questions[4][2] = "91,2";
        questions[4][3] = "100,8";
        questions[4][4] = "96";

        questions[5][0] = " Ποιός αριθμός με την μορφή δύναμης αντιστοιχεί στον 100.000;";
        questions[5][1] = "10^4";
        questions[5][2] = "10^2";
        questions[5][3] = "10^5";
        questions[5][4] = "10^6";
        
        questions[6][0] = " Εκτυπωτής βγάζει 10 σελίδες σε 2 λεπτά. Πόσες βγάζει σε 10 λεπτά;";
        questions[6][1] = "20";
        questions[6][2] = "30";
        questions[6][3] = "60";
        questions[6][4] = "50";

        questions[7][0] = " Τα 4 κιλά σταφύλια κοστίζουν 36 ευρώ. Πόσο κοστίζουν τα 6 κιλά;";
        questions[7][1] = "50 ευρώ";
        questions[7][2] = "54 ευρώ";
        questions[7][3] = "46 ευρώ";
        questions[7][4] = "64 ευρώ";

        questions[8][0] = " Ένα φόρεμα αξίας 60 ευρώ έχει έκπτωση 20%. Πόσο κοστίζει;";
        questions[8][1] = "46 ευρώ";
        questions[8][2] = "52 ευρώ";
        questions[8][3] = "50 ευρώ";
        questions[8][4] = "48 ευρώ";

        questions[9][0] = " Σε μια τάξη οι μαθητές ήταν 300 και έγιναν 360. Ποιό είναι το ποσοστό αύξησης;";
        questions[9][1] = "20%";
        questions[9][2] = "30%";
        questions[9][3] = "10%";
        questions[9][4] = "15%";
        
        answers[0][1] = "Εκατοντάδα";
        answers[1][1] = "0,005";
        answers[2][1] = "36";
        answers[3][1] = "64";
        answers[4][1] = "96";
        answers[5][1] = "10^5";
        answers[6][1] = "50";
        answers[7][1] = "54 ευρώ";
        answers[8][1] = "48 ευρώ";
        answers[9][1] = "20%";
        
        option1 = new JRadioButton();
        option1.setBounds(180, 560, 700, 30);
        option1.setBackground(Color.WHITE);
        option1.setFont(new Font("MACHINE", Font.PLAIN, 24));
        add(option1);
        
        option2 = new JRadioButton();
        option2.setBounds(180, 600, 700, 30);
        option2.setBackground(Color.WHITE);
        option2.setFont(new Font("MACHINE", Font.PLAIN, 24));
        add(option2);
        
        option3 = new JRadioButton();
        option3.setBounds(180, 640, 700, 30);
        option3.setBackground(Color.WHITE);
        option3.setFont(new Font("MACHINE", Font.PLAIN, 24));
        add(option3);
        
        option4 = new JRadioButton();
        option4.setBounds(180, 680, 700, 30);
        option4.setBackground(Color.WHITE);
        option4.setFont(new Font("MACHINE", Font.PLAIN, 24));
        add(option4);
        
        options = new ButtonGroup();
        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);
        
        next = new JButton("Επόμενο");
        next.setBounds(1100, 500, 200, 50);
        next.setFont(new Font("MACHINE", Font.PLAIN, 22));
        next.setBackground(new Color(204, 0, 0));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        help = new JButton("Βοήθεια");
        help.setBounds(1100, 600, 200, 50);
        help.setFont(new Font("MACHINE", Font.PLAIN, 22));
        help.setBackground(new Color(204, 0, 0));
        help.setForeground(Color.WHITE);
        help.addActionListener(this);
        add(help);
        
        submit = new JButton("Ολοκλήρωση");
        submit.setBounds(1100, 700, 200, 50);
        submit.setFont(new Font("MACHINE", Font.PLAIN, 22));
        submit.setBackground(new Color(204, 0, 0));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);
            
            answer_given = 1;
            if (options.getSelection() == null) {
               studentAnswers[count][0] = "";
            } else {
                studentAnswers[count][0] = options.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == help) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                option2.setEnabled(false);
                option3.setEnabled(false);
            } else {
                option1.setEnabled(false);
                option4.setEnabled(false);
            }
            help.setEnabled(false);
        } else if (ae.getSource() == submit) {
            answer_given = 1;
            if (options.getSelection() == null) {
                studentAnswers[count][0] = "";
            } else {
                studentAnswers[count][0] = options.getSelection().getActionCommand();
            }

            for (int i = 0; i < studentAnswers.length; i++) {
                if (studentAnswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Χρόνος:" + timer + " δευτ.";
        g.setColor(Color.RED);
        g.setFont(new Font("MACHINE", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1110, 520);
        } else {
            g.drawString("Ο χρόνος τελείωσε!", 1085, 520);
        }
        
        timer--; 
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (answer_given == 1) {
            answer_given = 0;
            timer = 30;
        } else if (timer < 0) {
            timer = 30;
            option1.setEnabled(true);
            option2.setEnabled(true);
            option3.setEnabled(true);
            option4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { 
                if (options.getSelection() == null) {
                   studentAnswers[count][0] = "";
                } else {
                    studentAnswers[count][0] = options.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < studentAnswers.length; i++) {
                    if (studentAnswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { 
                if (options.getSelection() == null) {
                   studentAnswers[count][0] = "";
                } else {
                    studentAnswers[count][0] = options.getSelection().getActionCommand();
                }
                count++; 
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        if (count<1){
            level.setText("ΚΕΦΑΛΑΙΟ 1");
            warning.setText("ΚΑΛΗ ΕΠΙΤΥΧΙΑ!");
	}
        else if (count<4){
            level.setText("ΚΕΦΑΛΑΙΟ 1");
            warning.setText("");
	}
        else if(count<8){
            level.setText("ΚΕΦΑΛΑΙΟ 2");
            warning.setText("ΑΥΤΟ ΤΟ ΚΕΦΑΛΑΙΟ ΕΙΝΑΙ ΠΙΟ ΔΥΣΚΟΛΟ");
	}
	else{
            level.setText("ΚΕΦΑΛΑΙΟ 3");
            warning.setText("ΒΑΛΕ ΤΑ ΔΥΝΑΤΑ ΣΟΥ! ΤΕΛΕΥΤΑΙΟ ΚΑΙ ΠΙΟ ΔΥΣΚΟΛΟ ΚΕΦΑΛΑΙΟ");
        }
        
        if(count==2){
            tips.setText("Tip: ΕΚΠ=ο μικρότερος ακέραιος που διαιρείται ακριβώς με όλους τους δεδομένους αριθμούς");
        }
        else if(count==3){
            tips.setText("Tip: Κύβος του 2 υπολογίζεται ως 2*2*2=8");
        }
        else if(count==7){
            tips.setText("Tip: Βρείτε πρώτα πόσο κοστίζει το ένα κιλό");
        }
        else if(count==8 || count==9){
            tips.setText("Tip: Βρείτε πρώτα πόσο είναι το 10%");
        }
        else{
            tips.setText("");
        }
        qNumber.setText("Ερώτηση " + (count + 1) + ". ");
        question.setText(questions[count][0]);
        option1.setText(questions[count][1]);
        option1.setActionCommand(questions[count][1]);
        
        option2.setText(questions[count][2]);
        option2.setActionCommand(questions[count][2]);
        
        option3.setText(questions[count][3]);
        option3.setActionCommand(questions[count][3]);
        
        option4.setText(questions[count][4]);
        option4.setActionCommand(questions[count][4]);
        
        options.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}
