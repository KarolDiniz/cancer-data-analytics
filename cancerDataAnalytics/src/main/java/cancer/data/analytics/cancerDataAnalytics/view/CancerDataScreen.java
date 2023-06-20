package cancer.data.analytics.cancerDataAnalytics.view;

public class CancerDataScreen extends DatabaseScreen {
    public static void showCancerData() {
        CancerDataScreen screen = new CancerDataScreen();
        screen.csvFile = "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\csv\\cancer_data.csv";
        screen.loadData();
        screen.createTable();
    }

    @Override
    protected String getTitle() {
        return "Cancer database";
    }
}
