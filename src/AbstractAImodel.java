public abstract class AbstractAiModel {
    private String name;
    private int ramUsage;

    public AbstractAiModel(String name, int ramUsage) {
        this.name = name;
        this.ramUsage = ramUsage;
    }

    public String getName() {
        return name;
    }

    public int getRamUsage() {
        return ramUsage;
    }

    // Абстрактний метод
    public abstract void generateResponse(String prompt);
}