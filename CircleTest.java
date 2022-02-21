import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CircleTest extends JPanel {

    private static final int SIZE = 1000;
    private int a = SIZE / 2;
    private int b = a;
    private int r = 4 * SIZE / 5;
    private int n;
    private int mult;

    /** @param n  the desired number of circles. */
    public CircleTest(int n, int mult) {
        super(true);
        this.setPreferredSize(new Dimension(SIZE, SIZE));
        this.n = n;
        this.mult = mult;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.black);
        a = getWidth() / 2;
        b = getHeight() / 2;
        int m = Math.min(a, b);
        r = 4 * m / 5;
        int r2 = Math.abs(m - r) / 40;
        g2d.drawOval(a - r, b - r, 2 * r, 2 * r);
        g2d.setColor(Color.blue);
        for (int i = 0; i < n; i++) {
            double t1 = 2 * Math.PI * i / n;
            int x1 = (int) Math.round(a - r * Math.sin(t1));
            int y1 = (int) Math.round(b - r * Math.cos(t1));
            double t2 = 2 * Math.PI * (i * mult) / n;
            int x2 = (int) Math.round(a - r * Math.sin(t2));
            int y2 = (int) Math.round(b - r * Math.cos(t2));
            g2d.fillOval(x1 - r2, y1 - r2, 2 * r2, 2 * r2);
            g.drawLine(x1 , y1, x2, y2);
        }
    }

    private static void create() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new CircleTest(10, 2));
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {

        @Override
        public void run() {
            create();
        }
    });
}
}
  