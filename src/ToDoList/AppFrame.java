package ToDoList;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AppFrame extends JFrame{

	private TitleBar title;
	private ButtonBar bttn;
	private List list;
	private JButton newTask;
	private JButton clear;
	
	///constructor
	AppFrame()
	{
		this.setSize(400,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	    
		title = new TitleBar();
	    bttn = new ButtonBar();
	    list = new List();
	    
	    this.add(title, BorderLayout.NORTH);
	    this.add(bttn, BorderLayout.SOUTH);
	    this.add(list, BorderLayout.CENTER);
	    
	    newTask = bttn.getAddTask();
	    clear = bttn.getClear();
	    
	    addListeners();
	}
	

	public void addListeners()
	{
		newTask.addMouseListener(new MouseAdapter()
				{
			@Override
			public void mousePressed(MouseEvent e) {
				TaskButton task = new TaskButton();
				list.add(task);
				
				task.getDone().addMouseListener(new MouseAdapter()
				{
					@Override
					public void mousePressed(MouseEvent e)
					{
						
						task.changeState();
						revalidate();
						
					}
				});
				
				revalidate();
				
			}});
		
		clear.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mousePressed(MouseEvent e)
			{
				list.removeCompletedTasks();
				repaint();
			}
		});
	}
}
