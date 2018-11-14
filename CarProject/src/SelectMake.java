import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SelectMake extends JFrame {
	// Variables gan 'ere
	JButton startBtn;
	
	JPanel container;
	JPanel panel1;
	JPanel panel2;
	
	JLabel title;
	JLabel image;
	
	JButton ford;
	JButton nissan;
	JButton peugot;
	JButton audi;
	
	
	//Constructor gan 'ere
	public SelectMake() {
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
		title.setText("Select a make!"); 
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
		
		//Audi button
		
		audi = new JButton();
		audi.setText("AUDI");
		audi.setBounds(54, 146, 150, 120);
		audi.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ViewSelectedModels a = new ViewSelectedModels(
							new CarModel("Audi", "R8 Coupe", 112520),
							new CarModel("Audi", "A1 Sportback", 16225),
							new CarModel("Audi", "Q2", 39075)
					);
					setVisible(false);
				}
			}
		);
		panel2.add(audi);
		
		//Ford button
		
		ford = new JButton();
		ford.setText("FORD");
		ford.setBounds(54, 15, 150, 120);
		ford.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ViewSelectedModels f = new ViewSelectedModels(
							new CarModel("Ford", "Fiesta", 120000.50),
							new CarModel("Ford", "Mondeo", 20995),
							new CarModel("Ford", "Mustang", 37045)
					);
					setVisible(false);
				}
			}
		);
		panel2.add(ford);
		
		//Nissan button
		
		nissan = new JButton();
		nissan.setText("NISSAN");
		nissan.setBounds(271, 15, 150, 120);
		nissan.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ViewSelectedModels n = new ViewSelectedModels(
							new CarModel("Nissan", "Juke", 15195),
							new CarModel("Nissan", "Leaf", 25190),
							new CarModel("Nissan", "X-Trail", 25590)
					);
					setVisible(false);
				}
			}
		);
		panel2.add(nissan);
		
		//Peugot button
		
		peugot = new JButton();
		peugot.setText("PEUGOT");
		peugot.setBounds(271, 146, 150, 120);
		peugot.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ViewSelectedModels p = new ViewSelectedModels(
							new CarModel("Peugot", "SUV GT", 29155),
							new CarModel("Peugot", "508 Fastback", 25000),
							new CarModel("Peugot", "SUV 2008", 16985)
					);
					setVisible(false);
				}
			}
		);
		panel2.add(peugot);

		
	}
}