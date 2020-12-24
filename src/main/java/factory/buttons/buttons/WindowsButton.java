package factory.buttons.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//concrete product

public class WindowsButton implements Button {

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    public void render () {

        JLabel label = new JLabel("Hello, World!");
        label.setOpaque(true);
        label.setBackground(new Color(235,233,126));
        label.setFont(new Font("Dialog", Font.BOLD,44));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(label);

        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        onClick();

    }

    public void onClick() {

        button = new JButton("Exit");
        panel.add(button);

        button.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }



    public static void main(String[] args) {
        new WindowsButton().render();
    }
}
