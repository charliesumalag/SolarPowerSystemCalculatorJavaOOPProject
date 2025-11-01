import javax.swing.*;
import java.awt.*;



public class SolarPowerSystemCalculator{
	
	
	private JButton loadInputBtn;
	private JButton systemParametersBtn;
	private JButton summaryBtn;
	private JFrame frame;
	private JPanel mainPanel;
	private CardLayout cardLayout;
	
	
	
	//Constructor
	SolarPowerSystemCalculator() {
		frame = new JFrame("Solar Power System Calculator");
		frame.setSize(800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.white);
		
		
		//Navbar
		JPanel navBar = new JPanel();
		navBar.setBounds(0, 0, 800, 40);
		navBar.setLayout(new FlowLayout(FlowLayout.LEFT, 5,8));
		
		
		//crate buttons
		loadInputBtn = new JButton("Load Input");
		systemParametersBtn = new JButton("System Parameters");
		summaryBtn = new JButton("Result");
		
		
		//style the buttons
		styleButton(loadInputBtn);
		styleButton(systemParametersBtn);
		styleButton(summaryBtn);
		
		
		navBar.add(loadInputBtn);
		navBar.add(systemParametersBtn);
		navBar.add(summaryBtn);
		System.out.println(frame.getInsets());
		
		frame.add(navBar);
		frame.setVisible(true);
		
		//actions
		 loadInputBtn.addActionListener(e -> setActiveButton(loadInputBtn));
	     systemParametersBtn.addActionListener(e -> setActiveButton(systemParametersBtn));
	     summaryBtn.addActionListener(e -> setActiveButton(summaryBtn));
	}
	
	//Helpers to style the buttons
	private void styleButton(JButton btn) {
	    btn.setBackground(new Color(0xECFEFA));   // background color won't show because of transparency
	    btn.setForeground(new Color(0x555555));   // text color
	    btn.setBorderPainted(false);              // no border
	    btn.setFocusPainted(false);               // remove focus outline
	    btn.setContentAreaFilled(false);          // make default transparent
	    btn.setOpaque(false);                      // transparent background
	}
	
	
	 // Set active button
	public void setActiveButton(JButton active) {
	    // Reset all buttons to transparent/default
	    loadInputBtn.setContentAreaFilled(false);
	    loadInputBtn.setOpaque(false);
	    loadInputBtn.setForeground(new Color(0x555555));

	    systemParametersBtn.setContentAreaFilled(false);
	    systemParametersBtn.setOpaque(false);
	    systemParametersBtn.setForeground(new Color(0x555555));

	    summaryBtn.setContentAreaFilled(false);
	    summaryBtn.setOpaque(false);
	    summaryBtn.setForeground(new Color(0x555555));

	    // Set the clicked button to active
	    active.setContentAreaFilled(true);
	    active.setOpaque(true);
	    active.setBackground(new Color(0xE7FFFB));
	    active.setForeground(new Color(0x000000));
	}
	

	public static void main(String[] args) {
		
		new SolarPowerSystemCalculator();

	}

}
