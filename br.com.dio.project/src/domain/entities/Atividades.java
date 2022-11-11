package domain.entities;

public abstract class Atividades {
    private String title;
    private String description;
    public final Double XP = 10.0;

    public abstract Double xpCalculator();

    public Atividades(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}
