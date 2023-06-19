package cancer.data.analytics.cancerDataAnalytics.view;

import javax.swing.*;
import java.awt.*;

public class MenuScreen {
    public static void main(String[] args) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, fall back to cross-platform
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ex) {
                // Not worth my time
            }
        }

        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(143, 61, 61)); // Cor de fundo azul claro

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(218, 214, 214)); // Cor de fundo azul escuro

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10, 10, 10, 10); // Espaçamento interno dos botões

        JLabel titleLabel = new JLabel("Cancer Data Analytics: Menu");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(215, 104, 104));

        JButton cancerButton = new JButton("Cancer database");
        JButton gasButton = new JButton("Gas emission database");
        JButton biButton = new JButton("BI: graphics");
        JButton curiosidadesButton = new JButton("BI: text and curiosity");


        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        Color buttonColor = new Color(215, 104, 104); // Cor azul escuro
        Color textColor = Color.WHITE;

        cancerButton.setFont(buttonFont);
        cancerButton.setBackground(buttonColor);
        cancerButton.setForeground(textColor);

        gasButton.setFont(buttonFont);
        gasButton.setBackground(buttonColor);
        gasButton.setForeground(textColor);

        biButton.setFont(buttonFont);
        biButton.setBackground(buttonColor);
        biButton.setForeground(textColor);

        curiosidadesButton.setFont(buttonFont);
        curiosidadesButton.setBackground(buttonColor);
        curiosidadesButton.setForeground(textColor);

        cancerButton.addActionListener(e -> {
            // Abra a tela de exibição dos dados de câncer
            CancerDataScreen.showCancerData();
        });

        gasButton.addActionListener(e -> {
            // Abra a tela de exibição dos dados de emissão de gases
            GasDataScreen.showGasData();
        });

        biButton.addActionListener(e -> {
            // Abra a tela de exibição de imagens com os botões de próximo e anterior
            BIScreen.showBI();
        });

        curiosidadesButton.addActionListener(e -> {
            // Abra a tela de exibição de curiosidades
            CuriosidadesScreen.showCuriosidades();
        });

        String imagePath = "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\pulmoes.gif";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);
        constraints.gridy = 1;
        constraints.gridx = 1;
        panel.add(imageLabel, constraints);

        constraints.gridy = 0;
        panel.add(titleLabel, constraints);

        constraints.gridy = 2;
        panel.add(cancerButton, constraints);

        constraints.gridy = 3;
        panel.add(gasButton, constraints);

        constraints.gridy = 4;
        panel.add(biButton, constraints);

        constraints.gridy = 5;
        panel.add(curiosidadesButton, constraints);

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Centraliza a janela na tela
        frame.setVisible(true);
    }
}

