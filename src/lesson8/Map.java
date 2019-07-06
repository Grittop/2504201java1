package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Map extends JPanel {

    public static final int MODE_H_V_A =0;
    public static final int MODE_H_V_H =1;

    int [][] field;
    int fieldSizeX;
    int fieldSizeY;
    int winLength;

    int cellHeight;
    int cellWidht;

    boolean isInit = false;


    public Map() {
        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                update(e);
            }
        });
    }

    private void update(MouseEvent e) {
        int cellX = e.getX() / cellWidht;
        int cellY = e.getY() / cellHeight;
        System.out.println(cellX + " " + cellY);
        repaint();
    }

    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength){
        System.out.println(mode + " " + fieldSizeX + " " + fieldSizeY + " " + winLength);

        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.winLength = winLength;
        field = new int[fieldSizeX][fieldSizeY];

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
        if (!isInit){
            return;
        }
        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidht = panelWidth / fieldSizeX;

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0,y,panelWidth,y);
        }

        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidht;
            g.drawLine(x,0,x,panelHeight);
        }

        // рисуем "нолик"
        g.drawOval(2,2, cellWidht-4,cellHeight-4);

    }
}
