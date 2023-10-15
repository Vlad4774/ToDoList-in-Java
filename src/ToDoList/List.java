package ToDoList;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class List extends JPanel{
	
	List(){
		
		GridLayout layout = new GridLayout(10, 1);
		layout.setVgap(5);
		
		this.setLayout(layout);
		this.setBackground(Color.pink);
	}
	
	public void removeCompletedTasks()
	{
		for(Component c : getComponents())
		{
			if(c instanceof TaskButton)
			{
				if(((TaskButton)c).getState())
				{
					remove(c);
				}
			}
		}
		
	}
}
