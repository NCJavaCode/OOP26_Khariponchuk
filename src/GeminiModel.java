public class GeminiModel extends AbstractAiModel implements Nameable, Clearable { // сюди теє імпементував 2 інтерфейси
    private boolean isMultimodal; // підтримка аудіо/відео/зображень одразу
    private String className;

    public GeminiModel(String name, int ramUsage, boolean isMultimodal) {
        super(name, ramUsage);
        this.isMultimodal = isMultimodal;
        setClassName("GeminiModel");
    }

    public boolean isMultimodal() {
        return isMultimodal;
    }

    @Override
    public void setClassName(String name) {
        this.className = name;
    }

    @Override
    public String getClassName() {
        return className;
    }
    // Власний метод, очищення чату
    @Override
    public void clearChat() {
        System.out.println("Gemini: чат очищено.");
    }

    @Override
    public void generateResponse(String prompt) {
        System.out.println("Gemini [мультимодальність: " + isMultimodal + "] опрацьовує запит: " + prompt);
        System.out.println("Відповідь: проаналізовано текст і вхідні медіафайли.");
    }
}