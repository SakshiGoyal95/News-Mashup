package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class NewsResult extends JFrame {
	JButton btnback;
	UI u;
	
	NewsResult(String s){
		getContentPane().setBackground(new Color(0, 0, 0));
	    setSize(new Dimension(1367, 740));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(10, 11, 1331, 111);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(204, 255, 102));
		panel_6.setBounds(1038, 5, 283, 101);
		panel.add(panel_6);
		panel_6.setLayout(null);
				
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(new Color(255, 255, 102));
		btnSignUp.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignUp.setBounds(182, 55, 89, 23);
		panel_6.add(btnSignUp);
		
		JLabel lblNewUser = new JLabel("New User?");
		lblNewUser.setBounds(81, 57, 120, 19);
		panel_6.add(lblNewUser);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBackground(new Color(255, 255, 102));
		btnSignIn.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnSignIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignIn.setBounds(182, 21, 89, 23);
		panel_6.add(btnSignIn);
		
		JLabel lblAlreadyRegistered = new JLabel("Already Registered?");
		lblAlreadyRegistered.setBounds(52, 22, 120, 21);
		panel_6.add(lblAlreadyRegistered);
		

		btnback = new JButton("Back");
		btnback.setBackground(new Color(204, 255, 102));
		btnback.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnback.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnback.setBounds(10, 4, 70, 30);
		panel.add(btnback);
		
		JLabel lblNewsWorld = new JLabel("News World");
		lblNewsWorld.setForeground(new Color(0, 128, 128));
		lblNewsWorld.setFont(new Font("Satisfaction", Font.BOLD, 40));
		lblNewsWorld.setBounds(28, 11, 357, 89);
		panel.add(lblNewsWorld);
		

		TextArea textArea = new TextArea();
		textArea.setBounds(80, 178, 1185, 474);
		getContentPane().add(textArea);
		textArea.setText(s);
		textArea.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		ButtonHandler bh = new ButtonHandler();
		btnback.addActionListener(bh);
	}
	
public class ButtonHandler implements ActionListener{
				
		public void actionPerformed(ActionEvent e){
			try{
				if(e.getSource()==btnback)
					setVisible(false);
					u = new UI();
					u.setVisible(true);
					u.setDefaultCloseOperation(UI.EXIT_ON_CLOSE);
				
			}
			catch(Exception ex){
				
			}
		}
}

}
