public class App {
    private String appName;
    private AiModel currentModel;

    public App(String appName) {
        this.appName = appName;
    }

    public void setModel(AiModel model) {
        this.currentModel = model;
    }

    public AiModel getModel() {
        return currentModel;
    }

    public static void main(String[] args) {
        App app = new App("Local AI Runner");
        AiModel model = new AiModel("Kimi", 8);

        app.setModel(model);
        System.out.println("Запущено додаток: " + app.appName);
        System.out.println("Обрана модель: " + app.getModel().getName() + " (" + app.getModel().getRamUsage() + " ГБ)");

        // Спроба ввести неправильні данні
        System.out.println("Спроба встановити некоректну пам'ять:");
        model.setRamUsage(-4);
    }
}