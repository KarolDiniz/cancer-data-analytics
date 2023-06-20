package cancer.data.analytics.cancerDataAnalytics.view;
public class ETLScreen extends AbstractScreen {
    public ETLScreen() {
        imageFiles = new String[] {
                "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\image.png",
                "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\image (1).png",
                "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\image (2).png",
                "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\image (3).png",
                "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\image (4).png"
        };
    }

    @Override
    protected String[] getImageFiles() {
        return imageFiles;
    }

    @Override
    protected String getTitle() {
        return "ETL Process";
    }
}