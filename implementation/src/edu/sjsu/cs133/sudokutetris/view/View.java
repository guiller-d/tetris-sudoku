package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class View extends JPanel implements ActionListener {
	
	
	JFrame startFrame; 
	JFrame gameFrame;
	JFrame scoreFrame;
	
	JPanel startContent;
	JPanel gameContent;
	JPanel scoreContent;
	JPanel scoreBoard;
	
	JButton start; 
	JButton quit; 
	JButton view_score; 
	
	private ImageIcon logo = new ImageIcon(this.getClass().getResource("title.gif"));
	
	private JLabel gameName;
	
	public View() {
		
		startFrame = new JFrame();
		gameFrame =  new JFrame();
		scoreFrame =  new JFrame();
		startContent =  new JPanel();
		gameContent = new JPanel();
		scoreContent = new JPanel();
		scoreBoard = new JPanel();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void start(){
		 launchWindow();
		 gameWindow();
		 scoreWindow();
	}
	
	public void launchWindow() {
		
<<<<<<< Upstream, based on branch 'master' of https://github.com/gelier/st-eclipse-git.git
		start = new JButton("S helloot yatyrt");
=======
		start = new JButton("Stassrt");
>>>>>>> 298eacd test
		quit  = new JButton("Quit");
		view_score  = new JButton("Scores");
		
		startFrame.setSize(600, 600);
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startFrame.setResizable(false);
		startFrame.setTitle("Sudoku Tet   ris");
		// Create welcome screen panel.
		startContent = new JPanel();
		gameName = new JLabel(logo);
		gameName.setSize(new Dimension(50,50));
		
		startContent.setLayout(new BoxLayout(startContent, BoxLayout.Y_AXIS));
		startContent.setBackground(Color.black);
		
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//startFrame.setVisible(false);
				//gameFrame.setVisible(true);
			}	
		});
		view_score.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}	
		});
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}	
		});
		
		startContent.add(gameName);
		gameName.setAlignmentX(Component.CENTER_ALIGNMENT);
		start.setAlignmentX(Component.CENTER_ALIGNMENT);
		view_score.setAlignmentX(Component.CENTER_ALIGNMENT);
		quit.setAlignmentX(Component.CENTER_ALIGNMENT);
		startContent.add(Box.createRigidArea(new Dimension(100, 50)));
		
		startContent.add(start);
		startContent.add(view_score);
		startContent.add(quit);
		
		startFrame.add(startContent);
		startFrame.setVisible(true);
		
	}
	public void gameWindow() {
		
	}
	public void scoreWindow() {
		
	}
}


