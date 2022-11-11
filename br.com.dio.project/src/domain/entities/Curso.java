package domain.entities;

public class Curso extends Atividades{
    private Integer hours;

    public Curso(String title, String description, Integer hours) {
        super(title, description);
        this.hours = hours;
    }

    @Override
    public Double xpCalculator() {
        return XP*hours;
    }

    public Integer getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "\nCurso: " + getTitle() + "\nDescrição: " + getDescription() + "\nCarga Horária: " + getHours();
    }
}
