package cancer.data.analytics.cancerDataAnalytics.view;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GasDataScreen {
    public static void showGasData() {
        JFrame frame = new JFrame("Dados de Emissão de Gases");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String csvFile = "gas_data.csv"; // Nome do arquivo CSV com os dados
        String line;
        String[] headers = null;
        String[][] data = null;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(csvFile));
            headers = br.readLine().split(","); // Lê a primeira linha do arquivo como cabeçalho
            int numRows = (int) br.lines().count(); // Conta o número de linhas restantes

            data = new String[numRows][headers.length];
            br.close();

            br = new BufferedReader(new FileReader(csvFile));
            br.readLine(); // Ignora o cabeçalho

            int row = 0;
            while ((line = br.readLine()) != null) {
                data[row] = line.split(",");
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
        frame.getContentPane().add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
