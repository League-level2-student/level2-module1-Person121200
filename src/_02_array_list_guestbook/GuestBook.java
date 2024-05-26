package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JButton addName = new JButton("Add Name");
	JButton viewName = new JButton("View name");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	ArrayList<String> names = new ArrayList<String>();
	
	public void show() {
		addName.addActionListener(this);
		viewName.addActionListener(this);
		panel.add(addName);
		panel.add(viewName);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == addName) {
			String name = JOptionPane.showInputDialog("Please add a name: ");
			names.add(name);
		}
		if(e.getSource() == viewName) {
			JOptionPane.showMessageDialog(null, names);
		}
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

}
