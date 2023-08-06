package observerPattern.swingObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        jFrame = new JFrame();
        JButton jButton = new JButton("할까? 말까?");
//        jButton.addActionListener(new AngelListener());
//        jButton.addActionListener(new DevilListener());
        jButton.addActionListener(e -> System.out.println("하지 마! 아마 후회할 걸?"));
        jButton.addActionListener(e -> System.out.println("그냥 저질러 버렷!!!"));

        jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

    /* 옵저버 클래스 정의가 들어가는 부분으로 내부 클래스로 정의 */
    private class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("하지 마! 아마 후회할 걸?");
        }
    }

    private class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러 버렷!!!");
        }
    }
}
