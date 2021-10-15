package wordLadder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class hardJumble extends javax.swing.JFrame {
	   private javax.swing.JButton checkButton;
	   private javax.swing.JButton skipButton;
	   private javax.swing.JLabel JumbleLable;
	   private javax.swing.JLabel resultLable;
	   private javax.swing.JLabel newJumble;
	   private javax.swing.JTextField jTextField1;
	   private javax.swing.JLabel qLevel;
	   int i = 0;
	   public int level = 1;
	   String A[] = { "deposit", "flowchart", "triumph", "beverage", "astronomy", "professor", "alterego", "blackjack", "absolutely", "accelerator" };
	   String B[] = { "tsopdei", "whftraloc", "uirtphm", "egebrave", "yootsnamr", "rroosspfe", "egoatler", "kablackcj", "soabteluyl", "rotarelecca" };
	   private JButton btnNewButton;

	   public hardJumble() {
	       initComponents();
	       JumbleLable.setText(B[i]);

	   }

	   private void initComponents() {
	       super.setTitle("Jumble");
	       JumbleLable = new javax.swing.JLabel();
	       jTextField1 = new javax.swing.JTextField();
	       checkButton = new javax.swing.JButton();
	       skipButton = new javax.swing.JButton();
	       resultLable = new javax.swing.JLabel();
	       newJumble = new javax.swing.JLabel();
	       qLevel = new javax.swing.JLabel();

	       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	       JumbleLable.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
	       JumbleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	       JumbleLable.setText("Jumble");
	       JumbleLable.setToolTipText("");
	       JumbleLable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	       JumbleLable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

	      
	       
	       jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
	       jTextField1.setToolTipText("Guess");
	       jTextField1.addActionListener(new java.awt.event.ActionListener() {
	           public void actionPerformed(java.awt.event.ActionEvent evt) {
	               jTextField1ActionPerformed(evt);
	           }
	       });

	       checkButton.setText("Check");
	       checkButton.addActionListener(new java.awt.event.ActionListener() {
	           public void actionPerformed(java.awt.event.ActionEvent evt) {
	               checkButtonActionPerformed(evt);
	           }
	       });

	       skipButton.setText("Give Up");
	       skipButton.addActionListener(new java.awt.event.ActionListener() {
	           public void actionPerformed(java.awt.event.ActionEvent evt) {
	               skipButtonActionPerformed(evt);
	           }
	       });
	  
	       qLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	       qLevel.setText("000000000000000000000000");
	       qLevel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER); 
	       
	       resultLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	       resultLable.setText("<html>Result<br/>Level: "+ level+ "</html>");

	       newJumble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	       newJumble.setText("Here is Your Jumbled Word.");
	       
	       btnNewButton = new JButton("return");
	       btnNewButton.addActionListener(new ActionListener() {
	       	public void actionPerformed(ActionEvent e) {
	       		setVisible(false);
				
				mainJumble mj = new mainJumble();
		
				mj.toFront();
	       	}
	       });

	       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	       layout.setHorizontalGroup(
	       	layout.createParallelGroup(Alignment.LEADING)
	       		.addGroup(layout.createSequentialGroup()
	       			.addContainerGap()
	       			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
	       				.addGroup(layout.createSequentialGroup()
	       					.addGap(0, 155, Short.MAX_VALUE)
	       					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
	       						.addComponent(skipButton, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
	       						.addComponent(checkButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	       						.addComponent(jTextField1)
	       						.addComponent(JumbleLable, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	       						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	       					.addGap(146))
	       				.addComponent(resultLable, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)))
	       		.addComponent(newJumble, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
	       );
	       layout.setVerticalGroup(
	       	layout.createParallelGroup(Alignment.LEADING)
	       		.addGroup(layout.createSequentialGroup()
	       			.addGap(24)
	       			.addComponent(newJumble)
	       			.addPreferredGap(ComponentPlacement.UNRELATED)
	       			.addComponent(JumbleLable)
	       			.addGap(26)
	       			.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	       			.addGap(18)
	       			.addComponent(checkButton)
	       			.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
	       			.addComponent(resultLable)
	       			.addGap(27)
	       			.addComponent(skipButton)
	       			.addGap(18)
	       			.addComponent(btnNewButton)
	       			.addGap(17))
	       );
	       getContentPane().setLayout(layout);

	       pack();
	   }

	   private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {

	       String guess = jTextField1.getText();

	       if (guess.equals(A[i])) {
	    	   level++;
	           resultLable.setText("<html>'" + guess + "' is a correct Answer<br/>\tLevel: "+ level+ "</html>");
	           qLevel.setText("Hello"+ level + "doggy");
	          
	           i++;
	           newJumble.setText("Here is your New Jumbled Word..");
	           JumbleLable.setText(B[i]);
	       } else {
	           resultLable.setText("<html>'" + guess + "' is a Wrong Answer<br/>\tLevel: "+ level+ "</html>");
	       }

	   }

	   private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
	  
	   }

	   private void skipButtonActionPerformed(java.awt.event.ActionEvent evt) {
	  
	       newJumble.setText("Here is your New Jumbled Word..");
	       resultLable.setText("'" + A[i] + "' is a correct Answer for '" + B[i] + "'");
	       i++;
	       JumbleLable.setText(B[i]);
	   }

	   public static void main(String args[]) {

	       //Random r = new Random();
	       java.awt.EventQueue.invokeLater(new Runnable() {
	           public void run() {
	               new hardJumble().setVisible(true);

	           }
	       });
	   }

}
