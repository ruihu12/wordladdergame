package wordLadder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage frame = new mainPage();
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
	public mainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(mainWordGame.class.getResource("/face_monkey.png")));
		lblNewLabel.setBounds(132, 16, 130, 111);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("word ladder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainWordGame fp = new mainWordGame();
				fp.show();
			}
		});
		btnNewButton.setBounds(35, 161, 137, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Jumble words");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainJumble mj = new mainJumble();
				mj.show();
			}
		});
		btnNewButton_1.setBounds(242, 161, 137, 29);
		contentPane.add(btnNewButton_1);
	}
}
