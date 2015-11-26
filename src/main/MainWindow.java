package news_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;

import javax.swing.JLabel;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
public class MainWindow 
{

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setSize(new Dimension(1367, 740));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(10, 11, 1331, 111);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(204, 255, 102));
		panel_6.setBounds(1038, 5, 283, 101);
		panel.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new SignUp().setVisible(true);//You have clicked on Sign Up. What next?
			}
		});
		btnSignUp.setBackground(new Color(255, 255, 102));
		btnSignUp.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignUp.setBounds(182, 55, 89, 23);
		panel_6.add(btnSignUp);
		
		JLabel lblNewUser = new JLabel("New User?");
		lblNewUser.setBounds(81, 57, 120, 19);
		panel_6.add(lblNewUser);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new SignIn().frame.setVisible(true);//You have clicked on Sign In. What next?
			}
		});
		btnSignIn.setBackground(new Color(255, 255, 102));
		btnSignIn.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnSignIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignIn.setBounds(182, 21, 89, 23);
		panel_6.add(btnSignIn);
		
		JLabel lblAlreadyRegistered = new JLabel("Already Registered?");
		lblAlreadyRegistered.setBounds(52, 22, 120, 21);
		panel_6.add(lblAlreadyRegistered);
		
		JLabel lblNewsWorld = new JLabel("News World");
		lblNewsWorld.setForeground(new Color(0, 128, 128));
		lblNewsWorld.setFont(new Font("Satisfaction", Font.BOLD, 40));
		lblNewsWorld.setBounds(121, 11, 357, 89);
		panel.add(lblNewsWorld);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Title.gif")));
		lblNewLabel_1.setBounds(10, 5, 101, 101);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(10, 214, 1331, 208);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 6, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(0, 0, 0));
		panel_9.setLayout(null);
		panel_1.add(panel_9);
		
		JButton btnWorld = new JButton("World");
		btnWorld.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnWorld.setBounds(66, 167, 89, 23);
		panel_9.add(btnWorld);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/World.jpg")));
		label_2.setBounds(32, 0, 156, 156);
		panel_9.add(label_2);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(0, 0, 0));
		panel_10.setLayout(null);
		panel_1.add(panel_10);
		
		JButton btnBusiness = new JButton("Business");
		btnBusiness.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBusiness.setBounds(66, 167, 89, 23);
		panel_10.add(btnBusiness);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Business.jpg")));
		label_3.setBounds(32, 0, 156, 156);
		panel_10.add(label_3);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 0, 0));
		panel_11.setLayout(null);
		panel_1.add(panel_11);
		
		JButton btnSports = new JButton("Sports");
		btnSports.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSports.setBounds(66, 167, 89, 23);
		panel_11.add(btnSports);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Sports.jpg")));
		label_4.setBounds(32, 0, 156, 156);
		panel_11.add(label_4);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(0, 0, 0));
		panel_12.setLayout(null);
		panel_1.add(panel_12);
		
		JButton btnScience = new JButton("Politics");
		btnScience.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnScience.setBounds(66, 167, 89, 23);
		panel_12.add(btnScience);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Politics.jpg")));
		label_5.setBounds(32, 0, 156, 156);
		panel_12.add(label_5);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(0, 0, 0));
		panel_13.setLayout(null);
		panel_1.add(panel_13);
		
		JButton btnTechnology = new JButton("Technology");
		btnTechnology.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTechnology.setBounds(57, 167, 105, 23);
		panel_13.add(btnTechnology);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Technology.jpg")));
		label_6.setBounds(32, 0, 156, 156);
		panel_13.add(label_6);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(0, 0, 0));
		panel_14.setLayout(null);
		panel_1.add(panel_14);
		
		JButton btnEntertainment = new JButton("Entertainment");
		btnEntertainment.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntertainment.setBounds(42, 167, 125, 23);
		panel_14.add(btnEntertainment);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Entertainment.jpg")));
		label_7.setBounds(32, 0, 156, 156);
		panel_14.add(label_7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 223, 863, -77);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 0));
		panel_5.setBounds(10, 133, 1331, 40);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnPrimeTime = new JButton("Prime Time");
		btnPrimeTime.setForeground(new Color(250, 250, 210));
		btnPrimeTime.setFont(new Font("Extreme", Font.BOLD, 20));
		btnPrimeTime.setBackground(new Color(0, 128, 128));
		panel_5.add(btnPrimeTime);
		btnPrimeTime.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JButton btnThisWeek = new JButton("This Week");
		btnThisWeek.setForeground(new Color(250, 250, 210));
		btnThisWeek.setFont(new Font("Extreme", Font.BOLD, 20));
		btnThisWeek.setBackground(new Color(0, 128, 128));
		panel_5.add(btnThisWeek);
		btnThisWeek.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JButton btnMostRead = new JButton("Most Read");
		btnMostRead.setForeground(new Color(250, 250, 210));
		btnMostRead.setFont(new Font("Extreme", Font.BOLD, 20));
		btnMostRead.setBackground(new Color(0, 128, 128));
		panel_5.add(btnMostRead);
		btnMostRead.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMostRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnTopNews = new JButton("Top News");
		btnTopNews.setForeground(new Color(250, 250, 210));
		btnTopNews.setFont(new Font("Extreme", Font.BOLD, 20));
		btnTopNews.setBackground(new Color(0, 128, 128));
		panel_5.add(btnTopNews);
		btnTopNews.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(10, 458, 1331, 208);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 6, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(0, 0, 0));
		panel_15.setLayout(null);
		panel_3.add(panel_15);
		
		JButton btnEducation = new JButton("Education");
		btnEducation.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEducation.setBounds(58, 167, 104, 23);
		panel_15.add(btnEducation);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Education.jpg")));
		label_8.setBounds(32, 0, 156, 156);
		panel_15.add(label_8);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(0, 0, 0));
		panel_16.setLayout(null);
		panel_3.add(panel_16);
		
		JButton btnMoney = new JButton("Money");
		btnMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMoney.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMoney.setBounds(66, 167, 89, 23);
		panel_16.add(btnMoney);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Money.jpg")));
		label_9.setBounds(32, 0, 156, 156);
		panel_16.add(label_9);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(0, 0, 0));
		panel_17.setLayout(null);
		panel_3.add(panel_17);
		
		JButton btnTravel = new JButton("Travel");
		btnTravel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTravel.setBounds(67, 167, 89, 23);
		panel_17.add(btnTravel);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Travel.jpg")));
		label_10.setBounds(32, 0, 156, 156);
		panel_17.add(label_10);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(0, 0, 0));
		panel_18.setLayout(null);
		panel_3.add(panel_18);
		
		JButton btnHealth = new JButton("Health");
		btnHealth.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHealth.setBounds(67, 167, 89, 23);
		panel_18.add(btnHealth);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Health.png")));
		label_11.setBounds(32, 0, 156, 156);
		panel_18.add(label_11);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(0, 0, 0));
		panel_19.setLayout(null);
		panel_3.add(panel_19);
		
		JButton btnScience_1 = new JButton("Science");
		btnScience_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnScience_1.setBounds(66, 167, 89, 23);
		panel_19.add(btnScience_1);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Science.jpg")));
		label_12.setBounds(32, 0, 156, 156);
		panel_19.add(label_12);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(0, 0, 0));
		panel_20.setLayout(null);
		panel_3.add(panel_20);
		
		JButton btnMagazine = new JButton("Magazine");
		btnMagazine.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnMagazine.setBounds(66, 167, 89, 23);
		panel_20.add(btnMagazine);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon(MainWindow.class.getResource("/news_GUI/img/Magazine.jpg")));
		label_13.setBounds(32, 0, 156, 156);
		panel_20.add(label_13);
	}



}

