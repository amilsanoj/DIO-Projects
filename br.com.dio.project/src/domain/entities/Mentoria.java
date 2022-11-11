package domain.entities;

import java.time.LocalDate;

public class Mentoria extends Atividades{
    private LocalDate data;

    public Mentoria(String title, String description, LocalDate data) {
        super(title, description);
        this.data = data;
    }

    @Override
    public Double xpCalculator() {
        return XP+20.0;
    }

    @Override
    public String toString() {
        return "\nMentoria: " + getTitle() + "\nDescrição: " + getDescription();
    }
}
