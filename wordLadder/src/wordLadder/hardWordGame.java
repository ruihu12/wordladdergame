package wordLadder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.io.IOException;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class hardWordGame extends JFrame {

	/**
	 * Launch the application.
	 */
	int i=0;
	int x=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hardWordGame frame = new hardWordGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		 
	}

	/**
	 * Create the frame.
	 */
	public hardWordGame() {
		
		String A[] = {"The color of milk or fresh snow ","color or pigment","amuse oneself or play in a lively, energetic way"};
		String B[] = {"A period of time.","showing incomprehension or no reaction","move with a sudden burst of speed"};
		String C[] = {"A very large marine mammal ","a fundamental point of a political or other program","a pointed device secured to a rider's heel and used to urge on the horse"};
		String D[] = {"Soft, finely stratified sedimentary rock","completely level or flat","having an acid taste like lemon or vinegar "};
		String E[] = {"comparative darkness and coolness","dishes, bowls, cups, and other utensils made of gold, silver, or other metal","a journey for pleasure in which several different places are visited"};
		String F[] = {"white","black","sport"};
		String G[] = {"shade","plate","tours"};
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 428, 244);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.activeCaption);
		textPane.setBounds(15, 16, 64, 26);
		panel.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(SystemColor.scrollbar);
		textPane_1.setBounds(15, 58, 64, 26);
		panel.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBackground(SystemColor.scrollbar);
		textPane_2.setBounds(15, 101, 64, 26);
		panel.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBackground(SystemColor.scrollbar);
		textPane_3.setBounds(15, 143, 64, 26);
		panel.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBackground(SystemColor.activeCaption);
		textPane_4.setBounds(15, 181, 64, 26);
		panel.add(textPane_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(126, 16, 287, 22);
		panel.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(126, 62, 287, 22);
		panel.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setBounds(126, 105, 287, 22);
		panel.add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setBounds(126, 147, 287, 22);
		panel.add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setBounds(126, 185, 287, 22);
		panel.add(textArea_4);
		
		
		JTextArea textArea_5 = new JTextArea();
		textArea_5.setBackground(SystemColor.textHighlightText);
		textArea_5.setBounds(15, 219, 106, 22);
		panel.add(textArea_5);
		
		textArea.setText(A[i]);
		textArea_1.setText(B[i]);
		textArea_2.setText(C[i]);
		textArea_3.setText(D[i]);
		textArea_4.setText(E[i]);
		textPane.setText(F[i]);
		textPane_4.setText(G[i]);
		
		JButton btnNewButton = new JButton("check");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(UIManager.getColor("Menu.selectionBackground"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				
				
				try {
					findladder finder = new findladder();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				 ArrayList<String> array= null;
				try {
					array = new findladder().findBreadth(F[i], G[i]).getWord();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

		        ArrayList<String> user = new ArrayList<String>();

		        user.add(F[i]);
		        
		        user.add(textPane_1.getText());

		        user.add(textPane_2.getText());
		       
		        user.add(textPane_3.getText());
		        
		        user.add(G[i]);
		        
		        if( array.equals(user)){
		            textArea_5.setText("yes, you got it");
		        }
		        else{
		        	textArea_5.setText("NO, keep try");
		        }
			}
		});
		btnNewButton.setBounds(136, 215, 81, 31);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("return");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mainWordGame fp = new mainWordGame();
				fp.toFront();
			}
		});
		btnNewButton_1.setBounds(319, 217, 94, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if( i < 2) {
					
					i++;
					
					textArea.setText(A[i]);
					textArea_1.setText(B[i]);
					textArea_2.setText(C[i]);
					textArea_3.setText(D[i]);
					textArea_4.setText(E[i]);
					textPane.setText(F[i]);
					textPane_4.setText(G[i]);
					textPane_1.setText("");
					textPane_2.setText("");
					textPane_3.setText("");
					textArea_5.setText("");
					
					
					}
				else {
						
						if(x==3) {
							
						
						mainWordGame fp = new mainWordGame();
						
						fp.show();
		
						
						}
						
					}
					
			
		
			}
		});
		btnNewButton_2.setBounds(227, 215, 82, 29);
		panel.add(btnNewButton_2);
		
		
	}
}