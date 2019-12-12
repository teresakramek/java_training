import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MadLibGUI extends JFrame {
	private JTextField txtAdjective;
	private JTextField txtColor;
	private JTextField txtPastTenseVerb;
	private JTextField txtNoun;
	private JTextArea txtOutput;
	
	public MadLibGUI() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(null);
		
		JLabel lblDrPaynesWacky = new JLabel("DR. PAYNE'S WACKY MADLIBS APP");
		lblDrPaynesWacky.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrPaynesWacky.setBounds(12, 12, 567, 15);
		getContentPane().add(lblDrPaynesWacky);
		
		JLabel lblEnterAnAdjective = new JLabel("Enter an Adjective: ");
		lblEnterAnAdjective.setFont(new Font("Dialog", Font.BOLD, 10));
		lblEnterAnAdjective.setBounds(12, 39, 138, 15);
		getContentPane().add(lblEnterAnAdjective);
		
		txtAdjective = new JTextField();
		txtAdjective.setBounds(165, 39, 124, 19);
		getContentPane().add(txtAdjective);
		txtAdjective.setColumns(10);
		
		JLabel lblEnterAColor = new JLabel("Enter a Color:");
		lblEnterAColor.setFont(new Font("Dialog", Font.BOLD, 10));
		lblEnterAColor.setBounds(331, 39, 82, 15);
		getContentPane().add(lblEnterAColor);
		
		txtColor = new JTextField();
		txtColor.setBounds(431, 36, 124, 19);
		getContentPane().add(txtColor);
		txtColor.setColumns(10);
		
		JLabel lblEnterAVerb = new JLabel("Enter a Verb Eading in -ed:");
		lblEnterAVerb.setFont(new Font("Dialog", Font.BOLD, 10));
		lblEnterAVerb.setBounds(12, 94, 156, 15);
		getContentPane().add(lblEnterAVerb);
		
		txtPastTenseVerb = new JTextField();
		txtPastTenseVerb.setBounds(165, 91, 124, 19);
		getContentPane().add(txtPastTenseVerb);
		txtPastTenseVerb.setColumns(10);
		
		JLabel lblEnterANoun = new JLabel("Enter a Noun:");
		lblEnterANoun.setFont(new Font("Dialog", Font.BOLD, 10));
		lblEnterANoun.setBounds(331, 93, 93, 15);
		getContentPane().add(lblEnterANoun);
		
		txtNoun = new JTextField();
		txtNoun.setBounds(431, 91, 124, 19);
		getContentPane().add(txtNoun);
		txtNoun.setColumns(10);
		
		JButton btnPressHereTo = new JButton("Press Here to View Your MadLib Creation!");
		btnPressHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				savedData();
			}
		});
		btnPressHereTo.setFont(new Font("Dialog", Font.BOLD, 11));
		btnPressHereTo.setBounds(147, 140, 318, 25);
		getContentPane().add(btnPressHereTo);
		
		txtOutput = new JTextArea();
		txtOutput.setBounds(12, 199, 556, 59);
		getContentPane().add(txtOutput);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setTitle("Dr. Payne's GUI MadLibs");
	}

	public static void main(String[] args) {
		MadLibGUI theGame = new MadLibGUI();
		theGame.setSize(new Dimension(592,300));
		theGame.setVisible(true);

	}
	
	private void savedData() {
		String guessTxtAdjective = txtAdjective.getText();
		String guessTxtColor = txtColor.getText();
		String guessTxtPastTenseVerb = txtPastTenseVerb.getText();
		String guessTxtNoun = txtNoun.getText();
		
		String[] fieldValues = {guessTxtAdjective, guessTxtColor, guessTxtPastTenseVerb, guessTxtNoun};
		
		storyDisplay(fieldValues);
		
	}
	
	private void storyDisplay(String[] guessValues) {
		String message = "The " + guessValues[0] + " dragon " + guessValues[1] + " at the " + guessValues[2] +
				" knight, who rode in on a sturdy, giant " + guessValues[3] + ".";
		txtOutput.setText(message);
	}
}
