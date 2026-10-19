public class GeminiModel extends AbstractAiModel {
    private boolean isMultimodal; // підтримка аудіо/відео/зображень одразу

    public GeminiModel(String name, int ramUsage, boolean isMultimodal) {
        super(name, ramUsage);
        this.isMultimodal = isMultimodal;
    }

    public boolean isMultimodal() {
        return isMultimodal;
    }

    @Override
    public void generateResponse(String prompt) {
        System.out.println("Gemini [мультимодальність: " + isMultimodal + "] опрацьовує запит: " + prompt);
        System.out.println("Відповідь: проаналізовано текст і вхідні медіафайли.");
    }
}