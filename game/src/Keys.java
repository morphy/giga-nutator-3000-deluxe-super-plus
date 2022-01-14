import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Keys extends JLayeredPane implements ActionListener {
    private final BlackKey ch;
    private final BlackKey dh;
    private final BlackKey fh;
    private final BlackKey gh;
    private final BlackKey ah;
    private final WhiteKey c;
    private final WhiteKey d;
    private final WhiteKey e;
    private final WhiteKey f;
    private final WhiteKey g;
    private final WhiteKey a;
    private final WhiteKey h;

    public Keys(int x, int y) {
        this.setLayout(null);
        this.setSize(480, 280);

        ch = new BlackKey(45);
        dh = new BlackKey(105);
        fh = new BlackKey(225);
        gh = new BlackKey(285);
        ah = new BlackKey(345);
        c = new WhiteKey(0, "C");
        d = new WhiteKey(60, "D");
        e = new WhiteKey(120, "E");
        f = new WhiteKey(180, "F");
        g = new WhiteKey(240, "G");
        a = new WhiteKey(300, "A");
        h = new WhiteKey(360, "H");

        ch.addActionListener(this);
        dh.addActionListener(this);
        fh.addActionListener(this);
        gh.addActionListener(this);
        ah.addActionListener(this);
        c.addActionListener(this);
        d.addActionListener(this);
        e.addActionListener(this);
        f.addActionListener(this);
        g.addActionListener(this);
        a.addActionListener(this);
        h.addActionListener(this);

        this.add(ch, new Integer(1));
        this.add(dh, new Integer(1));
        this.add(fh, new Integer(1));
        this.add(gh, new Integer(1));
        this.add(ah, new Integer(1));
        this.add(c, new Integer(0));
        this.add(d, new Integer(0));
        this.add(e, new Integer(0));
        this.add(f, new Integer(0));
        this.add(g, new Integer(0));
        this.add(a, new Integer(0));
        this.add(h, new Integer(0));

        this.setLocation(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();

        if(source == c) System.out.println("c");
        else if(source == d) System.out.println("d");
        else if(source == e) System.out.println("e");
        else if(source == f) System.out.println("f");
        else if(source == g) System.out.println("g");
        else if(source == a) System.out.println("a");
        else if(source == h) System.out.println("h");
        else if(source == ch) System.out.println("ch");
        else if(source == dh) System.out.println("dh");
        else if(source == fh) System.out.println("fh");
        else if(source == gh) System.out.println("gh");
        else if(source == ah) System.out.println("ah");
    }

    static class WhiteKey extends JButton {
        public WhiteKey(int x, String label) {
            this.setBackground(Color.WHITE);
            this.setSize(60, 280);
            this.setLocation(x, 0);
            this.setBorder(new LineBorder(Color.BLACK));
            this.setText(label);
            this.setFocusPainted(false);
            this.setFont(new Font("Arial", Font.BOLD, 24));
            this.setVerticalAlignment(SwingConstants.BOTTOM);
        }
    }

    static class BlackKey extends JButton {
        public BlackKey(int x) {
            this.setBackground(Color.BLACK);
            this.setSize(30, 180);
            this.setLocation(x, 0);
            this.setBorder(new LineBorder(Color.BLACK));
        }
    }
}