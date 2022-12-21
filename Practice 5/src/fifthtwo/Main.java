package fifthtwo;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

class Main extends JPanel {
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        Random rand = new Random();
        for (int i = 0; i<20; i++){
            int choice = rand.nextInt(3);
            switch (choice){
                case (1):
                    g2d.fillRect(rand.nextInt(50) + 20, rand.nextInt(200) + 20, 50, 50);
                    g2d.setPaint(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                    break;
                case (2):
                    g2d.fill(new Ellipse2D.Double(rand.nextInt(200) + 20, rand.nextInt(100) + 20, 80, 100));
                    g2d.setPaint(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                    break;
                case(3):
                    g2d.fillOval(rand.nextInt(300) + 20, rand.nextInt(100) + 20, 50, 50);
                    g2d.setPaint(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
                    break;
            }
        }
    }

}