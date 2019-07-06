package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    // размеры и позиция окна
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_WIDTH = 505;
    private static final int WIN_POINT_X = 500;
    private static final int WIN_POINT_Y = 300;

    private static StartNewGameWindow startNewGameWindow;

    // игровое поле
    private static Map field;

   // конструктор
    public GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // размеры для окна
        setBounds(WIN_POINT_X, WIN_POINT_Y, WIN_WIDTH, WIN_HEIGHT);

        // заголовок
        setTitle("Tic Tac Toe");



        JPanel jPanel = new JPanel(new GridLayout(1, 2));

        JButton btnNewGame = new JButton("Start new game");
        JButton btnExit = new JButton("Exit game");
        jPanel.add(btnNewGame);
        jPanel.add(btnExit);

        startNewGameWindow = new StartNewGameWindow(this);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnNewGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGameWindow.setVisible(true);
            }
        });

        add(jPanel, BorderLayout.SOUTH);

        //инициализируем игровое поле
        field = new Map();
        add(field, BorderLayout.CENTER);
//        getContentPane().add(field, BorderLayout.CENTER);

        // сделать окно видимым
        setVisible(true);
    }

    public void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength){
        field.startNewGame(mode, fieldSizeX, fieldSizeY, winLength);
    }
}
