package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel(" Αυτός είναι ο σκοπός και ο τρόπος παιχνιδιού:");
        heading.setBounds(10, 10, 700, 35);
        heading.setFont(new Font("MACHINE", Font.BOLD, 28));
        heading.setForeground(new Color(204, 0, 0));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 40, 700, 500);
        rules.setFont(new Font("MACHINE", Font.PLAIN, 21));
        rules.setText(
            "<html>"+
				"Αυτό το κουίζ είναι σχεδιασμένο για μαθητές της έκτης δημοτικού. " +
                                "Σκοπός του είναι η προετοιμασία των μαθητών για το γυμνάσιο, καθώς και η επιτυχής " +
                                "ολοκλήρωση του δημοτικού έχοντας τις απαραίτητες γνώσεις. " +
				"Περιλαμβάνει ερωτήσεις Μαθηματικών διάφορων δυσκολιών. " + 
                                "Υπάρχουν 3 κεφάλαια με το τρίτο να είναι το πιο δύσκολο και το δεύτερο " + 
                                "ελαφρώς πιο δύσκολο από το πρώτο. " + 
                                "Ο μαθητής θεωρείται έτοιμος για το γυμνάσιο εφόσον το σκορ του είναι " + 
                                "μεγαλύτερο του 70 " + "<br><br>" +
				"Τρόπος παιχνιδιού:"+ "<br>" +
                                "1.Υπάρχουν 10 ερωτήσεις επιλογής." +"<br>" +
                                "2.Κάθε σωστή απάντηση ισούται με 10 βαθμούς." +"<br>" +
                                "3.Υπάρχει δυνατότητα για μία βοήθεια σε όλο το κουίζ. Με την βοήθεια αυτή αποκλείονται 2 λάθος απαντήσεις."  +"<br>" +
                                "4.Εάν τελειώσει ο χρόνος που απομένει (30 δευτερόλεπτα) τότε αυτόματα χάνεται η ερώτηση και εμφανίζεται η επόμενη." +"<br>" +
                                "5.Υπάρχει μόνο μία σωστή απάντηση." +
                    
            "<html>"
        );
        add(rules);
        
        back = new JButton("Πίσω");
        back.setBounds(250, 530, 100, 50);
        back.setBackground(new Color(204, 0, 0));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Ξεκίνα");
        start.setBounds(400, 530, 100, 50);
        start.setBackground(new Color(204, 0, 0));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
