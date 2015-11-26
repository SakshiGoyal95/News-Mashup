package news_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField nameFld;
	private JTextField emailFld;
	private JPasswordField pwdFld;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 394);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(240, 255, 255));
		panel_1.setBounds(10, 11, 481, 111);
		contentPane.add(panel_1);
		
		JLabel label_2 = new JLabel("News World");
		label_2.setForeground(new Color(0, 128, 128));
		label_2.setFont(new Font("Satisfaction", Font.BOLD, 40));
		label_2.setBounds(143, 11, 335, 89);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(SignUp.class.getResource("/news_GUI/img/Title.gif")));
		label_3.setBounds(10, 5, 101, 101);
		panel_1.add(label_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 250, 250));
		panel.setBounds(10, 133, 481, 211);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(49, 62, 46, 23);
		panel.add(lblName);
		
		JLabel lblEmailId = new JLabel("Email ID:");
		lblEmailId.setBounds(49, 87, 62, 23);
		panel.add(lblEmailId);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(49, 112, 62, 23);
		panel.add(lblPassword);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(238, 232, 170));
		panel_2.setBounds(10, 0, 461, 40);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewUserSignup = new JLabel("New User Sign Up");
		lblNewUserSignup.setForeground(new Color(128, 0, 0));
		lblNewUserSignup.setFont(new Font("Narkisim", Font.BOLD, 18));
		lblNewUserSignup.setBounds(171, 0, 168, 40);
		panel_2.add(lblNewUserSignup);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				check();
				submit();
				dispose();
			}
		});
		btnSubmit.setBounds(193, 177, 89, 23);
		panel.add(btnSubmit);
		
		JCheckBox chckbxSubscribeMeTo = new JCheckBox("Subscribe me to News World Digests ");
		chckbxSubscribeMeTo.setBackground(new Color(255, 250, 250));
		chckbxSubscribeMeTo.setBounds(43, 142, 386, 23);
		panel.add(chckbxSubscribeMeTo);
		
		nameFld = new JTextField();
		nameFld.setBounds(129, 62, 300, 23);
		panel.add(nameFld);
		nameFld.setColumns(10);
		
		emailFld = new JTextField();
		emailFld.setBounds(129, 87, 300, 23);
		panel.add(emailFld);
		emailFld.setColumns(10);
		
		pwdFld = new JPasswordField();
		pwdFld.setBounds(129, 112, 300, 23);
		panel.add(pwdFld);
	}

public void submit()
{
     try
    {
    Class.forName("com.ibm.db2.jcc.DB2Driver");
Connection conn = null;
conn =      (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/prats","LENOVO","2517");
//Get a statement from the connection
Statement stmt = (Statement) conn.createStatement() ;





	stmt.executeUpdate("insert into signup values('"+nameFld.getText()+"','"+emailFld.getText()+"','"+pwdFld.getPassword()+"')");
	JOptionPane.showMessageDialog(null, "you have been signed up");
stmt.close() ;


conn.close() ;

    }
    catch(Exception ex)
    {
      // JOptionPane.showMessageDialog(null, "error in connectivity");
    }

}

public void check()
{
     try
    {
    Class.forName("com.ibm.db2.jcc.DB2Driver");
Connection conn = null;
conn =      (Connection) DriverManager.getConnection("jdbc:db2://localhost:50000/prats","LENOVO","2517");
//Get a statement from the connection
Statement stmt = (Statement) conn.createStatement() ;


ResultSet rs;
rs=stmt.executeQuery("select * from signup");
boolean flag=false;
while(rs.next())
{
	if(emailFld.getText().equals(rs.getString(2)) || nameFld.getText().equals(rs.getString(1))  )
	{
		flag=true;
		 JOptionPane.showMessageDialog(null, "Your username or email id is already occupied by someone else");
		//System.out.println("your username or email id is already occupied");
		 new SignUp().setVisible(true);
		System.out.println("run");
		
	}

		
	
		
}

	
// Execute the query

// Close the result set, statement and the connection


	
stmt.close() ;


conn.close() ;
rs.close();
    }
    catch(Exception ex)
    {
       JOptionPane.showMessageDialog(null, "error in connectivity");
    }

}


}

