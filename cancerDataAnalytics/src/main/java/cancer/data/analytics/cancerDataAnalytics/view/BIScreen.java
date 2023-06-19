package cancer.data.analytics.cancerDataAnalytics.view;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class BIScreen {
    private static int currentIndex = 0;
    private static String[] imageFiles = { "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\CancerPulmao.jpg", "image2.jpg", "image3.jpg" }; // Nomes dos arquivos de imagem

    public static void showBI() {
        JFrame frame = new JFrame("Business Intelligence");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel imagePanel = new JPanel(new FlowLayout());
        JLabel imageLabel = new JLabel();
        imagePanel.add(imageLabel);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton previousButton = new JButton("Anterior");
        JButton nextButton = new JButton("Próximo");

        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex--;
                if (currentIndex < 0)
                    currentIndex = imageFiles.length - 1;
                showImage(imageLabel);
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentIndex++;
                if (currentIndex >= imageFiles.length)
                    currentIndex = 0;
                showImage(imageLabel);
            }
        });

        buttonPanel.add(previousButton);
        buttonPanel.add(nextButton);

        frame.add(imagePanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        showImage(imageLabel); // Exibe a primeira imagem

        frame.pack();
        frame.setVisible(true);
    }

    private static void showImage(JLabel imageLabel) {
        String imagePath = imageFiles[currentIndex];
        ImageIcon imageIcon = new ImageIcon(imagePath);
        imageLabel.setIcon(imageIcon);
    }
}

