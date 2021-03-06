package lesson8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartNewGameWindow extends JFrame {

    private final GameWindow gameWindow;

    private static final int WIN_HEIGHT = 230;
    private static final int WIN_WIDTH = 350;
    // минимальная победная длина для игры
    private static final int MIN_WIN_LEN = 3;
    // мкасим победная длина
    private static final int MAX_WIN_LEN = 10;

    // размеры поля
    private static final int MIN_FIELD_SIZE = 3;
    private static final int Max_FIELD_SIZE = 10;

    private static final String STR_WIN_LEN = "Winning length: ";
    private static final String STR_FIELD_SIZE = "Field size: ";

    private JRadioButton jrbHumVsAi = new JRadioButton("Human vs Ai", true);
    private JRadioButton jrbHumVsHum = new JRadioButton("Human vs Human");
    private ButtonGroup gameMode = new ButtonGroup();

    // слайдеры
    private JSlider slFieldSize;
    private JSlider slWinLength;


    public StartNewGameWindow(GameWindow gameWindow) {
        this.gameWindow = gameWindow;


        setSize(WIN_WIDTH, WIN_HEIGHT);

        setTitle("New game parameters");

        // хранит инф о главном окне (нужно для вычисления координат настроечного окна
        Rectangle gameWindowBounds = gameWindow.getBounds();
        int posX = (int) (gameWindowBounds.getCenterX() - WIN_WIDTH / 2);
        int posY = (int) (gameWindowBounds.getCenterY() - WIN_HEIGHT / 2);
        setLocation(posX, posY);

        setLayout(new GridLayout(10, 1));

        addGameControlMode();
        addGameFieldWinLength();

        JButton btnStartGame = new JButton("Start Game");
        btnStartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnStartGameClick();
            }
        });
        add(btnStartGame);

        setVisible(false);
    }

    private void btnStartGameClick() {

        int gameMode;
        if (jrbHumVsAi.isSelected()){
            gameMode = Map.MODE_H_V_A;
        } else {
            gameMode = Map.MODE_H_V_H;
        }

        int fieldSize = slFieldSize.getValue();
        int winLength = slWinLength.getValue();

        gameWindow.startNewGame(gameMode, fieldSize, fieldSize, winLength);

        setVisible(false);
    }
    
    private void addGameControlMode() {
        add(new JLabel("Choose game's mode"));

        gameMode.add(jrbHumVsAi);
        gameMode.add(jrbHumVsHum);
        add(jrbHumVsAi);
        add(jrbHumVsHum);

    }

    private void addGameFieldWinLength() {
        add(new JLabel("Choose field's size"));

        JLabel lblFieldSize = new JLabel(STR_FIELD_SIZE + MIN_FIELD_SIZE);
        add(lblFieldSize);

        slFieldSize = new JSlider(MIN_FIELD_SIZE, Max_FIELD_SIZE, MIN_FIELD_SIZE);

        slFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentFieldSize = slFieldSize.getValue();
                lblFieldSize.setText(STR_FIELD_SIZE + currentFieldSize);

                // ограничиваем длиу победы длиной поля
                slWinLength.setMaximum(currentFieldSize);
            }
        });

        add(slFieldSize);

        add(new JLabel("Choose winning length: "));

        JLabel lblWinLen = new JLabel(STR_WIN_LEN + MIN_WIN_LEN);
        add(lblWinLen);

        slWinLength = new JSlider(MIN_WIN_LEN, MAX_WIN_LEN, MIN_WIN_LEN);

        slWinLength.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lblWinLen.setText(STR_WIN_LEN + slWinLength.getValue());
            }
        });

        add(slWinLength);

    }
}
