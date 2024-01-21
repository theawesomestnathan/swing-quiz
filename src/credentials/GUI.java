package credentials;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	JFrame frame;
	
	JLabel lbl1;
	JTextField tf1;
	
	JLabel lbl2;
	JPasswordField tf2;
	
	JLabel lbl3;
	JRadioButton rb1;
	JRadioButton rb2;
	
	JLabel lbl4;
	JTextArea ta1;
	
	JButton btn;
	
	GUI() {
		frame = new JFrame();
		
		lbl1 = new JLabel("Name:");
		lbl1.setBounds(5, 10, 100, 25);
		
		tf1 = new JTextField();
		tf1.setBounds(55, 10, 100, 25);
		
		lbl2 = new JLabel("Password:");
		lbl2.setBounds(5, 40, 100, 25);
		
		tf2 = new JPasswordField();
		tf2.setBounds(85, 40, 100, 25);
		
		lbl3 = new JLabel("Gender:");
		lbl3.setBounds(5, 65, 100, 25);
		
		rb1 = new JRadioButton("Male");
		rb1.setBounds(65, 65, 100, 25);
		
		rb2 = new JRadioButton("Female");
		rb2.setBounds(170, 65, 100, 25);
		
		lbl4 = new JLabel("Description:");
		lbl4.setBounds(5, 90, 100, 25);
		
		ta1 = new JTextArea();
		ta1.setBounds(5, 120, 300, 100);
		
		btn = new JButton("Submit");
		btn.setBounds(5, 230, 100, 25);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(
					null, 
					"Name: " + tf1.getText() + "\nPassword: " + new String(tf2.getPassword()) + "\nGender: " + (rb1.isSelected() ? "Male" : "Female") + "\nDescription:" + ta1.getText(),
					"Information", 
					JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		ButtonGroup btg = new ButtonGroup();
		btg.add(rb1);
		btg.add(rb2);
		
		frame.add(lbl1);
		frame.add(tf1);
		frame.add(lbl2);
		frame.add(tf2);
		frame.add(lbl3);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(lbl4);
		frame.add(ta1);
		frame.add(btn);
		frame.setLayout(null);
		frame.setTitle("Gender Form");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
