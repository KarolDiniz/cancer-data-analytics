package cancer.data.analytics.cancerDataAnalytics.view;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class GasDataScreen extends DatabaseScreen {

    public static void showGasData() {
        GasDataScreen screen = new GasDataScreen();
        screen.csvFile = "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\csv\\media_emissao_municipios.csv";
        screen.loadData();
        screen.createTable();
    }

    @Override
    protected String getTitle() {
        return "Emission gas database";
    }
}
