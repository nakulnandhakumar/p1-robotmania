package HangbotGame;// Created by Sanvi Pal

import javax.swing.*;
import java.awt.*;

public class HangbotGUI extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();

        //g.setColor(Color.RED);
        //g.drawRect(w/4, h/4,w/2,h/2);

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i = t.getImage("images.png");
        g.drawImage(i, 0, 0,this);

    }
}
