package student_login_information;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class frame1 {

	private JFrame frame;
private JLabel labelmessage;
private JTextField textField1;
private JTextField textField2;
private JLabel lblNewLabel;
private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {

	
			public void actionPerformed(ActionEvent e) {
				String email=textField1.getText();
				String pass=textField2.getSelectedText();
				JOptionPane.showMessageDialog(null,"welcome.");
			
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setBounds(145, 190, 168, 30);
		frame.getContentPane().add(btnNewButton);
		
		labelmessage = new JLabel("Welcome");
		labelmessage.setFont(new Font("Tahoma", Font.BOLD, 16));
		labelmessage.setBounds(184, 11, 88, 30);
		frame.getContentPane().add(labelmessage);
		
		textField1 = new JTextField();
		textField1.setBounds(24, 72, 248, 30);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(24, 128, 248, 39);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(24, 50, 88, 19);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(24, 113, 126, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
