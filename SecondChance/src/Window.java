import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    final int SIZE = 12;
    int spacing = 1;
    public Window() {
        this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        Board board = new Board();
        this.setContentPane(board);
    }

    public class Board extends JPanel {
        public void paint(Graphics g) {
            g.setColor(Color.DARK_GRAY);
            g.fillRect(0, 0, 800, 800);
            g.setColor(Color.RED);
            for (int i = 0; i < SIZE ; i++) {
                for (int j = 0; j < SIZE ; j++) {
                    g.fillRect(spacing+i*60,spacing+j*60, 60-2*spacing, 60-2*spacing);
                    g.setColor(Color.RED);

                }
            }
        }
    }
}

