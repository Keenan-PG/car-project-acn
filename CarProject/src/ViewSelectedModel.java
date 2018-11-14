import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewSelectedModel extends JFrame {
	// Variables gan 'ere
	
	String make;
	String model;
	Double fullPrice;
	
	JPanel container;
	JPanel panel1;
	JPanel panel2;
	
	JLabel title; // make and model 
	JLabel tarrifTitleLbl;
	JLabel chooseTariffLbl;
	JLabel chosenContractLbl;
	JLabel depositAmountLbl;
	JLabel totalPriceLbl;

	JButton backBtn;
	JButton choosePCP;
	JButton choosePCH;
	JButton submitPurchase;
	
	CarModel m_PastModel1;
	CarModel m_PastModel2;
	CarModel m_PastModel3;
	
	//Constructor gan 'ere
	public ViewSelectedModel(CarModel selectedModel, CarModel pastModel1, CarModel pastModel2, CarModel pastModel3) {

		// Car info
		this.make = selectedModel.make; // assigning object price value to make
		this.model = selectedModel.modelName; // assigning object price value to model
		this.fullPrice = selectedModel.price; // assigning object price value to fullPrice
		
		// passing models back to old screen
		m_PastModel1 = pastModel1;
		m_PastModel2 = pastModel2;
		m_PastModel3 = pastModel3;

		
		// Initialising frame
		this.setBounds(100,100,500,350);
		InitializeComponents();
		this.setVisible(true);
	}
	
	// Methods gan 'ere 
	public void InitializeComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit program on close button
		container = new JPanel(); //Instantiating new JPanel object
		container.setBorder(new EmptyBorder(5, 5, 5, 5)); // setting border
		container.setLayout(new BorderLayout(0, 0)); // setting layout
		setContentPane(container); //setting content pane to panel
		
		/*
		 * PANEL 1 (HEAD)
		 */
		
		panel1 = new JPanel();
		getContentPane().add(panel1, BorderLayout.NORTH);
		
		
		/*
		 * ADDING TITLE TO PANEL 1
		 */
		
		title = new JLabel(); //Instantiating new JLabel object
		title.setText("Purchase a " + make + " " + model); 
		panel1.add(title);
		
		
		/*
		 * PANEL 2 (MID)
		 */
		
		panel2 = new JPanel();
		getContentPane().add(panel2, BorderLayout.CENTER);
		panel2.setLayout(null);
		
		/*
		 * BUTTONS (PANEL 2) 
		 */
		
		//Back button
		backBtn = new JButton();
		backBtn.setText("< Back");
		backBtn.setBounds(10, 11, 80, 25);
		backBtn.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new ViewSelectedModels(m_PastModel1, m_PastModel2, m_PastModel3);
					setVisible(false);
				}
			}
		);
		panel2.add(backBtn);

		// Choose a tariff
		tarrifTitleLbl = new JLabel("Please choose a tariff:");
		tarrifTitleLbl.setBounds(10, 106, 176, 14);
		panel2.add(tarrifTitleLbl);
		
		// Choose tariff label
		chooseTariffLbl = new JLabel("Tariff types:");
		chooseTariffLbl.setBounds(10, 134, 81, 23);
		panel2.add(chooseTariffLbl);
		
		// PCP button
		choosePCP = new JButton("PCP");
		choosePCP.setBounds(84, 134, 102, 23);
		panel2.add(choosePCP);
		
		// PCH button
		choosePCH = new JButton("PCH");
		choosePCH.setBounds(84, 163, 102, 23);
		panel2.add(choosePCH);
		
		// Chosen contact label 
		chosenContractLbl  = new JLabel("Chosen contract:");
		chosenContractLbl.setBounds(288, 30, 176, 14);
		panel2.add(chosenContractLbl);
		
		// Deposit amount label
		depositAmountLbl  = new JLabel("Deposit amount:");
		depositAmountLbl.setBounds(288, 55, 93, 20);
		panel2.add(depositAmountLbl);
		
		// Total Price Label
		totalPriceLbl  = new JLabel("Total price:");
		totalPriceLbl.setBounds(288, 172, 93, 14);
		panel2.add(totalPriceLbl);
		
		// Monthly Payment Label
		JLabel monthlyPaymentLbl = new JLabel("Monthly Payment:");
		monthlyPaymentLbl.setBounds(288, 85, 100, 20);
		panel2.add(monthlyPaymentLbl);
		
		// Total interest label
		JLabel totalInterestLbl = new JLabel("Total Interest:");
		totalInterestLbl.setBounds(288, 113, 93, 20);
		panel2.add(totalInterestLbl);
		
		// Final Payment Label
		JLabel finalPaymentLbl = new JLabel("Final Payment:");
		finalPaymentLbl.setBounds(288, 144, 93, 14);
		panel2.add(finalPaymentLbl);
		
		// Submit Button
		JButton sumbitBtn = new JButton("Submit");
		sumbitBtn.setBounds(10, 234, 454, 32);
		panel2.add(sumbitBtn);
	}
}