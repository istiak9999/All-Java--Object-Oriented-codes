package CalculatorGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator_GUI_desgine {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldans;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_GUI_desgine window = new Calculator_GUI_desgine();
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
	public Calculator_GUI_desgine() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(-3, 11, 205, 36);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(212, 11, 212, 37);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2;
				float ans;
				try {
				num1=Integer.parseInt(textField1.getText());
				num2=Integer.parseInt(textField2.getText());
				ans=num1+num2; 
				textFieldans.setText(Float.toString(ans));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,"Please enter valid number");
				}
			}
		});
		btnNewButton.setBounds(20, 58, 166, 36);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Substract");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2;
				float ans;
				try {
				num1=Integer.parseInt(textField1.getText());
				num2=Integer.parseInt(textField2.getText());
				ans=num1-num2; 
				textFieldans.setText(Float.toString(ans));
				} catch (Exception e4) {
					JOptionPane.showMessageDialog(null,"Please enter valid number");
				}
			}
		});
		btnNewButton_1.setBounds(241, 58, 166, 36);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldans = new JTextField();
		textFieldans.setBounds(208, 196, 182, 49);
		frame.getContentPane().add(textFieldans);
		textFieldans.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The answer is");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblNewLabel.setBounds(40, 200, 158, 44);
		frame.getContentPane().add(lblNewLabel);
		
		btnNewButton_2 = new JButton("Multiple");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2;
				float ans;
				try {
				num1=Integer.parseInt(textField1.getText());
				num2=Integer.parseInt(textField2.getText());
				ans=num1*num2; 
				textFieldans.setText(Float.toString(ans));
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null,"Please enter valid number");
				}
			}
		});
		btnNewButton_2.setBounds(20, 122, 166, 36);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Devider");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2;
				float ans;
				try {
				num1=Integer.parseInt(textField1.getText());
				num2=Integer.parseInt(textField2.getText());
				 ans=num1/num2; 
				textFieldans.setText(Float.toString(ans));
				} catch (Exception e7) {
					JOptionPane.showMessageDialog(null,"Please enter valid number");
				}
			}
		});
		btnNewButton_3.setBounds(249, 122, 158, 36);
		frame.getContentPane().add(btnNewButton_3);
	}

}
