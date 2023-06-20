package cancer.data.analytics.cancerDataAnalytics.view;


public class BIScreen extends AbstractScreen {
    public BIScreen() {
        imageFiles = new String[] {
                "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\municipiosComMaiorMortalidadePorFaixaEtaria.png",
                "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\rankingEmissão.png",
                "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\tabagismoTaxa.png",
                "C:\\Users\\carlo\\IdeaProjects\\cancer-data-analytics\\cancerDataAnalytics\\src\\main\\java\\cancer\\data\\analytics\\cancerDataAnalytics\\view\\img\\maioresTaxasTabagismo.png"
        };
    }

    @Override
    protected String[] getImageFiles() {
        return imageFiles;
    }

    @Override
    protected String getTitle() {
        return "Business Intelligence";
    }
}
