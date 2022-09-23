package dad;

import javax.swing.*;

public class HolaMundoSWING {
    public static void main(String[] args) {
            
        JLabel saludarLabel = new JLabel();
        saludarLabel.setText("Aquí saldra el saludo");
        saludarLabel.setBounds(20, 20, 120, 50);

        JButton saludarButton = new JButton();
        saludarButton.setText("Saludar");
        saludarButton.setBounds(20, 80, 120, 30);

        saludarButton.addActionListener(l -> saludarLabel.setText("¡Hola Mundo!"));

        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(null);
        rootPanel.add(saludarLabel);
        rootPanel.add(saludarButton);

        JFrame frame = new JFrame();
        frame.setTitle("Hola Mundo con SWING");
        frame.setSize(320, 200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(rootPanel);
        frame.setVisible(true);
    }
}
