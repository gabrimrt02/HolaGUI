package dad;

import java.awt.*;

public class HolaMundoAWT {
    public static void main(String[] args) {
            
        Label saludarLabel = new Label();
        saludarLabel.setText("Aquí saldra el saludo");
        saludarLabel.setBounds(20, 20, 120, 50);

        Button saludarButton = new Button();
        saludarButton.setLabel("Saludar");
        saludarButton.setBounds(20, 80, 120, 30);

        saludarButton.addActionListener(l -> saludarLabel.setText("¡Hola Mundo!"));

        Panel rootPanel = new Panel();
        rootPanel.setLayout(null);
        rootPanel.add(saludarLabel);
        rootPanel.add(saludarButton);

        Frame frame = new Frame();
        frame.setTitle("Hola Mundo con AWT");
        frame.setSize(320, 200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        // frame.addWindowListener(new WindowAdapter() {
        //     public void windowClosing(WindowEvent e) {
        //         frame.dispose();
        //     }
        // });
        frame.add(rootPanel);
        frame.setVisible(true);
    }
}
