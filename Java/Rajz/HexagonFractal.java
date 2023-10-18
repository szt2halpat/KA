import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class HexagonFractal extends JPanel {
    private int depth;

    public HexagonFractal(int depth) {
        this.depth = depth;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        drawHexagonFractal(g2d, getWidth() / 2, getHeight() / 2, 200, depth);
    }

    private void drawHexagonFractal(Graphics2D g2d, double x, double y, double size, int depth) {
        if (depth == 0) {
            Polygon hexagon = createHexagon(x, y, size);
            g2d.setColor(Color.BLACK);
            g2d.fill(hexagon);
        } else {
            size /= 2;
            depth--;
            for (int i = 0; i < 6; i++) {
                double angle = 2 * Math.PI * i / 6;
                double newX = x + size * 2 * Math.cos(angle);
                double newY = y + size * 2 * Math.sin(angle);
                drawHexagonFractal(g2d, newX, newY, size, depth);
            }
        }
    }

    private Polygon createHexagon(double x, double y, double size) {
        Polygon hexagon = new Polygon();
        for (int i = 0; i < 6; i++) {
            double angle = 2 * Math.PI * i / 6;
            int xPos = (int) (x + size * Math.cos(angle));
            int yPos = (int) (y + size * Math.sin(angle));
            hexagon.addPoint(xPos, yPos);
        }
        return hexagon;
    }

    public static void main(String[] args) {
        int depth = 4; // Just change the depth to control the level of detail
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hexagon Fractal");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new HexagonFractal(depth));
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
