package WinBuilder;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Start extends JFrame {
	
	static JFrame frame;
	static CardLayout cardlayout;
	static JPanel contentPane;
	
	public static void main(String[] args) {
		cardlayout = new CardLayout();
		contentPane = new JPanel(cardlayout);
		
		//Frame
		frame = new JFrame("Cinema");
		frame.setLocation(50, 20);
		frame.setSize(1400, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Main Jpanel(cardlayout) for switching pages
		cardlayout = new CardLayout();
		contentPane = new JPanel(cardlayout);
		frame.add(contentPane);
		
		//Main Menu
		JPanel mainMenu = new mainMenu();
		contentPane.add(mainMenu,"1");
		
		//Registration
		JPanel registration = new Registration();
		contentPane.add(registration, "2");
		
		//Login 
		JPanel login = new Login();
		contentPane.add(login, "3");
		
		JPanel userProfile = new userProfile();
		contentPane.add(userProfile, "4");
		
		// Method to change pages
		pages(1);
		
		frame.setVisible(true);
		
	}
	
	public static void pages(int pageNumber) {
		switch(pageNumber) {
		case 1: cardlayout.show(contentPane, "1"); break;
		case 2: cardlayout.show(contentPane, "2"); break;
		case 3: cardlayout.show(contentPane, "3"); break;
		case 4: cardlayout.show(contentPane, "4"); break;
		}

	}
	


}
