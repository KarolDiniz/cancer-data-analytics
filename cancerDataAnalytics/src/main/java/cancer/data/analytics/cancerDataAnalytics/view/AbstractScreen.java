package cancer.data.analytics.cancerDataAnalytics.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractScreen {
    protected static int currentIndex = 0;
    protected static String[] imageFiles;

    protected abstract String[] getImageFiles();
    protected abstract String getTitle();

    protected void showScreen() {
        JFrame frame = new JFrame(getTitle());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel imagePanel = new JPanel(new FlowLayout());
        JLabel imageLabel = new JLabel();
        imagePanel.add(imageLabel);
        imagePanel.setBackground(Color.WHITE);

        Color buttonColor = new Color(215, 104, 104); // Cor azul escuro
        Color textColor = Color.WHITE;

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.WHITE);

        JButton previousButton = new JButton("Anterior");
        previousButton.setBackground(buttonColor);
        previousButton.setForeground(textColor);

        JButton nextButton = new JButton("Próximo");
        nextButton.setBackground(buttonColor);
        nextButton.setForeground(textColor);
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

        showImage(imageLabel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void showImage(JLabel imageLabel) {
        String imagePath = imageFiles[currentIndex];
        ImageIcon imageIcon = new ImageIcon(imagePath);
        imageLabel.setIcon(imageIcon);
    }
}
