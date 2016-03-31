import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gui {

	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	private JTextField inputField;
	
	public Gui() {
		prepareGUI();
	}
	
	/*public static void main(String[] args) {
		Gui gui = new Gui();
		gui.showTextFieldDemo();
	}*/
	
	private void prepareGUI () {
		mainFrame = new JFrame ("A Java Swing GUI");
		mainFrame.setSize(400,400);
		mainFrame.setLayout(new GridLayout(3,1));
		mainFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent){
				System.exit(0);
			}
		}); 
			
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		
		statusLabel.setSize(350, 100);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(controlPanel);
		mainFrame.add(statusLabel);
		mainFrame.setVisible(true);

	}
	
	public void showTextFieldDemo() {
		headerLabel.setText("Control in action: JTextField");
		
		JLabel nameLabel = new JLabel ("User ID: ", JLabel.RIGHT);
		final JTextField userText = new JTextField(6);
		
		JButton codeButton = new JButton("Convert code: ");
		codeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "The code: " + userText.getText();
				statusLabel.setText(data);
			}
		});
		
		controlPanel.add(nameLabel);
		controlPanel.add(userText);
		controlPanel.add(codeButton);
		mainFrame.setVisible(true);
		
	}
}
