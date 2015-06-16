package pwf.visitor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Activator {

	private JFrame frame;
	private JLabel jlbempty;


	public void run() {
			frame = new JFrame("JFrame Source Demo");
			frame.addWindowListener(new WindowAdapter() {

				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
			jlbempty = new JLabel("");
			jlbempty.setPreferredSize(new Dimension(500, 500));
			frame.getContentPane().add(jlbempty, BorderLayout.CENTER);
			frame.pack();
			frame.setVisible(true);
			
		}
		

	private String result;
	
	
	public void refresh(String result){
		this.result = result;
		jlbempty.setText("");
		jlbempty.setText(this.result.toString());
		frame.repaint();
	}

}
