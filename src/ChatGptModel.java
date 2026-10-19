public class ChatGptModel extends AbstractAiModel implements Nameable, Clearable { // імплементував 2 інтерфейси
    private String modeOfReasoning; // низький, середній, високий
    private String className;

    public ChatGptModel(String name, int ramUsage, String modeOfReasoning) {
        super(name, ramUsage);
        this.modeOfReasoning = modeOfReasoning;
        setClassName("ChatGptModel");
    }

    public String getModeOfReasoning() {
        return modeOfReasoning;
    }

    @Override
    public void setClassName(String name) {
        this.className = name;
    }

    @Override
    public String getClassName() {
        return className;
    }
    // додав через інтерфейс метод очищення чату для звичайного користувача
    @Override
    public void clearChat() {
        System.out.println("ChatGPT: чат очищено.");
    }

    @Override
    public void generateResponse(String prompt) {
        System.out.println("ChatGPT [Astra]: генерую відповідь на:" + prompt);
    }

    // 2 Перевантаження. Генерація зображень (додався int imageCount)
    public void generateResponse(String prompt, int imageCount) {
        System.out.println("ChatGPT [DALL-E]: генерую " + imageCount + " зображ. за описом: " + prompt);
    }

    // 3 Перевантаження. Генерація відео (той самий метод, але інші параметри)
    public void generateResponse(String prompt, String quality, int durationSeconds) {
        System.out.println("ChatGPT [Sora]: генерую відео (" + quality + ", " + durationSeconds + " сек) за запитом: " + prompt);
    }
}