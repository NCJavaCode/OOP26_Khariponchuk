import java.util.Scanner;

public class App {
    private String appName;
    private AbstractAiModel currentModel;
    // Додав фабрику
    private AbstractAiModelFactory abstractAiModelFactory;

    public App(String appName, AbstractAiModelFactory abstractAiModelFactory) {
        this.appName = appName;
        this.abstractAiModelFactory = abstractAiModelFactory;
    }

    public void setModel(AbstractAiModel model) {
        this.currentModel = model;
    }

    public AbstractAiModel getModel() {
        return currentModel;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // C1творюємо фабрику
        AbstractAiModelFactory factory = new AbstractAiModelFactory();
        App app = new App("Local AI Runner", factory);

        System.out.println("Оберіть модель (1 - ChatGPT, 2 - Gemini):");
        int choice = scanner.nextInt();

        // Динамічний вибір об'єкта під час виконання
        // замість if-else з new просто просимо фабрику зібрати модель за номером
        AbstractAiModel model = factory.createModel(choice);
        app.setModel(model);

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