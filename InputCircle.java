import javax.swing.JFrame;

public class InputCircle extends JFrame {
	InputCircle(int x, int y) {
		this.add(new CircleTest(x, y));
		this.setTitle("Circle");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
