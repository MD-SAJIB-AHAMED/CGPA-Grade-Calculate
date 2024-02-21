package Calculator;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Calculate extends JFrame implements ActionListener {

    Container c;
    JLabel textLabel, label1, numLabel, creLabel,grade;
    JTextArea textArea;
    Button button1,button2;
    JTextField text, text1,text2;
    JPanel panel;
    Font font, font1;
    ImageIcon img;

    Calculate() {
        c = this.getContentPane();
        c.setBackground(Color.gray);
        c.setLayout(null);
        
        img = new ImageIcon("D:\\My Projects\\Java Projects\\My_Java_Projects\\src\\main\\java\\Calculator\\icon.png");
        this.setIconImage(img.getImage());

        font = new Font("Bodone MT", Font.BOLD, 16);
        font1 = new Font("Bodone MT", Font.BOLD, 14);

        label1 = new JLabel("CGPA Grade Calculator");
        label1.setBounds(150, 10, 250, 30);
        label1.setForeground(Color.white);
        label1.setFont(font);
        c.add(label1);
        
        numLabel = new JLabel("Enter Your Mark:");
        //numLabel.setBounds(10, 60, 150, 30);
        numLabel.setForeground(Color.black);
        numLabel.setFont(font);
 
        creLabel = new JLabel("Enter Your Credit:");
       // creLabel.setBounds(10, 100, 150, 30);
        creLabel.setForeground(Color.black);
        creLabel.setFont(font);
        
        grade = new JLabel("You Grade: ");
       // creLabel.setBounds(10, 100, 150, 30);
        grade.setForeground(Color.black);
        grade.setFont(font);
        
        text = new JTextField(8);
        //text.setBounds(160, 60, 60, 30);
        text.setFont(font);
       // text.addActionListener(this);
        
        text1 = new JTextField(8);
        //text1.setBounds(160, 100, 60, 30);
        text1.setFont(font);
       // text1.addActionListener(this);
        
        text2 = new JTextField(8);
        //text1.setBounds(160, 100, 60, 30);
        text2.setFont(font);
        //text2.addActionListener(this);
        
        button1 = new Button("SUBMIT");
       // button1.setBounds(200, 160, 70, 30);
        //button1.setBackground(Color.green);
        button1.addActionListener(this);
        
        button2 = new Button("Clear");
       // button1.setBounds(200, 160, 70, 30);
        //button1.setBackground(Color.green);
        button2.addActionListener(this);
       

        panel = new JPanel();
        panel.setBounds(115, 70, 265, 270);
        panel.setBackground(Color.gray);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT,75,10));
        panel.add(numLabel);
        panel.add(text);
        panel.add(creLabel);
        panel.add(text1);
        panel.add(button1);
        panel.add(grade);
        panel.add(text2);
        panel.add(button2);
        

     c.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        


        String value1 = text.getText();
        String value2 = text1.getText();

                if (value1.isEmpty() && value2.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Enter Mark or Credit", "Error", JOptionPane.ERROR_MESSAGE);
                } else {

                    double num = Double.parseDouble(value1);
                    double num1 = Double.parseDouble(value2);
                    

                   if(num1==3){

                        if (num >= 60) {
                            text2.setText("         \"A+\"");
                        } else if (num >= 56.25 && num < 60) {
                            text2.setText("         \"A\"");
                        } else if (num >= 52.5 && num < 56.25) {
                            text2.setText("         \"A-\"");
                        } else if (num >= 48.75 && num < 52.5) {
                            text2.setText("         \"B+\"");
                        } else if (num >= 45 && num < 48.75) {
                            text2.setText("         \"B\"");
                        } else if (num >= 41.25 && num < 45) {
                            text2.setText("         \"B-\"");
                        } else if (num >= 37.5 && num < 41.25) {
                            text2.setText("         \"C+\"");
                        } else if (num >= 33.75 && num < 37.5) {
                            text2.setText("         \"C\"");
                        } else if (num >= 30 && num < 33.75) {
                            text2.setText("         \"D\"");
                        } else {
                            text2.setText("         \"F\"");
                        }
                   }
                   else if(num1==2){
                        if (num >= 40) {
                            text2.setText("   \"A+\"");
                        } else if (num >= 37.5 && num < 40) {
                            text2.setText("   \"A\"");
                        } else if (num >= 35 && num < 37.5) {
                            text2.setText("   \"A-\"");
                        } else if (num >= 32.5 && num < 35) {
                            text2.setText("   \"B+\"");
                        } else if (num >= 30 && num < 32.5) {
                            text2.setText("   \"B\"");
                        } else if (num >= 27.5 && num < 30) {
                            text2.setText("   \"B-\"");
                        } else if (num >= 25 && num < 27.5) {
                            text2.setText("   \"C+\"");
                        } else if (num >= 22.5 && num < 25) {
                            text2.setText("   \"C\"");
                        } else if (num >= 20 && num < 22.5) {
                            text2.setText("   \"D\"");
                        } else {
                            text2.setText("   \"F\"");
                        }

                   }
                   else if(num1==1){
                       if (num >= 20) {
                            text2.setText("   \"A+\"");
                        } else if (num >= 18.75 && num < 20) {
                            text2.setText("   \"A\"");
                        } else if (num >= 17.5 && num < 18.75) {
                            text2.setText("   \"A-\"");
                        } else if (num >= 16.25 && num < 17.5) {
                            text2.setText("   \"B+\"");
                        } else if (num >= 15 && num < 16.25) {
                            text2.setText("   \"B\"");
                        } else if (num >= 13.75 && num < 15) {
                            text2.setText("   \"B-\"");
                        } else if (num >= 12.5 && num < 13.75) {
                            text2.setText("   \"C+\"");
                        } else if (num >= 11.25 && num < 12.5) {
                            text2.setText("   \"C\"");
                        } else if (num >= 10 && num < 11.25) {
                            text2.setText("   \"D\"");
                        } else {
                            text2.setText("   \"F\"");
                        }

                   }
                  else{
                        JOptionPane.showMessageDialog(null, "Enter Credit 3/2/1", "Error", JOptionPane.ERROR_MESSAGE);
                   }
                  
            }
           if (e.getSource() == button2) {
            text.setText("");
            text1.setText("");
            text2.setText("");   
           }
        }

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
}

public class CGPA {

    public static void main(String[] args) {
        Calculate frame = new Calculate();
        frame.setTitle("CGPA Calculator");
        frame.setBounds(400, 250, 500, 560);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

    }
}
