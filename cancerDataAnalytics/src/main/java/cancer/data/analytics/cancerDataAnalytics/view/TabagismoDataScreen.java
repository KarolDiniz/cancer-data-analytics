package cancer.data.analytics.cancerDataAnalytics.view;
public class TabagismoDataScreen extends DatabaseScreen {
    public static void showTabagismoData() {
        TabagismoDataScreen screen = new TabagismoDataScreen();
        screen.csvFile = "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\csv\\media_mortes_por_faixa_cigarro.csv";
        screen.loadData();
        screen.createTable();
    }

    @Override
    protected String getTitle() {
        return "Tabagismo database";
    }
}
