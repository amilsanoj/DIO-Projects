package domain.entities;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Atividades> contents = new LinkedHashSet<>();
    private Set<Atividades> finishContents = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public void insertBootcamp(Bootcamp bp){
        this.contents.addAll(bp.getContents());
        bp.getDevs().add(this);
    }

    public void progredir() {
        Optional<Atividades> content = this.contents.stream().findFirst();
        if(content.isPresent()) {
            this.finishContents.add(content.get());
            this.contents.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public Double totalX() {
        return this.finishContents
                .stream()
                .mapToDouble(Atividades::xpCalculator)
                .sum();
    }

    public String getName() {
        return name;
    }

    public Set<Atividades> getContents() {
        return contents;
    }

    public Set<Atividades> getFinishContents() {
        return finishContents;
    }
}
