package awt_counter;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Button;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class AWTCounter extends Frame implements ActionListener {
	Label label1;
	TextField textField1;
	Button button;
	int count = 0;
	
	public AWTCounter() {
		setLayout(new FlowLayout());
		
		label1 = new Label("Counter");
		
		textField1 = new TextField(count + "", 10);
		
		button = new Button("Count");
		button.addActionListener(this);
		
		setTitle("AWT Counter");
		setSize(250, 100);
		add(label1);
		add(textField1);
		add(button);
		
		addWindowListener(new MyWindowListener());
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent x) {
		count ++;
		textField1.setText(count + "");
	}
	
	static class MyWindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		new AWTCounter();
	}
}
