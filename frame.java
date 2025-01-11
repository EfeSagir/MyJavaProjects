import javax.sql.rowset.JdbcRowSet;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class frame extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    frame() {



        JButton button1 = new JButton();
//        button.setIconTextGap(-15); in the further time if you want to use mages within the text to solve the bad looking gap problems you can use this.

        button1.setBounds(50, 100, 50, 50);
        button1.addActionListener(this);
        button1.addActionListener(a -> System.out.println(1));
        button1.setText("1");
        button1.setFocusable(false);
        button1.setHorizontalTextPosition(JButton.CENTER); // these two center and bottom codelines put your image abve your text 1 +-/* etc.
        button1.setVerticalTextPosition(JButton.BOTTOM);
        button1.setFont(new Font("Comic Sans",Font.BOLD,25));
        button1.setForeground(new Color(6, 124, 243));
        button1.setBackground(new Color(3, 44, 82));
        button1.setBorder(BorderFactory.createEtchedBorder());
        button1.setOpaque(true);

        JLabel label = new JLabel();
        this.add(label);
        Border border = BorderFactory.createLineBorder(new Color(224, 174, 10));
        label.setBorder(border);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,170));
        panel.setBackground(Color.pink);
        panel.setLayout(new GridLayout(5,3));



        this.setSize(270, 310);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(true);
        ImageIcon image = new ImageIcon("Calculator.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.magenta);
//        this.add(button1);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,50));

         panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("+"));
        panel.add(new JButton("0"));
        panel.add(new JButton("/"));
        panel.add(new JButton("-"));
        panel.add(new JButton("="));
        panel.add(new JButton("*"));

        this.add(panel);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("poo");
        }
    }
}
