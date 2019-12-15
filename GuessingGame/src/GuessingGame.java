import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	
	private final JLabel lblDrPaynesHilo = new JLabel("Dr. Payne's Hi-Lo Guessing Game");
	private JTextField txtGuess;
	private JLabel lblOutput;
	private JButton btnPlayAgain;
	private int theNumber;
	private int numberOfTries = 0;
	
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		try {
			
			int guess = Integer.parseInt(guessText);
			numberOfTries++;
			
			if(isLowest(guess)) {
				message = setLowMessage(guess);
				return;
		    }
		
			if(isHighest(guess)) {
				message = setHighMessage(guess);
				return;
			}
			
			message = setCorrectMessage(guess);
			btnPlayAgain.setVisible(true);
		
		}catch (Exception e){
			message = setErrorMessage(e.getMessage());
		}finally {
			lblOutput.setText(message);
			txtGuess.requestFocus();
			txtGuess.selectAll();
		}	
	}
	
	private boolean isLowest(int guessNumber) {
		return guessNumber < theNumber;
	}
	private boolean isHighest(int guessNumber) {
		return guessNumber > theNumber;
	}
	
	private String setLowMessage(int guessNumber) {
		return guessNumber + " is too low. Try again.";
	}
	
	private String setHighMessage(int guessNumber) {
		return guessNumber + " is to high. Try again.";
	}
	
	private String setCorrectMessage(int guessNumber) {
		return guessNumber + " is correct. You win after " + numberOfTries +  " tries! Let's play again!";
	}
	
	private String setErrorMessage(String errorMessage) {
		return "Enter a whole number between 1 and 10" + errorMessage;
	}
	
	public void newGame() {
		lblOutput.setText("You must guess a number between 1 and 10");
		theNumber = (int)(Math.random() * 10 +1);
		btnPlayAgain.setVisible(false);
		numberOfTries = 0;
	}
	public GuessingGame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dr. Payne's Hi-Lo Guessing Game");
		getContentPane().setLayout(null);
		lblDrPaynesHilo.setFont(new Font("Chilanka", Font.BOLD, 15));
		lblDrPaynesHilo.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrPaynesHilo.setBounds(12, 27, 416, 33);
		getContentPane().add(lblDrPaynesHilo);

		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 10");
		lblGuessANumber.setFont(new Font("Chilanka", Font.BOLD, 16));
		lblGuessANumber.setBounds(22, 87, 291, 48);
		getContentPane().add(lblGuessANumber);

		txtGuess = new JTextField();
		txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		txtGuess.setBounds(296, 100, 67, 19);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});

		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setFont(new Font("Chilanka", Font.BOLD, 12));
		btnGuess.setBounds(168, 162, 114, 25);
		getContentPane().add(btnGuess);

		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("Chilanka", Font.BOLD, 12));
		lblOutput.setBounds(12, 199, 426, 25);
		getContentPane().add(lblOutput);
		
		btnPlayAgain = new JButton("Play Again");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		btnPlayAgain.setFont(new Font("Chilanka", Font.BOLD, 13));
		btnPlayAgain.setBounds(168, 233, 114, 25);
		getContentPane().add(btnPlayAgain);
	}

	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);
	}
}
