package extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	public static void main(String[] args) {
		//don't add anything else to main
		BinaryConverter bc = new BinaryConverter();
		bc.createUI();
	}
		    JFrame frame = new JFrame();
          JPanel panel = new JPanel();
          JTextField text = new JTextField(90);
          JLabel label = new JLabel();
          JButton button = new JButton();
          
          void createUI () {
        	  frame.setVisible(true);
        	  frame.add(panel);
        	  panel.add(text);
        	  panel.add(label);
        	  panel.add(button);
        	  button.setText("Click Me");
        	  
        	  frame.pack();
          }
          
          
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
	
}

