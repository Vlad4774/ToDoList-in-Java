package ToDoList;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonBar extends JPanel{

	private JButton addTask;
	private JButton clear;
	
	Border empty = BorderFactory.createEmptyBorder();
	
	ButtonBar()
	{
		this.setPreferredSize(new Dimension(400, 60));
		this.setBackground(Color.CYAN);
		
		addTask = new JButton("Add Task");
		addTask.setBorder(empty);
		addTask.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
		
		this.add(addTask);
		
		clear = new JButton("Clear completed tasks");
		clear.setBorder(empty);
		clear.setFont(new Font("Sans-Serif", Font.PLAIN, 20));
		
		this.add(clear);
	}
	
	public JButton getAddTask()
	{
		return addTask;
	}
	
	public JButton getClear()
	{
		return clear;
	}
}
