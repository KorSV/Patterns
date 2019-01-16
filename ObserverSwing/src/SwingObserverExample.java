import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(200,100));
        JButton button = new JButton("Click me");
        button.addActionListener(new OneListener());
        button.addActionListener(new TwoListener());
        button.addActionListener(new Printer());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setVisible(true);
    }

    class OneListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Fire One Listener");
        }
    }

    class TwoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Fire Two Listener");
        }
    }
}
