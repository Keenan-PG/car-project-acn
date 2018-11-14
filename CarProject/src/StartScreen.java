import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class StartScreen extends JFrame {
	// Variables gan 'ere
	JButton startBtn;
	JPanel container;
	JPanel panel1;
	JPanel panel2;
	JLabel title;
	JLabel image;
	
	//Constructor gan 'ere
	public StartScreen() {
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
		title.setText("CAR LISTINGS"); 
		panel1.add(title);
		
		
		/*
		 * PANEL 2 (MID)
		 */
		
		panel2 = new JPanel();
		getContentPane().add(panel2, BorderLayout.CENTER);
		panel2.setLayout(null);
		
		/*
		 * IMAGE (PANEL 2) 
		 */
		
		image = new JLabel();
		ImageIcon icon = new ImageIcon("src/car.png");
		image.setIcon(icon);
		image.setBounds(210,90,64,64);
		panel2.add(image);
		
		/*
		 * BUTTON (PANEL 2) 
		 */
		
		startBtn = new JButton();
		startBtn.setText("Click here to enter");
		startBtn.setBounds(10, 240, 454, 30);
		startBtn.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// Button functionality here
					SelectMake openMakeWindow = new SelectMake();
					setVisible(false);
				}
			}
		);
		panel2.add(startBtn);
		
	}
}