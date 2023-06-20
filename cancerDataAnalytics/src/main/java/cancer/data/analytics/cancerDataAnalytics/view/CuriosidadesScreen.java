package cancer.data.analytics.cancerDataAnalytics.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuriosidadesScreen {

    public static void showCuriosidades() {
        JFrame frame = new JFrame("Curiosidades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 400)); // Ajuste as dimensões conforme necessário
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        JButton curiosidade1Button = createButton("Principal Causa de morte", "No Brasil e no mundo, os tumores sólidos, como o\n" +
                "de pulmão, são os tipos mais incidentes e as principais\n" +
                "causas de morte por câncer em homens e mulheres, respectivamente (INSTITUTO NACIONAL DE CÂNCER JOSÉ\n" +
                "ALENCAR GOMES DA SILVA, 2015; TORRE et al., 2015;\n" +
                "WORLD HEALTH ORGANIZATION, 2017).");

        JButton curiosidade2Button = createButton("Agentes carcinogênicos com evidência", "Fuligem, radônio, radiação (raios-X e gama), gaseificação\n" +
                "do carvão, produção de coque, sílica cristalina, alcatrão\n" +
                "de carvão, produção de alumínio, fundição de ferro e aço,\n" +
                "exposição ocupacional como pintor, ocupação na produção\n" +
                "de borracha, mineração de hematita (subterrânea), arsênio\n" +
                "e compostos arsenicais, berílio e compostos de berílio,\n" +
                "cádmio e compostos de cádmio, cromo hexavalente e compostos, compostos de níquel, asbestos (todas as formas),\n" +
                "vapores de emissão de motores a diesel, bis(clorometil)eter,\n" +
                "clorometil-metil-éter, processo Acheson; poluição atmosférica; material particulado; sulfur mustard; fumos de solda");

        JButton curiosidade3Button = createButton("Poluentes primários", "Os poluentes primários\n" +
                "são aqueles lançados diretamente pelas fontes de emissão, como por exemplo o dióxido de enxofre (SO2), o\n" +
                "ácido sulfídrico (H2S), os óxidos de nitrogênio (NOx), a\n" +
                "amônia (NH3), o monóxido de carbono (CO), o dióxido\n" +
                "de carbono (CO2), o metano (CH4), a fuligem e aldeídos.");

        JButton curiosidade4Button = createButton("Efeitos do CO2", " As partículas mais finas do CO2 causam danos a parte interna do aparelho respiratório,\n" +
                "com os alvéolos pulmonares, brônquios, traquéia, faringe, laringe que elevam a\n" +
                "problemas mais severos como conseqüências, sendo o Câncer de Pulmão e\n" +
                "Pneumoconiose.\n");

        JButton curiosidade5Button = createButton("Efeito do tabagismo na saúde", "O tabagismo é um dos principais fatores de risco para doenças cardiovasculares, " +
                "como doenças cardíacas, derrames e aterosclerose. O consumo de tabaco está associado ao desenvolvimento de " +
                "hipertensão arterial, danos nas artérias, formação de coágulos sanguíneos e redução do fluxo sanguíneo para o coração.");

        JButton curiosidade6Button = createButton("Tabagismo e câncer de pulmão", "O câncer de pulmão é o tipo mais comum de câncer relacionado ao tabagismo. " +
                "A maioria dos casos de câncer de pulmão está associada ao hábito de fumar, e parar de fumar é a melhor " +
                "maneira de reduzir o risco de desenvolver essa doença.");

        JButton curiosidade7Button = createButton("----", "---");

        JButton curiosidade8Button = createButton("----", "---");

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(curiosidade1Button, gbc);

        gbc.gridy = 1;
        panel.add(curiosidade2Button, gbc);

        gbc.gridy = 2;
        panel.add(curiosidade3Button, gbc);

        gbc.gridy = 3;
        panel.add(curiosidade4Button, gbc);

        gbc.gridy = 4;
        panel.add(curiosidade5Button, gbc);

        gbc.gridy = 5;
        panel.add(curiosidade6Button, gbc);

        gbc.gridy = 6;
        panel.add(curiosidade7Button, gbc);

        gbc.gridy = 7;
        panel.add(curiosidade8Button, gbc);

        frame.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JButton createButton(String text, final String message) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(250, 30));

        button.setBackground(new Color(215, 104, 104));
        button.setForeground(Color.WHITE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, message);
            }
        });

        return button;
    }
}