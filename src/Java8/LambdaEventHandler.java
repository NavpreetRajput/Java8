package Java8;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;

public class LambdaEventHandler extends JFrame {
    JButton button;

    public LambdaEventHandler() {
        setTitle("Button Action with Lambda Expression");
        setSize(500, 400);
        setVisible(true); 
        // setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button = new JButton("Button");
        button.setBounds(100, 100, 100, 40);
        /**
         * Following code is the way to handle events without lambdas.
         *
         * button.addActionListener(new ActionListener(){ public void
         * actionPerformed(ActionEvent e){ System.out.println("You clicked the
         * button.");
         * 
         * } });
         */

        /**
         * This is event handler with the lambda expression.
         */
        button.addActionListener(e -> System.out.println("You clicked the button"));
        add(button);

    }

    public static void main(String[] args) {
        // Calling the Constructor
        new LambdaEventHandler();

    }

}


