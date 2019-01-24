import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
	
	
	
	
	
	
public static void main(String[] args) {

BinaryConverter b = new BinaryConverter();
b.makeGui();
	
	
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton();
JTextField text = new JTextField(20);
JTextField text1 = new JTextField(20);
JLabel label = new JLabel();

 void makeGui() {
	 
	
	frame.add(panel);
	panel.add(button);
	panel.add(text1);
	button.setText("Convert");
	panel.add(text);
	frame.setVisible(true);
	panel.add(text);
	text.setText("test");
	button.addActionListener(this);
	
	
	
	
}






@Override
public void actionPerformed(ActionEvent arg0) {
	String answer;
	answer = text.getText();
	String convertion = convert(answer);
	text1.setText(convertion);
}
}
