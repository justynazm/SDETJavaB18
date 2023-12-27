package class21;

import javax.swing.*;
import java.awt.*;


        public class ChristmasTree extends JFrame {
            public ChristmasTree(){
            setTitle("Christmas Tree");
            setSize(400, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            add(new TreePanel());
        }

        public static void main(String[] args) {
            EventQueue.invokeLater(() -> {
                ChristmasTree tree = new ChristmasTree();
                tree.setVisible(true);
            });
        }
    }

    class TreePanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawTree(g);
        }

        private void drawTree(Graphics g) {
            g.setColor(Color.GREEN);

            int[] xPoints = {200, 150, 250};
            int[] yPoints = {50, 200, 200};
            g.fillPolygon(xPoints, yPoints, 3);

            g.setColor(new Color(139, 69, 19)); // Brown color for tree trunk
            g.fillRect(190, 200, 20, 50);

            g.setColor(Color.RED);
            g.fillOval(180, 30, 40, 40); // Red ornament
            g.fillOval(190, 50, 20, 20); // Red ornament
            g.fillOval(180, 70, 40, 40); // Red ornament
        }
    }

