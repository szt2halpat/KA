import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class SierpinskiTriangle extends JPanel {
    private int depth;

    public SierpinskiTriangle(int depth) {
        this.depth = depth;
        setPreferredSize(new Dimension(800, 800));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point2D.Double p1 = new Point2D.Double(400, 700); // Pontok megfordítva
        Point2D.Double p2 = new Point2D.Double(100, 100); // Pontok megfordítva
        Point2D.Double p3 = new Point2D.Double(700, 100); // Pontok megfordítva
        drawInvertedSierpinski(g, p1, p2, p3, depth);
    }

    private void drawInvertedSierpinski(Graphics g, Point2D.Double p1, Point2D.Double p2, Point2D.Double p3, int depth) {
        if (depth == 0) {
            int[] xPoints = {(int) p1.getX(), (int) p2.getX(), (int) p3.getX()};
            int[] yPoints = {(int) p1.getY(), (int) p2.getY(), (int) p3.getY()};
            g.setColor(Color.BLACK);
            g.fillPolygon(xPoints, yPoints, 3);
        } else {
            Point2D.Double mid1 = midpoint(p1, p2);
            Point2D.Double mid2 = midpoint(p2, p3);
            Point2D.Double mid3 = midpoint(p1, p3);

            drawInvertedSierpinski(g, p1, mid1, mid3, depth - 1);
            drawInvertedSierpinski(g, mid1, p2, mid2, depth - 1);
            drawInvertedSierpinski(g, mid3, mid2, p3, depth - 1);
        }
    }

    private Point2D.Double midpoint(Point2D.Double p1, Point2D.Double p2) {
        return new Point2D.Double((p1.getX() + p2.getX()) / 2, (p1.getY() + p2.getY()) / 2);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Inverted Sierpinski Triangle");
        SierpinskiTriangle invertedSierpinski = new SierpinskiTriangle(5); // Change depth as needed
        frame.add(invertedSierpinski);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
