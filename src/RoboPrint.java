
// Created by Sanvi Pal

import javax.swing.*;
import java.awt.*;

class RoboPrint {


    public  final String ANSI_GREEN = "\u001B[32m";
    public  final String ANSI_RESET = "\u001B[0m";
    public  final String ANSI_RED = "\u001B[31m";

    String[][] robot ={

            {"       _           |",
                    "      [ ]          |",
                    "     (. .)         |",
                    "      |>|          |",
                    "   __/===\\__       |",
                    "  //| o=o |\\\\      |",
                    "<]  | o=o |  [>    |",
                    "   / / | \\ \\       |",
                    "    \\=====/        |",
                    "   <_______>       |",
                    "                   |",
                    "                   |",
                    "                   |",
            },
    };


    public void Printy(String[] p_lines) {

        for (int i = 0; i < robot[0].length; i++){
            if (p_lines.length >= i+1){
                System.out.println(ANSI_GREEN + robot[0][i] + ANSI_RED + p_lines[i]+ANSI_RESET);
            } else {
                System.out.println(ANSI_GREEN + robot[0][i]);
            }
        }
    }

    public void Printy(int nLines) {

        for (int i = 0; i < robot[0].length && 0 != nLines; i++){
            System.out.println(ANSI_GREEN + robot[0][i]);
            nLines--;
        }
    }

    public void Printy() {
        JFrame window = new JFrame("RoboUI");
        window.setBounds(125,125,220,350);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel canvas = new RoboUI();
        canvas.setBackground(Color.WHITE);
        window.getContentPane().add(canvas);
        window.setVisible(true);
    }

}
