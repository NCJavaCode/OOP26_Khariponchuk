import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        App app = new App("Local AI Runner");

        System.out.println("Оберіть модель (1 - ChatGPT, 2 - Gemini):");
        int choice = scanner.nextInt();

        // Динамічний вибір об'єкта під час виконання
        if (choice == 1) {
            app.setModel(new ChatGptModel("ChatGPT-4o", 16, "high"));
        } else {
            app.setModel(new GeminiModel("Gemini 1.5 Pro", 12, true));
        }

        // Динамічний поліморфізм
        System.out.println("\nПідключено: " + app.getModel().getName());
        app.getModel().generateResponse("Поясни принципи ООП");

        // 1Статичний поліморфізм (перевантаження, якщо вибрано ChatGPT)
        if (app.getModel() instanceof ChatGptModel) {
            ChatGptModel chatGpt = (ChatGptModel) app.getModel();
            chatGpt.generateResponse("Одеса в стилі Кіберпанк", 2);
        }

        scanner.close();
    }
}