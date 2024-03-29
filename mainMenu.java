package WinBuilder;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class mainMenu extends JPanel implements ActionListener {
	GridBagConstraints mainConstraint = new GridBagConstraints();
	
	public mainMenu() {
		setLayout(new GridBagLayout());
		int x, y;
		
		// Colors
		Color mainMenuBg= new Color(40,62,102);
		setBackground(mainMenuBg);
		Color titleColor = new Color(218,165,32);
		Color buttonColor = new Color(204,186,120);
		
		// Button dimension
		Dimension d2 = new Dimension(250, 50);

		// Default font size
		Font defaultFont = new Font("SansSerif", Font.PLAIN, 30);
		
		// Game Title
		JLabel title = new JLabel("CINEMA");
		title.setForeground(titleColor);
		Font titleFont = new Font("Serif", Font.BOLD, 70);
		title.setFont(titleFont);
		addComponent(title, x = 0, y = 0);
		
		JButton profileButton = new JButton("PROFILE");
		profileButton.setBackground(buttonColor);
		profileButton.setFont(defaultFont);
		profileButton.setPreferredSize(d2);
		addComponent(profileButton, x = 1, y = 4);
		profileButton.addActionListener(this);
		
		JButton loginButton = new JButton("LOGIN");
		loginButton.setBackground(buttonColor);
		loginButton.setFont(defaultFont);
		loginButton.setPreferredSize(d2);
		addComponent(loginButton, x = 1, y = 5);
		loginButton.addActionListener(this);
		
		JButton registerButton = new JButton("REGISTER");
		registerButton.setBackground(buttonColor);
		registerButton.setFont(defaultFont);
		registerButton.setPreferredSize(d2);
		addComponent(registerButton, x = 1, y = 6);
		registerButton.addActionListener(this);
		
		JButton exitButton = new JButton("EXIT");
		exitButton.setBackground(buttonColor);
		exitButton.setFont(defaultFont);
		exitButton.setPreferredSize(d2);
		addComponent(exitButton, x = 1, y = 7);
		exitButton.addActionListener(this);
	
	}
	
	// To prevent repetitive attributes
		private void addComponent(Component component, int x, int y) {

			mainConstraint.gridx = x;
			mainConstraint.gridy = y;

			mainConstraint.weightx = 0.05;
			mainConstraint.weighty = 0.05;

			// For title & last spacing ONLY
			if((x==0 && y==0) || (x==1 && y==8)) {
				mainConstraint.weightx = 1;
				mainConstraint.weighty = 1;
				mainConstraint.gridwidth = 2;
				mainConstraint.anchor = GridBagConstraints.CENTER;
			}

			add(component, mainConstraint);

		}
	
		// Event
		public void actionPerformed(ActionEvent e) {

			String buttonText = e.getActionCommand();

			if(buttonText.equals("PROFILE")) {
				Start.pages(4);

			} else if(buttonText.equals("LOGIN")) {
				Start.pages(3);

			} else if(buttonText.equals("REGISTER")) {
				Start.pages(2);
				
			} else if(buttonText.equals("EXIT")) {

				int exitResult = JOptionPane.showConfirmDialog(null, "Exit?", "Confirm Exit",
						JOptionPane.OK_CANCEL_OPTION);
				if (exitResult == JOptionPane.OK_OPTION) {
					System.exit(0);
				}

			}
	}
}
