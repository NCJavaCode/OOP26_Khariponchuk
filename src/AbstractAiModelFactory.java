public class AbstractAiModelFactory {
    // Тут тримаємо один єдиний екземпляр фабрики на всю програму
    private static AbstractAiModelFactory instance;

    // Закриваємо конструктор, щоб не можна було зробити new AbstractAiModelFactory десь ще
    private AbstractAiModelFactory() {
    }

    // Створюємо один раз та далі повертаємо той самий об'єкт
    public static AbstractAiModelFactory getInstance() {
        if (instance == null) {
            instance = new AbstractAiModelFactory();
        }
        return instance;
    }

    // Отримуємо цифру від користувача, та повертаємо потрібну модель
    public AbstractAiModel createModel(int choice) {
        if (choice == 1) {
            return new ChatGptModel("ChatGPT-4o", 16, "high");
        } else {
            // У будь-якому іншому випадку видаємо Геміні(Хотів щоб тільки при виборі 2, але тоді компілятор не в захваті)
            return new GeminiModel("Gemini 1.5 Pro", 12, true);
        }
    }
}