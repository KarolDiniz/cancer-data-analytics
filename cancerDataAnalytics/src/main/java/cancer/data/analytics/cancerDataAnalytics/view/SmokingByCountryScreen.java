package cancer.data.analytics.cancerDataAnalytics.view;

public class SmokingByCountryScreen extends DatabaseScreen {

    public static void showSmokingData() {
        GasDataScreen screen = new GasDataScreen();
        screen.csvFile = "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\csv\\media_todos_paises_consome_mais_cigarro.csv";
        screen.loadData();
        screen.createTable();
    }

    @Override
    protected String getTitle() {
        return "Average Smoking by Country database";
    }
}
