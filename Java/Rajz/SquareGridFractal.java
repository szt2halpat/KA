import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class SquareGridFractal extends JPanel {
    private int depth;

    public SquareGridFractal(int depth) {
        this.depth = depth;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();
        int size = Math.min(width, height);

        drawSquareGridFractal(g2d, width / 2 - size / 2, height / 2 - size / 2, size, depth);
    }

    private void drawSquareGridFractal(Graphics2D g2d, int x, int y, int size, int depth) {
        if (depth == 0) {
            g2d.setColor(Color.BLACK);
            g2d.draw(new Rectangle(x, y, size, size));
        } else {
            int newSize = size / 3;
            depth--;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i != 1 || j != 1) {
                        drawSquareGridFractal(g2d, x + i * newSize, y + j * newSize, newSize, depth);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int depth = 4; // N iterations
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Fractal Square Grid");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new SquareGridFractal(depth));
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
