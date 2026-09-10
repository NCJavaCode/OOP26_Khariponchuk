public class AiModel {
    private String name;
    private int ramUsage; // пам'ять у ГБ

    public AiModel(String name, int ramUsage) {
        this.name = name;
        setRamUsage(ramUsage);
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

    // Контроль за зміною даних: не можна встановити 0 або мінус
    public void setRamUsage(int ramUsage) {
        if (ramUsage > 0) {
            this.ramUsage = ramUsage;
        } else {
            System.out.println("Помилка: пам'ять має бути більшою за 0 ГБ!");
        }
    }
}
