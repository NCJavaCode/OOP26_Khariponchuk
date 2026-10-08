public class App {
    private String appName;
    private AbstractAiModel currentModel;

    public App(String appName) {
        this.appName = appName;
    }

    public void setModel(AbstractAiModel model) {
        this.currentModel = model;
    }

    public AbstractAiModel getModel() {
        return currentModel;
    }

    public static void main(String[] args) {
        App app = new App("Local AI Runner");

        // Створюємо екземпляр ChatGPT з підтримкою перевантажених методів
        ChatGptModel chatGpt = new ChatGptModel("ChatGPT-4o", 16, "high");
        app.setModel(chatGpt);

        System.out.println("Запущено додаток: " + app.appName);
        System.out.println("Обрана модель: " + app.getModel().getName() + " (" + app.getModel().getRamUsage() + " ГБ)");

        // 1. Перевірка інкапсуляції (з минулої частини)
        System.out.println("\nСпроба встановити некоректну пам'ять:");
        chatGpt.setRamUsage(-4);

        // 2. Демонстрація поліморфізму
        System.out.println("\n=== Демонстрація статичного поліморфізму ===");

        // Виклик 1: генерація тексту (1 параметр)
        chatGpt.generateResponse("Поясни принципи ООП");

        // Виклик 2: генерація фото (2 параметри)
        chatGpt.generateResponse("Кіберпанк місто в неоні", 3);

        // Виклик 3: генерація відео (3 параметри)
        chatGpt.generateResponse("Політ над Марсом", "4K", 15);
    }
}