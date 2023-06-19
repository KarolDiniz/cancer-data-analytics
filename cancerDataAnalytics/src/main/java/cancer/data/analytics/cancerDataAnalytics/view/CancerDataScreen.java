package cancer.data.analytics.cancerDataAnalytics.view;
import javax.swing.*;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CancerDataScreen {
    public static void showCancerData() {
        JFrame frame = new JFrame("Dados de Câncer");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String csvFile = "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\cancer_data.csv"; // Substitua pelo caminho do seu arquivo CSV
        String line;
        String[] headers = null;
        Object[][] data = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(csvFile));
            headers = br.readLine().split(";"); // Lê a primeira linha do arquivo como cabeçalho
            int numCols = headers.length;
            int numRows = (int) br.lines().count() + 1; // Conta o número de linhas restantes e adiciona 1 para incluir o cabeçalho

            data = new Object[numRows][numCols];
            br.close();

            br = new BufferedReader(new FileReader(csvFile));
            br.readLine(); // Ignora o cabeçalho

            int row = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                data[row] = values;
                row++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        JTable table = new JTable(data, headers);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
