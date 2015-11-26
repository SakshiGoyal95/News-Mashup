package news_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;

import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
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

public class UserWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserWindow window = new UserWindow();
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
	public UserWindow() {
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
		
		JLabel lblHey = new JLabel("Hey ");
		lblHey.setBounds(10, 11, 46, 14);
		panel_6.add(lblHey);
		
		JLabel lblNewsWorld = new JLabel("News World");
		lblNewsWorld.setForeground(new Color(0, 128, 128));
		lblNewsWorld.setFont(new Font("Satisfaction", Font.BOLD, 40));
		lblNewsWorld.setBounds(121, 11, 357, 89);
		panel.add(lblNewsWorld);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(UserWindow.class.getResource("/news_GUI/img/Title.gif")));
		lblNewLabel_1.setBounds(10, 5, 101, 101);
		panel.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 223, 863, -77);
		frame.getContentPane().add(panel_4);
	}
}
