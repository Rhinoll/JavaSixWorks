package fifone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FirstGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Milan vs Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 75);
        JPanel buttons = new JPanel();
        buttons.setPreferredSize(new Dimension(500, 75));

        JButton Milan = new JButton("AC Milan");
        JButton Madrid = new JButton("Real Madrid");

        buttons.add(Milan, BorderLayout.SOUTH);
        buttons.add(Madrid, BorderLayout.SOUTH);

        frame.getContentPane().add(buttons, BorderLayout.SOUTH);
        JPanel grid = new JPanel(new GridLayout(1,2,50,100));
        JLabel Result = new JLabel("Результат: 0 X 0 ", JLabel.LEFT);
        JLabel LastScorer = new JLabel("Послденим забил: ", JLabel.RIGHT);
        JLabel Winner = new JLabel("Победитель: ", JLabel.LEFT);

        grid.add(Result);
        grid.add(LastScorer);
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEFT));
        flow.add(grid);

        frame.add(flow, BorderLayout.NORTH);
        frame.add(Winner, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        final int[] test = {0, 0};
        Milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test[0] +=1;
                Winner.setText(test[0]>test[1]?"Победитель: AC Milan" : test[0]<test[1]?"Победитель: Real Madrid":"Победитель: Ничья");
                Result.setText("Результат: " + String.valueOf(test[0]) + " X " + String.valueOf(test[1]));
                LastScorer.setText("Последний забивший: AC Milan");
            }
        });
        Madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                test[1] +=1;
                Winner.setText(test[0]>test[1]?"Победитель: AC Milan" : test[0]<test[1]?"Победитель: Real Madrid":"Победитель: Ничья");
                Result.setText("Результат: " + String.valueOf(test[0]) + " X " + String.valueOf(test[1]));
                LastScorer.setText("Последний забивший: Real Madrid");
            }
        });

    }
}