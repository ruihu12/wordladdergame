package wordLadder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class mainWordGame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//frameWork easy = new frameWork();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWordGame frame = new mainWordGame();
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
	public mainWordGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("easy");
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				easyWordGame ef= new easyWordGame();
				ef.show();
				
			}
		});
		btnNewButton.setBounds(15, 169, 115, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("medium");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mediumWordGame md= new mediumWordGame();
				md.show();
				
			}
		});
		btnNewButton_1.setBounds(154, 169, 115, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("hard");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hardWordGame hf = new hardWordGame();
				hf.show();
			}
		});
		btnNewButton_2.setBounds(298, 169, 115, 29);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Word Ladder ");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(46, 45, 182, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(mainWordGame.class.getResource("/face_monkey.png")));
		lblNewLabel_1.setBounds(262, 29, 139, 110);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("Main menu");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
				mainPage fp = new mainPage();
		
				fp.toFront();
			}
		});
		btnNewButton_3.setBounds(154, 214, 115, 29);
		contentPane.add(btnNewButton_3);
	}
}
