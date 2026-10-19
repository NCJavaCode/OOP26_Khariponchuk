public abstract class AbstractAiModel {
    private String name;
    private int ramUsage; // пам'ять у ГБ

    public AbstractAiModel(String name, int ramUsage) {
        this.name = name;
        setRamUsage(ramUsage); // запускаємо перевірку через сетер
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRamUsage() {
        return ramUsage;
    }

    // Твій контроль за зміною даних
    public void setRamUsage(int ramUsage) {
        if (ramUsage > 0) {
            this.ramUsage = ramUsage;
        } else {
            System.out.println("Помилка: пам'ять має бути більшою за 0 ГБ!");
        }
    }

    // Абстрактний метод
    public abstract void generateResponse(String prompt);
}