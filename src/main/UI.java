package main;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class UI extends JFrame {

	JPanel panel, panel_6,panel_1,panel_9 ,  panel_10,panel_11, panel_12,panel_13,panel_14,panel_4,panel_5 , panel_2 ,panel_21,panel_7,panel_8,panel_3,panel_15,panel_16,panel_17,panel_18 ,panel_19 ,panel_20;
	JButton btnSignUp, btnSignIn, btnWorld, btnBusiness,btnSports,btnScience,btnTechnology,btnEntertainment,btnTopNews,btnMostRead,btnThisWeek,btnPrimeTime,btnEducation,btnMoney,btnTravel,btnHealth,btnPolitics,btnMagazine;
	JLabel lblNewUser,lblAlreadyRegistered,lblNewsWorld, label_2,label_3,label_4, label_5,label_6,label_7,lblNewLabel, label_14,label,label_1,label_8,label_9,label_10 ,label_11 ,label_12 ,label_13;
	
	
	UI(){
	 

		
		getContentPane().setBackground(new Color(0, 0, 0));
	    setSize(new Dimension(1367, 740));
		getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(10, 11, 1331, 111);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(204, 255, 102));
		panel_6.setBounds(1038, 5, 283, 101);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.setBackground(new Color(255, 255, 102));
		btnSignUp.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignUp.setBounds(182, 55, 89, 23);
		panel_6.add(btnSignUp);
		
		lblNewUser = new JLabel("New User?");
		lblNewUser.setBounds(81, 57, 120, 19);
		panel_6.add(lblNewUser);
		
		btnSignIn = new JButton("Sign In");
		btnSignIn.setBackground(new Color(255, 255, 102));
		btnSignIn.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnSignIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignIn.setBounds(182, 21, 89, 23);
		panel_6.add(btnSignIn);
		
		lblAlreadyRegistered = new JLabel("Already Registered?");
		lblAlreadyRegistered.setBounds(52, 22, 120, 21);
		panel_6.add(lblAlreadyRegistered);
		
		lblNewsWorld = new JLabel("News World");
		lblNewsWorld.setForeground(new Color(0, 128, 128));
		lblNewsWorld.setFont(new Font("Satisfaction", Font.BOLD, 40));
		lblNewsWorld.setBounds(28, 11, 357, 89);
		panel.add(lblNewsWorld);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(10, 321, 1331, 180);
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 6, 0, 0));
		
		panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 0, 0));
		panel_9.setLayout(null);
		panel_1.add(panel_9);
		
		btnWorld = new JButton("World");
		btnWorld.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnWorld.setBounds(66, 157, 89, 23);
		panel_9.add(btnWorld);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_2.setBounds(32, 0, 156, 156);
		panel_9.add(label_2);
		
		panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 0, 0));
		panel_10.setLayout(null);
		panel_1.add(panel_10);
		
		btnBusiness = new JButton("Business");
		btnBusiness.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBusiness.setBounds(66, 157, 89, 23);
		panel_10.add(btnBusiness);
		
		label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_3.setBounds(32, 0, 156, 156);
		panel_10.add(label_3);
		
		panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 0, 0));
		panel_11.setLayout(null);
		panel_1.add(panel_11);
		
		btnSports = new JButton("Sports");
		btnSports.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSports.setBounds(66, 157, 89, 23);
		panel_11.add(btnSports);
		
		label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_4.setBounds(32, 0, 156, 156);
		panel_11.add(label_4);
		
		panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 0, 0));
		panel_12.setLayout(null);
		panel_1.add(panel_12);
		
		btnScience = new JButton("Politics");
		btnScience.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnScience.setBounds(66, 157, 89, 23);
		panel_12.add(btnScience);
		
		label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_5.setBounds(32, 0, 156, 156);
		panel_12.add(label_5);
		
		panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 0, 0));
		panel_13.setLayout(null);
		panel_1.add(panel_13);
		
		btnTechnology = new JButton("Technology");
		btnTechnology.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTechnology.setBounds(58, 157, 105, 23);
		panel_13.add(btnTechnology);
		
		label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_6.setBounds(32, 0, 156, 156);
		panel_13.add(label_6);
		
		panel_14 = new JPanel();
		panel_14.setBackground(new Color(0, 0, 0));
		panel_14.setLayout(null);
		panel_1.add(panel_14);
		
		btnEntertainment = new JButton("Entertainment");
		btnEntertainment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntertainment.setBounds(48, 157, 125, 23);
		panel_14.add(btnEntertainment);
		
		label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_7.setBounds(32, 0, 156, 156);
		panel_14.add(label_7);
		
		panel_4 = new JPanel();
		panel_4.setBounds(10, 223, 863, -77);
		getContentPane().add(panel_4);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 0));
		panel_5.setBounds(10, 133, 1331, 180);
		getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(0, 4, 0, 0));
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_5.add(panel_2);
		panel_2.setLayout(null);
		
		btnTopNews = new JButton("Top News");
		btnTopNews.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTopNews.setBounds(113, 157, 105, 23);
		panel_2.add(btnTopNews);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		lblNewLabel.setBounds(88, 0, 156, 156);
		panel_2.add(lblNewLabel);
		
		panel_21 = new JPanel();
		panel_21.setBackground(new Color(0, 0, 0));
		panel_21.setLayout(null);
		panel_5.add(panel_21);
		
		btnMostRead = new JButton("Most Read");
		btnMostRead.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMostRead.setBounds(114, 157, 104, 23);
		panel_21.add(btnMostRead);
		
		label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_14.setBounds(88, 0, 156, 156);
		panel_21.add(label_14);
		
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 0, 0));
		panel_7.setLayout(null);
		panel_5.add(panel_7);
		
		btnThisWeek = new JButton("This Week");
		btnThisWeek.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnThisWeek.setBounds(114, 157, 103, 23);
		panel_7.add(btnThisWeek);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label.setBounds(88, 0, 156, 156);
		panel_7.add(label);
		
		panel_8 = new JPanel();
		panel_8.setBackground(new Color(0, 0, 0));
		panel_8.setLayout(null);
		panel_5.add(panel_8);
		
		btnPrimeTime = new JButton("Prime Time");
		btnPrimeTime.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPrimeTime.setBounds(110, 157, 112, 23);
		panel_8.add(btnPrimeTime);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_1.setBounds(88, 0, 156, 156);
		panel_8.add(label_1);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(10, 512, 1331, 180);
		getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 6, 0, 0));
		
		panel_15 = new JPanel();
		panel_15.setBackground(new Color(0, 0, 0));
		panel_15.setLayout(null);
		panel_3.add(panel_15);
		
		btnEducation = new JButton("Education");
		btnEducation.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEducation.setBounds(58, 157, 104, 23);
		panel_15.add(btnEducation);
		
		label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_8.setBounds(32, 0, 156, 156);
		panel_15.add(label_8);
		
		panel_16 = new JPanel();
		panel_16.setBackground(new Color(0, 0, 0));
		panel_16.setLayout(null);
		panel_3.add(panel_16);
		
		btnMoney = new JButton("Money");
		btnMoney.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMoney.setBounds(66, 157, 89, 23);
		panel_16.add(btnMoney);
		
		label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_9.setBounds(32, 0, 156, 156);
		panel_16.add(label_9);
		
		panel_17 = new JPanel();
		panel_17.setBackground(new Color(0, 0, 0));
		panel_17.setLayout(null);
		panel_3.add(panel_17);
		
		btnTravel = new JButton("Travel");
		btnTravel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTravel.setBounds(66, 157, 89, 23);
		panel_17.add(btnTravel);
		
		label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_10.setBounds(32, 0, 156, 156);
		panel_17.add(label_10);
		
		panel_18 = new JPanel();
		panel_18.setBackground(new Color(0, 0, 0));
		panel_18.setLayout(null);
		panel_3.add(panel_18);
		
		btnHealth = new JButton("Health");
		btnHealth.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHealth.setBounds(66, 157, 89, 23);
		panel_18.add(btnHealth);
		
		label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_11.setBounds(32, 0, 156, 156);
		panel_18.add(label_11);
		
		panel_19 = new JPanel();
		panel_19.setBackground(new Color(0, 0, 0));
		panel_19.setLayout(null);
		panel_3.add(panel_19);
		
		btnPolitics = new JButton("Science");
		btnPolitics.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPolitics.setBounds(66, 157, 89, 23);
		panel_19.add(btnPolitics);
		
		label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_12.setBounds(32, 0, 156, 156);
		panel_19.add(label_12);
		
		panel_20 = new JPanel();
		panel_20.setBackground(new Color(0, 0, 0));
		panel_20.setLayout(null);
		panel_3.add(panel_20);
		
		btnMagazine = new JButton("Magazine");
		btnMagazine.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMagazine.setBounds(66, 157, 89, 23);
		panel_20.add(btnMagazine);
		
		label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(UI.class.getResource("/main/nb.jpg")));
		label_13.setBounds(32, 0, 156, 156);
		panel_20.add(label_13);
		
		
		// Registeration
		ButtonHandler b=new ButtonHandler();
		btnWorld.addActionListener(b);
		btnMagazine.addActionListener(b);
		btnScience.addActionListener(b);
		btnPolitics.addActionListener(b);
		btnTechnology.addActionListener(b);
		btnEntertainment.addActionListener(b);
		btnSports.addActionListener(b);
		btnMostRead.addActionListener(b);
		btnPrimeTime.addActionListener(b);
		btnThisWeek.addActionListener(b);
		btnEducation.addActionListener(b);
		btnMoney.addActionListener(b);
		btnTravel.addActionListener(b);
		btnHealth.addActionListener(b);
		btnTopNews.addActionListener(b);
		btnBusiness.addActionListener(b);
		
	}

	

	public class ButtonHandler implements ActionListener{
		
		Rss objrss = new Rss();
		ResultSet rs ;
		public void actionPerformed(ActionEvent e){
			try{
				
				Connection connect= db2Connectivity.dbConnector();
				Statement stmt = connect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
				if(e.getSource()==btnWorld)
				{
					
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME = 'World'");
					while(rs.next())
					{
						objrss.readRSS("World",rs.getString(1));	
						setVisible(false);
					}
					
			     }
				if(e.getSource()==btnBusiness)
				{
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME = 'Business'");
					while(rs.next())
					{
						objrss.readRSS("Business",rs.getString(1));
						setVisible(false);
					}
					
			     }
				if(e.getSource()==btnTopNews)
				{
					
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Top News'");
					while(rs.next())
					{
						objrss.readRSS("Top News",rs.getString(1));
						setVisible(false);
					}
					
			     }
				
				if(e.getSource()==btnSports){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Sports'");
					while(rs.next()){
						objrss.readRSS("Sports",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnPolitics){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Politics'");
					while(rs.next()){
						objrss.readRSS("Politics",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnTechnology){
				    rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Technology'");
					while(rs.next()){
						objrss.readRSS("Technology",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnEntertainment){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Entertainment'");
					while(rs.next()){
						objrss.readRSS("Entertainment",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnEducation){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Education'");
					while(rs.next()){
						objrss.readRSS("Education",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnMoney){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Money'");
					while(rs.next()){
						objrss.readRSS("Money",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnTravel){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Travel'");
					while(rs.next()){
						objrss.readRSS("Travel",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnHealth){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Health'");
					while(rs.next()){
						objrss.readRSS("Health",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnScience){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Science'");
					while(rs.next()){
						objrss.readRSS("Science",rs.getString(1));
						setVisible(false);
							}
				}
				
			
				if(e.getSource()==btnMagazine){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Magazine'");
					while(rs.next()){
						objrss.readRSS("Magazine",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnMostRead){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Most Read Stories'");
					while(rs.next()){
						objrss.readRSS("Most Read Stories",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnPrimeTime){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='Primetime Headlines'");
					while(rs.next()){
						objrss.readRSS("Primetime Headlines",rs.getString(1));
						setVisible(false);
							}
				}
				
				if(e.getSource()==btnThisWeek){
					rs = stmt.executeQuery("select LINK from fields where FIELD_NAME='This Week Headlines'");
					while(rs.next()){
						objrss.readRSS("This Week Headlines",rs.getString(1));
						setVisible(false);
							}
				}
			}
			catch(Exception m){
				System.out.println("ERROR");
			}
		}
	
	}
	
	
		
	
}
