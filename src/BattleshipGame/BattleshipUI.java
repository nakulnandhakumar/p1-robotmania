package BattleshipGame;

import javax.swing.*;
import java.awt.*;

public class BattleshipUI {
    public JPanel panel1;
    private JButton button18;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button21;
    private JButton button22;
    private JButton button23;
    private JButton button24;
    private JButton button25;
    private JButton button31;
    private JButton button41;
    private JButton button42;
    private JButton button43;
    private JButton button44;
    private JButton button45;
    private JButton button46;
    private JButton button47;
    private JButton button48;
    private JButton button51;
    private JButton button61;
    private JButton button71;
    private JButton button81;
    private JButton button11;
    private JLabel x1;
    private JLabel x2;
    private JLabel x3;
    private JLabel x4;
    private JLabel x5;
    private JLabel x6;
    private JLabel x7;
    private JLabel x8;
    private JLabel y8;
    private JLabel y7;
    private JLabel y6;
    private JLabel y5;
    private JLabel y4;
    private JLabel y3;
    private JLabel y2;
    private JLabel y1;
    private JButton button26;
    private JButton button27;
    private JButton button28;
    private JButton button32;
    private JButton button33;
    private JButton button34;
    private JButton button35;
    private JButton button36;
    private JButton button37;
    private JButton button38;
    private JButton button52;
    private JButton button62;
    private JButton button72;
    private JButton button82;
    private JButton button83;
    private JButton button73;
    private JButton button63;
    private JButton button53;
    private JButton button54;
    private JButton button64;
    private JButton button74;
    private JButton button84;
    private JButton button85;
    private JButton button75;
    private JButton button65;
    private JButton button55;
    private JButton button56;
    private JButton button66;
    private JButton button76;
    private JButton button86;
    private JButton button87;
    private JButton button77;
    private JButton button67;
    private JButton button57;
    private JButton button58;
    private JButton button68;
    private JButton button78;
    private JButton button88;
    private JLabel TurnsTitleLabel;
    private JLabel TurnsRemaining;


    public BattleshipUI(BattleshipControl battleshipControl){
        button11.addActionListener(e -> {           //here starts all the 64 button definitions and activation methods
            battleshipControl.game(button11.getText(), button11);
        });
        button12.addActionListener(e -> {
            battleshipControl.game(button12.getText(), button12);
        });
        button13.addActionListener(e -> {
            battleshipControl.game(button13.getText(), button13);
        });
        button14.addActionListener(e -> {
            battleshipControl.game(button14.getText(), button14);
        });
        button15.addActionListener(e -> {
            battleshipControl.game(button15.getText(), button15);
        });
        button16.addActionListener(e -> {
            battleshipControl.game(button16.getText(), button16);
        });
        button17.addActionListener(e -> {
            battleshipControl.game(button17.getText(), button17);
        });
        button18.addActionListener(e -> {
            battleshipControl.game(button18.getText(), button18);
        });
        button21.addActionListener(e -> {
            battleshipControl.game(button21.getText(), button21);
        });
        button22.addActionListener(e -> {
            battleshipControl.game(button22.getText(), button22);
        });
        button23.addActionListener(e -> {
            battleshipControl.game(button23.getText(), button23);
        });
        button24.addActionListener(e -> {
            battleshipControl.game(button24.getText(), button24);
        });
        button25.addActionListener(e -> {
            battleshipControl.game(button25.getText(), button25);
        });
        button26.addActionListener(e -> {
            battleshipControl.game(button26.getText(), button26);
        });
        button27.addActionListener(e -> {
            battleshipControl.game(button27.getText(), button27);
        });
        button28.addActionListener(e -> {
            battleshipControl.game(button28.getText(), button28);
        });
        button31.addActionListener(e -> {
            battleshipControl.game(button31.getText(), button31);
        });
        button32.addActionListener(e -> {
            battleshipControl.game(button32.getText(), button32);
        });
        button33.addActionListener(e -> {
            battleshipControl.game(button33.getText(), button33);
        });
        button34.addActionListener(e -> {
            battleshipControl.game(button34.getText(), button34);
        });
        button35.addActionListener(e -> {
            battleshipControl.game(button35.getText(), button35);
        });
        button36.addActionListener(e -> {
            battleshipControl.game(button36.getText(), button36);
        });
        button37.addActionListener(e -> {
            battleshipControl.game(button37.getText(), button37);
        });
        button38.addActionListener(e -> {
            battleshipControl.game(button38.getText(), button38);
        });
        button41.addActionListener(e -> {
            battleshipControl.game(button41.getText(), button41);
        });
        button42.addActionListener(e -> {
            battleshipControl.game(button42.getText(), button42);
        });
        button43.addActionListener(e -> {
            battleshipControl.game(button43.getText(), button43);
        });
        button44.addActionListener(e -> {
            battleshipControl.game(button44.getText(), button44);
        });
        button45.addActionListener(e -> {
            battleshipControl.game(button45.getText(), button45);
        });
        button46.addActionListener(e -> {
            battleshipControl.game(button46.getText(), button46);
        });
        button47.addActionListener(e -> {
            battleshipControl.game(button47.getText(), button47);
        });
        button48.addActionListener(e -> {
            battleshipControl.game(button48.getText(), button48);
        });
        button51.addActionListener(e -> {
            battleshipControl.game(button51.getText(), button51);
        });
        button52.addActionListener(e -> {
            battleshipControl.game(button52.getText(), button52);
        });
        button53.addActionListener(e -> {
            battleshipControl.game(button53.getText(), button53);
        });
        button54.addActionListener(e -> {
            battleshipControl.game(button54.getText(), button54);
        });
        button55.addActionListener(e -> {
            battleshipControl.game(button55.getText(), button55);
        });
        button56.addActionListener(e -> {
            battleshipControl.game(button56.getText(), button56);
        });
        button57.addActionListener(e -> {
            battleshipControl.game(button57.getText(), button57);
        });
        button58.addActionListener(e -> {
            battleshipControl.game(button58.getText(), button58);
        });
        button61.addActionListener(e -> {
            battleshipControl.game(button61.getText(), button61);
        });
        button62.addActionListener(e -> {
            battleshipControl.game(button62.getText(), button62);
        });
        button63.addActionListener(e -> {
            battleshipControl.game(button63.getText(), button63);
        });
        button64.addActionListener(e -> {
            battleshipControl.game(button64.getText(), button64);
        });
        button65.addActionListener(e -> {
            battleshipControl.game(button65.getText(), button65);
        });
        button66.addActionListener(e -> {
            battleshipControl.game(button66.getText(), button66);
        });
        button67.addActionListener(e -> {
            battleshipControl.game(button67.getText(), button67);
        });
        button68.addActionListener(e -> {
            battleshipControl.game(button68.getText(), button68);
        });
        button71.addActionListener(e -> {
            battleshipControl.game(button71.getText(), button71);
        });
        button72.addActionListener(e -> {
            battleshipControl.game(button72.getText(), button72);
        });
        button73.addActionListener(e -> {
            battleshipControl.game(button73.getText(), button73);
        });
        button74.addActionListener(e -> {
            battleshipControl.game(button74.getText(), button74);
        });
        button75.addActionListener(e -> {
            battleshipControl.game(button75.getText(), button75);
        });
        button76.addActionListener(e -> {
            battleshipControl.game(button76.getText(), button76);
        });
        button77.addActionListener(e -> {
            battleshipControl.game(button77.getText(), button77);
        });
        button78.addActionListener(e -> {
            battleshipControl.game(button78.getText(), button78);
        });
        button81.addActionListener(e -> {
            battleshipControl.game(button81.getText(), button81);
        });
        button82.addActionListener(e -> {
            battleshipControl.game(button82.getText(), button82);
        });
        button83.addActionListener(e -> {
            battleshipControl.game(button83.getText(), button83);
        });
        button84.addActionListener(e -> {
            battleshipControl.game(button84.getText(), button84);
        });
        button85.addActionListener(e -> {
            battleshipControl.game(button85.getText(), button85);
        });
        button86.addActionListener(e -> {
            battleshipControl.game(button86.getText(), button86);
        });
        button87.addActionListener(e -> {
            battleshipControl.game(button87.getText(), button87);
        });
        button88.addActionListener(e -> {
            battleshipControl.game(button88.getText(), button88);

        });

        x1.setForeground(Color.WHITE);
        x2.setForeground(Color.GREEN);
        x3.setForeground(Color.GREEN);
        x4.setForeground(Color.GREEN);
        x5.setForeground(Color.GREEN);
        x6.setForeground(Color.GREEN);
        x7.setForeground(Color.GREEN);
        x8.setForeground(Color.GREEN);
        y1.setForeground(Color.GREEN);
        y2.setForeground(Color.GREEN);
        y3.setForeground(Color.GREEN);
        y4.setForeground(Color.GREEN);
        y5.setForeground(Color.GREEN);
        y6.setForeground(Color.GREEN);
        y7.setForeground(Color.GREEN);
        y8.setForeground(Color.GREEN);
    }

}
