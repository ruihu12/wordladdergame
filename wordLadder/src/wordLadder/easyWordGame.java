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

public class easyWordGame extends JFrame {

	/**
	 * Launch the application.
	 */
	
	int i=0;
	int x=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					easyWordGame frame = new easyWordGame();
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
	public easyWordGame() {
		
		
		
		String A[] = {"A thick woolen coverlet or wrap ","a container made of metal and used for cooking food in","point or direct (a weapon or camera) at a target."};
		String B[] = {"A small insect","an instrument for writing or drawing with ink","help, typically of a practical nature"};
		String C[] = {"A container made of flexible material","A number","a removable or hinged cover for the top of a container."};
		String D[] = {"Used for hitting the ball in games such as baseball","decide or determine correctly or with certainty","a light-emitting diode "};
		String E[] = {"A small domesticated carnivorous mammal with soft fur","the pointed or rounded end or extremity of something slender or tapering","each of the limbs on which a person or animal walks and stands."};
		String F[] = {"rug","pan","aim"};
		String G[] = {"cat","tip","leg"};
		
		
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
		textArea_5.setBackground(SystemColor.controlLtHighlight);
		textArea_5.setBounds(15, 219, 113, 22);
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
		            x++;
		            
		        }
		        else{
		        	textArea_5.setText("NO, keep try");
		        }
			}
		});
		btnNewButton.setBounds(136, 215, 79, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("return");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				
				mainWordGame fp = new mainWordGame();
		
				fp.toFront();
				
			
			}
		});
		btnNewButton_1.setBounds(331, 215, 87, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.setBackground(UIManager.getColor("Menu.selectionBackground"));
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
		btnNewButton_2.setBounds(225, 215, 89, 29);
		panel.add(btnNewButton_2);
		
		
	}
}