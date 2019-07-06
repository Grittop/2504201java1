package lesson7a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    public MyWindow() {

        setBounds(400, 200, 500, 500);
        setTitle("MyWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // элементы будут др за другом + адаптация под экран
        // setLayout(new FlowLayout());

        // элементы 2 колонки и 2 столбца
        // setLayout(new GridLayout(2, 2));

        JTextArea textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);

        JButton btn1 = new JButton("btn #1");
        add(btn1, BorderLayout.NORTH);
        // размеры кнопки
        btn1.setPreferredSize(new Dimension(100, 100));
        // действие при нажатии
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(" press btn1");
                //вывод текста в окно
                textArea.append(" press btn1\n");
            }
        });


        // объединяем 2 кнопки btn2 и btn3 в одну панель, тк обе в SOUTH и btn3 не будет видно
        JPanel sPanel = new JPanel(new GridLayout(1, 2));

        JButton btn2 = new JButton("Exit");
        sPanel.add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton btn3 = new JButton("btn3");
        sPanel.add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //SOUTH убираем в btn2 и btn3 и добавляем sPanel в SOUTH
        add(sPanel, BorderLayout.SOUTH);

        // показать экран
        setVisible(true);
    }
}
