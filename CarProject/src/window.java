import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window frame = new window();
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
	public window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblSelectAMake = new JLabel("Select a make");
		panel.add(lblSelectAMake);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(84, 134, 102, 23);
		panel_1.add(btnNewButton_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(10, 11, 81, 23);
		panel_1.add(btnBack);
		
		JLabel lblChooseTariff = new JLabel("Choose tariff:");
		lblChooseTariff.setBounds(10, 134, 81, 23);
		panel_1.add(lblChooseTariff);
		
		JButton button = new JButton("New button");
		button.setBounds(84, 163, 102, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(10, 234, 454, 32);
		panel_1.add(button_1);
		
		JLabel lblMonthlyPayment = new JLabel("Monthly Payment:");
		lblMonthlyPayment.setBounds(288, 85, 93, 20);
		panel_1.add(lblMonthlyPayment);
		
		JLabel lblTotalPrice = new JLabel("Total price:");
		lblTotalPrice.setBounds(288, 172, 93, 14);
		panel_1.add(lblTotalPrice);
		
		JLabel lblDeposit = new JLabel("Deposit amount:");
		lblDeposit.setBounds(288, 55, 93, 20);
		panel_1.add(lblDeposit);
		
		JLabel lblInterest = new JLabel("Total Interest:");
		lblInterest.setBounds(288, 113, 93, 20);
		panel_1.add(lblInterest);
		
		JLabel lblFinalPayment = new JLabel("Final Payment:");
		lblFinalPayment.setBounds(288, 144, 93, 14);
		panel_1.add(lblFinalPayment);
		
		JLabel lblNewLabel = new JLabel("Chosen contract: TYPE (bold)");
		lblNewLabel.setBounds(288, 30, 176, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblPleaseChooseA = new JLabel("Please choose a tariff:");
		lblPleaseChooseA.setBounds(10, 106, 176, 14);
		panel_1.add(lblPleaseChooseA);
	}
}
