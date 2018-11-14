import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewSelectedModels extends JFrame {
	// Variables gan 'ere
	String make;
	String carModel1;
	String carModel2;
	String carModel3;
	
	Double price1;
	Double price2;
	Double price3;
	
	JButton firstModel;
	JButton secondModel;
	JButton thirdModel;
	JButton backBtn;
	
	JLabel firstPrice;
	JLabel secondPrice;
	JLabel thirdPrice;
	
	JPanel container;
	JPanel panel1;
	JPanel panel2;
	
	JLabel title;
	
	CarModel m1;
	CarModel m2;
	CarModel m3;
	
	
	//Constructor gan 'ere
	public ViewSelectedModels(CarModel model1, CarModel model2, CarModel model3) {
		
		// Car info
		this.make = model1.make;
		this.price1 = model1.price;
		this.price2 = model2.price;
		this.price3 = model3.price;
		this.carModel1 = model1.modelName;
		this.carModel2 = model2.modelName;
		this.carModel3 = model3.modelName;
		
		// Model variables
		this.m1 = model1;
		this.m2 = model2;
		this.m3 = model3;
		
		// Intializing frame
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
		title.setText("Make: " + make); 
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
					new SelectMake();
					setVisible(false);
				}
			}
		);
		panel2.add(backBtn);
		
		//Model1 button
		firstModel = new JButton();
		firstModel.setText(carModel1);
		firstModel.setBounds(10, 79, 288, 55);
		firstModel.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new ViewSelectedModel(m1,m1,m2,m3);
//					new ViewSelectedModel();
					setVisible(false);
				}
			}
		);
		panel2.add(firstModel);
		
		//Model2 button
		secondModel = new JButton();
		secondModel.setText(carModel2);
		secondModel.setBounds(10, 211, 288, 55);
		secondModel.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new ViewSelectedModel(m2,m1,m2,m3);
					setVisible(false);
				}
			}
		);
		panel2.add(secondModel);
		
		//Model3 button
		thirdModel = new JButton();
		thirdModel.setText(carModel3);
		thirdModel.setBounds(10, 145, 288, 55);
		thirdModel.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						new ViewSelectedModel(m3,m1,m2,m3);
						setVisible(false);
					}
				}
			);
		panel2.add(thirdModel);
		
		//Model1 price
		firstPrice = new JLabel();
		firstPrice.setText("Price: £" + Double.toString(price1));
		firstPrice.setBounds(308, 165, 156, 14);
		panel2.add(firstPrice);
		
		//Model2 price
		secondPrice = new JLabel();
		secondPrice.setText("Price: £" + Double.toString(price2));
		secondPrice.setBounds(308, 99, 156, 14);
		panel2.add(secondPrice);
		
		//Model3 price
		thirdPrice = new JLabel();
		thirdPrice.setText("Price: £" + Double.toString(price3));
		thirdPrice.setBounds(308, 231, 156, 14);
		panel2.add(thirdPrice);
		
	}
}