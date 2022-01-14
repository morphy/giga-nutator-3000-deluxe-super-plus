import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Frame extends JFrame {
    final String title = "Giga Nutator 3000 DeluXe Super Plus";
    final int SCREEN_WIDTH = 1280;
    final int SCREEN_HEIGHT = 1024;

    public Frame() {
        this.setLayout(null);
        this.setTitle(this.title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);
        this.setVisible(true);
        this.setSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setLocationRelativeTo(null);

        this.add(new Keys(
                this.getBounds().getSize().width / 2 - 240,
                this.getBounds().getSize().height - 280 - 60
        ));
    }
}
