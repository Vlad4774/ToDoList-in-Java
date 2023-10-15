package ToDoList;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TaskButton extends JPanel {
	
	private JLabel index;
	private JTextField taskName;
	private JButton done;
	private boolean checked;
	
	TaskButton()
	{
		this.setPreferredSize(new Dimension(40, 20));
		this.setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
		
		checked = false;
		
		index = new JLabel ("");
		index.setPreferredSize(new Dimension(20, 20));
		index.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(index, BorderLayout.WEST);
		
		taskName = new JTextField();
		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(Color.GRAY);
	    taskName.setText(getTaskFromKeyboard());
		
		this.add(taskName, BorderLayout.CENTER);	
		
		done = new JButton("done");
		done.setPreferredSize(new Dimension(40, 20));
		done.setBorder(BorderFactory.createEmptyBorder());
		
		this.add(done, BorderLayout.EAST);
	}
	
	private String getTaskFromKeyboard()
	{
		String description = JOptionPane.showInputDialog("Enter task description:");
        if (description == null) {
            description = "Your task here";
        }
        
        return description;
	}
	
	public void changeState()
	{
		this.setBackground(Color.green);
		taskName.setBackground(Color.green);
		checked = true;
	}

	public JButton getDone() {
		
		return done;
	}
	
	public boolean getState()
	{
		return checked;
	}
}
