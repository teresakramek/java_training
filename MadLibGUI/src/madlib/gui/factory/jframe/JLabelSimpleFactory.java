package madlib.gui.factory.jframe;

import java.awt.Font;

import javax.swing.JLabel;

public class JLabelSimpleFactory {
	
	public static JLabel create(String labelTitle) {
		JLabel JLabel = new JLabel(labelTitle);
		JLabel.setFont(new Font("Dialog", Font.BOLD, 10));
		return JLabel;
	}	
}
