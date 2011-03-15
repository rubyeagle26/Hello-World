import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Main {
	static JTextArea output = null;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel content = new JPanel(new BorderLayout());
		frame.setContentPane(content);
		
		View v = new View();
		v.SetSize();
		v.addMouseListener(v);
		v.addMouseMotionListener(v);
		content.add(v, BorderLayout.CENTER);
		
		output = new JTextArea();
		output.setFont(new Font("Verdana", Font.BOLD, 14));
		output.setBorder(new EmptyBorder(15, 25, 25, 25));
		content.add(output, BorderLayout.PAGE_END);
		
		frame.setBounds(400, 50, 100, 100);
		frame.pack();
		frame.setVisible(true);

		Controller.getInstance().startNewGame();
	}
	
	public static void print(String s){
		output.setText(s);
	}
}

