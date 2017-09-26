package com.gmail.developer.mpm;

import java.awt.FlowLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.JFrame; 
import javax.swing.JTextField; 
import javax.swing.JPasswordField; 
import javax.swing.JOptionPane;

public class TextFieldFrame extends JFrame {
	private final JTextField textField1;
	private final JTextField textField2;
	private final JTextField textField3;
	private final JPasswordField passwordField;
	
	public TextFieldFrame() {
		super("Testing JTextField and JPasswordField"); 
		setLayout(new FlowLayout()); 
		
		textField1 = new JTextField(10);
		add(textField1); // add textField1 to JFrame 
		
		textField2 = new JTextField("Enter text here");
		add(textField2); // add textField2 to JFrame 
		
		textField3 = new JTextField("Uneditable text field", 21);
		textField3.setEditable(false);
		add(textField3); // add textField3 to JFrame

		passwordField = new JPasswordField("Hidden Text");
		add(passwordField);
		
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	
	private class TextFieldHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String string = "";
			
			if (e.getSource() == textField1)
				string = String.format("textField1: %s", e.getActionCommand() );
			
			else if (e.getSource() == textField2)
				string = String.format("textField2: %s", e.getActionCommand() );
			
			else if (e.getSource() == textField3)
				string = String.format("textField3: %s", e.getActionCommand() );
			
			else if (e.getSource() == passwordField)
				string = String.format("passwordField: %s", e.getActionCommand() );
			
			JOptionPane.showMessageDialog(null, string);
		}
		
	}
}

