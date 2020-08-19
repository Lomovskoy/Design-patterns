package observer;

import javax.swing.*;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Я должен сделать это?");
        button.addActionListener(event -> System.out.println("Нельзя сделать это, необходимо зарегестрироваться!"));
        button.addActionListener(event -> System.out.println("Давай, сделай это!"));
    }
}
